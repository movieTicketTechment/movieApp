import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CgguardService } from '../Services/cgguard.service';
import { User } from '../Model/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  login:User= new User();

  // users:Login[]=[];

  // login:User= new User();
  role:string = "";
  userName:string = "";

  constructor(private router: Router,private cgService:CgguardService) { }

  ngOnInit(): void {
   
    
  }

  doLogin()
  {  
    console.log("login: "+this.login)
    this.cgService.logined(this.login.userName, this.login.userPassword).subscribe(data=>{
      console.log("data: "+data);
    
     this.role = JSON.parse(data).role;
     console.log("after parsing: ",JSON.parse(data))
     this.userName = JSON.parse(data).userName;

     console.log("this.role: "+this.role);
     console.log("this.userName: "+this.userName);

     if(this.role == "subAdmin"){

      console.log("theatre admin dashboard");
      
       this.router.navigate(["/TheatreDashboard"]);
       localStorage.setItem("TheatreEmail",this.login.userEmail);
       localStorage.setItem("TheatreAdminName",this.userName);     
       localStorage.setItem("TheatreRole",this.role);
 
    }
    else if(this.role == "admin"){
      console.log("super admin dashboard");
      this.router.navigate(["/SuperDashboard"]);
       localStorage.setItem("SuperAdminEmail",this.login.userEmail);     
       localStorage.setItem("SuperAdminRole",this.role);
       localStorage.setItem("SuperAdminName",this.userName);  
    }
       
        
      localStorage.setItem("email",this.login.userEmail);
      localStorage.setItem("upass",this.login.userPassword); 
      localStorage.setItem("urole",this.role);
 

    },error=>
    {
      alert("error occured");
      console.log("error in login time" + error);
    })

  
  
  }
    

}
