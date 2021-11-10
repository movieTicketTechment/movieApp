import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { GoogleLoginProvider, SocialAuthService, SocialUser } from 'angularx-social-login';
import { SocialLocal } from 'src/app/Model/Users/social-local';
import { AuthServiceService } from 'src/app/Services/Authenticate/auth-service.service';
import { CggaurdServiceService } from 'src/app/Services/Cggraurd/cggaurd-service.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {

  socialUser!: SocialUser;
  socialLocal!: SocialLocal;
  socialUserFound = true;
  loginBool = false;
  city=[ { id: '1', name: 'Bhilai' },
  { id: '2', name: 'Durg' },
  { id: '3', name: 'Raipur' },
  { id: '4', name: 'Bilaspur' }];
  selectedCity: string = '';

  userCredLocal: any;


  constructor(private router: Router, private socialAuthService: SocialAuthService, private _authService: AuthServiceService, private use: CggaurdServiceService) { }

  ngOnInit(): void {
    this.userCredLocal = localStorage.getItem("userCred");
    this.userCredLocal = JSON.parse(this.userCredLocal);
    if (this.userCredLocal != null) {

      this.socialUserFound = false;
      this.loginBool = true

      this.socialLocal = this.userCredLocal;
      

    }





    this.socialAuthService.authState.subscribe((data) => {
      this.socialUser = data;


      console.log(this.userCredLocal)



    })

  }

  signInWithGoogle(): any {
    this.socialAuthService.signIn(GoogleLoginProvider.PROVIDER_ID)
    this.socialUserFound = false;
  }

  signOut(): any {
    this.socialAuthService.signOut();
    this.socialUserFound = true;
  }

  signLocalOut(){
    localStorage.removeItem("userCred");
    this.router.navigate(["/home"])
  }

  selectChangeHandler (event: any) {
    this.selectedCity= event.target.value;
    localStorage.setItem("selectedCity",this.selectedCity)
    alert(this.selectedCity)
  }


}
