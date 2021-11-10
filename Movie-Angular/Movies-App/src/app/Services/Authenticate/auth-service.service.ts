import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  constructor(private router:Router, private http:HttpClient){}

  // googleSignIn(idToken){
  //   return this.http.post(`https://securetoken.googleapis.com/v1/token?key=
  //   AIzaSyBT4rpGkZOosyBkt3SMXFiWUdMWJ9zaM4k`,
  //   {
  //     postBody: `id_token=[${idToken}]&providerId=google.com`,
  //     requestUri:["http://localhost:4200"],
  //     returnIdpCredential:true,
  //      returnSecureToken:true
  //   })
  
  // }
  
  
}

