import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ShowMovieService {

  constructor(private router:Router, private http:HttpClient){}

  
  url:string = `http://localhost:8088/`;

  getShowDetail(id:number,theatreCity:string, showDate:any):Observable<any>
 {
  
   let urlFor = this.url + `show/viewAllShowMovieTheatre/${id}/${theatreCity}/${showDate}`
    return this.http.get(urlFor);
}
}
