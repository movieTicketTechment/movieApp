import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Model/user';
import { UsersService } from 'src/app/Services/users.service';

@Component({
  selector: 'app-add-sub-admin',
  templateUrl: './add-sub-admin.component.html',
  styleUrls: ['./add-sub-admin.component.css']
})
export class AddSubAdminComponent implements OnInit {

  user:User= new User();
  constructor(private userService:UsersService) { }

  ngOnInit(): void {
  }

createSubAdmin(){

  this.userService.createSubAdmin(this.user).subscribe(data=>{
      alert("Sub Admin added");
    },
    error=>
    {
      console.log("error occured",error);
    }
  );
}

}
