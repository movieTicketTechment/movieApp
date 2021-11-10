import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Screen } from 'src/app/Model/screen';

@Injectable({
  providedIn: 'root'
})
export class ScreenService {

  constructor(private http:HttpClient) { }

  viewAllScreen():Observable<any>
  { 
    let url="http://localhost:8088/screen/viewMappedData/";
    return this.http.get(url);
  }
  createNewScreen(nscreen:Screen):Observable<any>{
  
    let url = `http://localhost:8088/screen/addNewScreen`;
    
         return this.http.post(url,nscreen,{responseType:'text'});;
    
    
      }
  
      viewAllTheatres():Observable<any> {
  
        let url = `http://localhost:8088/theatre/viewAllTheatre`;
        return this.http.get(url);
      }
      createNewSeat(seat:any):Observable<any>{
  
        let url = `http://localhost:8088/seat/addNewSeat`;
        
             return this.http.post(url,seat,{responseType:'text'});;
        
        
          }
          updateScreenDetail(id:number,nscreen:Screen):Observable<any>{
  
            let url = `http://localhost:8088/screen/updateValues/${id}`;
            return this.http.put(url,nscreen,{responseType:'text'});
  
          }
          getScreenById(id:number):Observable<any>
          {
            let url = `http://localhost:8088/screen/viewScreenById/${id}`;
            return this.http.get(url);
          }
            
}
