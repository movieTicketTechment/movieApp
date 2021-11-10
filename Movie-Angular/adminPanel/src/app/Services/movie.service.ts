import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie } from '../Model/movie';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor(private http:HttpClient) { }

  getAllMovies():Observable<any> {

    let url = `http://localhost:8088/movies/viewAllMovies`;
    return this.http.get(url);
  }


  createNewMovie(movie:Movie):Observable<any>{

    let url = `http://localhost:8088/movies/addNewMovie`;
     return this.http.post(url,movie,{responseType:'text'});
  }

  updateMovie(id:number,movie:Movie):Observable<any>{

    let url = `http://localhost:8088/movies/updateValues/${id}`;
    
         return this.http.put(url,movie,{responseType:'text'});;
   
    
      }
      deleteMovie(id:number):Observable<any>{

        let url = `http://localhost:8088/movies/deleteMovie/${id}`;
        
             return this.http.delete(url);
       }
}
