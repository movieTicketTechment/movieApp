import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Model/user';
import { UsersService } from 'src/app/Services/users.service';

@Component({
  selector: 'app-adminusers',
  templateUrl: './adminusers.component.html',
  styleUrls: ['./adminusers.component.css']
})
export class AdminusersComponent implements OnInit {

  users:User[]=[];
  constructor(private userService:UsersService,private router:Router) { }

  ngOnInit(): void {

    this.userService.viewAllUserByRole("user").subscribe(data=>{
      console.log("data: ",data);
      this.users=data;

    },
    error=>{
console.log("error",error);
    })

  }


  addUser(){

    this.router.navigateByUrl("SuperDashboard/addUser");
  }


}
