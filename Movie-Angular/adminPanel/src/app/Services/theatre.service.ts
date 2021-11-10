import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Theatre } from '../Model/theatre';

@Injectable({
  providedIn: 'root'
})
export class TheatreService {
  

  constructor(private http:HttpClient) { }

  getAllTheatres():Observable<any> {

    let url = `http://localhost:8088/theatre/viewAllTheatre`;
    return this.http.get(url);
  }


  createNewtheatre(theatre:Theatre):Observable<any>{

let url = `http://localhost:8088/theatre/addNewTheatre`;

     return this.http.post(url,theatre,{responseType:'text'});;


  }
  getAllTheatresById(id:number):Observable<any> {

    let url = `http://localhost:8088/theatre/viewTheatreById/${id}`;
    return this.http.get(url);
  }
  updateTheatre(id:number,theatre:Theatre):Observable<any>{

    let url = `http://localhost:8088/theatre/updateInShow/${id}`;
    
         return this.http.put(url,theatre,{responseType:'text'});;
   
    
      }
      deleteTheatre(id:number):Observable<any>{

        let url = `http://localhost:8088/theatre/deleteTheatre/${id}`;
        
             return this.http.delete(url);
       }
       getSubAdminList():Observable<any>
       {
         let url = "http://localhost:8088/mainPanel/viewAllUserByRole/subAdmin";
         return this.http.get(url);
       }
}
