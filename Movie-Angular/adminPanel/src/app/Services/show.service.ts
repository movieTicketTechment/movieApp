import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Show } from '../Model/show';

@Injectable({
  providedIn: 'root'
})
export class ShowService {

  constructor(private http:HttpClient) { }

  getAllShows():Observable<any> {

    let url = `http://localhost:8088/show/viewAllShowMovieTheatre`;
    return this.http.get(url);
  }

  createNewShow(show:Show):Observable<any>{

    let url = `http://localhost:8088/show/addNewShow`;
    
         return this.http.post(url,show,{responseType:'text'});
    
    
      }

      getAllMovie():Observable<any> {

        let url = " http://localhost:8088/movies/viewAllMovies";
        return this.http.get(url);
      }
      getAllMovieById(id:number):Observable<any> {

        let url = ` http://localhost:8088/movies/viewMovieById/${id}`;
        return this.http.get(url);
      }
      getAllScreenById(id:number):Observable<any> {

        let url = ` http://localhost:8088/screen/viewScreenById/${id}`;
        return this.http.get(url);
      }
      getAllScreen():Observable<any> {

        let url = " http://localhost:8088/screen/viewAllScreens";
        return this.http.get(url);
      }
      getAllTheatre():Observable<any> {

        let url = " http://localhost:8088/theatre/viewAllTheatre";
        return this.http.get(url);
      }
      getAllTheatreById(id:number):Observable<any> {

        let url = ` http://localhost:8088/theatre/viewTheatreById/${id}`;
        return this.http.get(url);
      }

      updateShow(id:number,show:Show):Observable<any>{

        let url = `http://localhost:8088/show/updateInShow/${id}`;
        
             return this.http.put(url,show,{responseType:'text'});;
       
        
          }
          deleteShow(id:number):Observable<any>{
    
            let url = `http://localhost:8088/show/deleteShow/${id}`;
            
                 return this.http.delete(url);
           }
           
}
