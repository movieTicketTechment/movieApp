import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Model/user';
import { UsersService } from 'src/app/Services/users.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {


  user:User= new User();
  constructor(private userService:UsersService) { }

  ngOnInit(): void {
  }

createUser(){

  this.userService.createUser(this.user).subscribe(data=>{
      alert("user added");
    },
    error=>
    {
      console.log("error occured",error);
    }
  );
}

}
