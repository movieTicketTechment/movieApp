import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserRegistration } from 'src/app/Model/Users/user-registration';
import { CggaurdServiceService } from 'src/app/Services/Cggraurd/cggaurd-service.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
  userRegistration:UserRegistration= new UserRegistration();

  constructor(private router:Router, private use:CggaurdServiceService) { }
 
  ngOnInit(): void {


  }

  CreateUser(){
    console.log(this.userRegistration)

    this.use.addUser(this.userRegistration).subscribe(data=>{
      this.userRegistration = data;
      alert("added");
      console.log(this.userRegistration);
      this.router.navigate(["/login"]);
    },error=>{
      console.log(error);
    })
    
  }

}
