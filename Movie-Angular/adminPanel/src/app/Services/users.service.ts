import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { User } from '../Model/user';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private router:Router, private http:HttpClient) { }

  viewAllUserByRole(role:string):Observable<any>{
    console.log(role);
    let url = `http://localhost:8088/mainPanel/viewAllUserByRole//${role}`;
 
    return this.http.get(url);
   }
 
   

   createUser(user:User):Observable<any>{
    let url = `http://localhost:8088/mainPanel/addNewUser`;
    return this.http.post(url,user,{responseType:'text'});;
   }

   createSubAdmin(user:User):Observable<any>{
    let url = `http://localhost:8088/mainPanel/addNewSAdmin`;
    return this.http.post(url,user,{responseType:'text'});;
   }

}
