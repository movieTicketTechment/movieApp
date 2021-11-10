import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Model/user';
import { UsersService } from 'src/app/Services/users.service';

@Component({
  selector: 'app-view-sub-admins',
  templateUrl: './view-sub-admins.component.html',
  styleUrls: ['./view-sub-admins.component.css']
})
export class ViewSubAdminsComponent implements OnInit {

  subAdmins:User[]=[];
  constructor(private userService:UsersService,private router:Router) { }

  ngOnInit(): void {

    this.userService.viewAllUserByRole("subAdmin").subscribe(data=>{
      console.log("data: ",data);
      this.subAdmins=data;

    },
    error=>{
console.log("error",error);
    })

  }


  addSubAdmin(){

    this.router.navigateByUrl("SuperDashboard/addSubAmin");
  }

}
