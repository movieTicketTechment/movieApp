import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {

  book_Refrence!:any;

  url:string = `http://localhost:8088/`;

  constructor(private router:Router, private http:HttpClient){}


  // ========screen table api=====
  getSeatLayOut(id:number):Observable<any>
  {
   
    let urlFor = this.url +  `/screen/viewScreenById/${id}`
     return this.http.get(urlFor);
 }


//======  booking table api call==========
  setBookingSeatNumber(seatNum:any){


    let urlFor = this.url +  `/ticketBooking/addNewTicketBooking`

    return this.http.post(urlFor, seatNum,  {responseType: 'text'})
    
  }

  getBookingDetails(summa:any){
    let urlFor = this.url +  `/ticketBooking/viewByBookingRef/${summa}`

    return this.http.get(urlFor)
  }

  getAllBookingDetails(){
    let urlFor = this.url + `/ticketBooking/viewAllTicketBooking`
    return this.http.get(urlFor)
  }

  getBookingDetailByShowId(id:number):Observable<any>
{
 
  let urlFor = this.url + `ticketBooking/viewAllTicketBookingByShowId/${id}`
   return this.http.get(urlFor);

}

  updateTicketBooking(bookRefer:any):Observable<any>
{
 
  let urlFor = this.url + `ticketBooking/updateBooking/${bookRefer}`
   return this.http.put(urlFor,  {responseType: 'text'});

}

  // =======payment======
  startPayment(pay:any){


    let urlFor = this.url +  `/payment/addNewPayment`

    return this.http.post(urlFor, pay,  {responseType: 'text'})
    
  }

  createPayment(pay:any){


    let urlFor = this.url +  `/payment/creatingOrder`

    return this.http.post(urlFor, pay,  {responseType: 'text'})
    
  }

}
