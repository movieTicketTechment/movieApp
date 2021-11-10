import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HomeScreenService {

  constructor(private router:Router, private http:HttpClient){}

  
  url:string = `http://localhost:8088/`;
  id!:any;

  // ========screen table api=====
  getHeroHome():Observable<any>
  {
   
    let urlFor = this.url + `movies/viewAllMoviesWithBanner`
     return this.http.get(urlFor);
 }

  getHeroHomeById(id:number):Observable<any>
  {
   
    let urlFor = this.url + `movies/viewMovieById/{id}`
     return this.http.get(urlFor);
 }


}
