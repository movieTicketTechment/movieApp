import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from 'src/app/Model/Users/login';
import { CggaurdServiceService } from 'src/app/Services/Cggraurd/cggaurd-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  login:Login= new Login();
  role:string = "";


  constructor(private router:Router, private use:CggaurdServiceService) { }
 
  ngOnInit(): void {
     
  

  }


  doLogin()
  {  
    console.log(this.login)
    this.use.logined(this.login.userName, this.login.userPassword).subscribe(data=>{
   

      window.history.go(-1)
  
      
      //  this.router.navigate([""]);
    
    
        
      localStorage.setItem("userCred", data);
      // localStorage.setItem("upass",this.login.userPassword); 

 

    },error=>
    {
      alert("Invalid Credentials");
      console.log("error in login time" + error);
    })

  
  
  }
}
