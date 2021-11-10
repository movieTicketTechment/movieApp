import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PhotosService {

  constructor(private http:HttpClient) { }

  getPhotoById(id:String):Observable<any> {

    let url = `http://localhost:8088/photos/${id}`;
    return this.http.get(url);
  }

}
