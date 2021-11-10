import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CgguardService {

  constructor(private router:Router, private http:HttpClient) { }

 
  getUser():Observable<any>
  {
    let url = `http://localhost:8088/mainPanel/viewAllUser`;
   
     return this.http.get(url);
 }

  
  


 logined(uName:string, uPassword:string):Observable<any>{
 
  let url = `http://localhost:8088/mainPanel/login/${uName}/${uPassword}`;

  return this.http.get(url, {responseType:'text'});
 }


 canActivate(route: import("@angular/router").ActivatedRouteSnapshot, state: import("@angular/router").RouterStateSnapshot): boolean | import("@angular/router").UrlTree | import("rxjs").Observable<boolean | import("@angular/router").UrlTree> | Promise<boolean | import("@angular/router").UrlTree> {
  if(localStorage.getItem("userCred")!=null )
  {
     return true;
  }
  else
  {
     this.router.navigateByUrl('login');
     return false;
  }
}
}




 
 
