import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CggaurdServiceService } from './Services/Cggraurd/cggaurd-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Movies-App';

  
  
  uName:any
  uPass:any

  constructor(private router:Router, private use:CggaurdServiceService) { }

  ngOnInit(): void {
    
  // this.uName =   localStorage.getItem("uname");
  // this.uPass = localStorage.getItem("upass");

  //   this.use.logined(this.uName, this.uPass).subscribe(data=>{
      
      
  //     //  this.router.navigate([""]);
  //     console.log("hello")
  //   },error=>
  //   {
  //     alert("Invalid Credentials");
  //     console.log("error in login time" + error);
  //   })

  }
}