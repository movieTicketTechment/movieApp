import { Component, OnInit } from '@angular/core';
import { TicketBooking } from 'src/app/Model/Seat/ticket-booking';
import { UserserviceService } from 'src/app/Services/User/userservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-seat-layout',
  templateUrl: './seat-layout.component.html',
  styleUrls: ['./seat-layout.component.css']
})
export class SeatLayoutComponent implements OnInit {

  row!: Number;
  col!: Number;
  rowTable!: any;
  colTable!: any;
  alphaTable!: any;
  seatArr: any = [];
  seatNum!: string;
  flag = 0;
  totalPriceSeat!: Number;
  seatLayOut!: any;
  ticketBooking: TicketBooking = new TicketBooking();
  book_Ref!: any;
  bookingAllDetails!: any;
  reservedSeatId!:any;
  seatIdArr: any = [];
  showId:any = localStorage.getItem("showId");
  screenId:any = localStorage.getItem("screenId");
  userCred:any = localStorage.getItem("userCred");

  constructor(private router: Router, private backEndSeat: UserserviceService) { }

  ngOnInit(): void {

    this.backEndSeat.getSeatLayOut(this.screenId).subscribe(data => {
      this.seatLayOut = data;

      this.row = this.seatLayOut.screenRows;
      this.col = this.seatLayOut.screenColumns;

      // ========  gen table=======
      this.rowTable = Array(Number(this.row)).fill(0).map((x, i) => i);
      this.colTable = Array(Number(this.col)).fill(0).map((x, i) => i);
      this.alphaTable = Array(Number(this.row)).fill(0).map((x, i) => String.fromCharCode(65 + i));

    }, error => {
      console.log(error);
    })



    //======= view all ==========


    this.backEndSeat.getBookingDetailByShowId(this.showId).subscribe(data => {
      this.bookingAllDetails = data;
      console.log(data)
      for (let i = 0; i < this.bookingAllDetails.length; i++) {
        // console.log(this.bookingAllDetails[i].seatIds)
        let strrSeatIds = this.bookingAllDetails[i].seatIds;
        let seatArr = strrSeatIds.split(",");

        for (let j = 0; j < seatArr.length; j++) {
          this.seatIdArr.push(seatArr[j])

        }

      }   


      console.log(this.seatIdArr)
      for (let i = 0; i < this.seatIdArr.length; i++) {

       let aId =  this.seatIdArr[i][0].charCodeAt()-65
        // let alpha = "seat" + aId + this.seatIdArr[i][1]
        let alpha = "seat" + aId +  this.seatIdArr[i].slice(1);
        // console.log(alpha)
        let elem = document.getElementById(alpha);
      
        elem!.classList.add('disable');
        elem!. classList. remove('seat');



    }
    })




  }




  // ==========onClick of seat booking ===========
  seatBooked(r: any, c: any) {

    let alpha = "seat" + r.toString() + c
    let elem = document.getElementById(alpha);




    this.seatNum = String.fromCharCode(65 + r) + c;
    // console.log("this is seat num", this.seatNum);

    if (this.seatArr.length == 0) {
      elem!.style.background = `linear-gradient(0deg,#ffce26,#ffce26,#ffce26,#ff0)`;
      this.seatArr.push(this.seatNum);
      this.check();

      // console.log(this.seatArr);
      return;

    }
    // console.log("heelo")
    if (this.seatArr.length != 0) {
      for (let i = 0; i < this.seatArr.length; i++) {
        this.flag = 0;

        if (this.seatArr[i] == this.seatNum) {
          elem!.style.background = ` linear-gradient(0deg,#c5c5c5,#c5c5c5,#c5c5c5,#c5c5c5,#c5c5c5,#eee,#fff)`
          this.seatArr.splice(i, 1);
          this.check();
          console.log(this.seatArr, "after splice");
          this.flag = 1;
          break;
        }

      }
      if (this.flag == 0) {
        elem!.style.background = ` linear-gradient(0deg,#ffce26,#ffce26,#ffce26,#ff0)`;
        this.seatArr.push(this.seatNum);
        this.check();
        // console.log(this.seatArr)
        return;
      }
    }



  }


  check() {
    if (this.seatArr.length == 0) {
      document.getElementById("popScreenHide")!.style.display = "none";
      this.totalPriceSeat = this.seatArr.length * 200;
      // console.log("yes")
    }
    else if (this.seatArr.length != 0) {
      // console.log("no")
      this.totalPriceSeat = this.seatArr.length * 200;
      document.getElementById("popScreenHide")!.style.display = "block";
    }

  }



  // =========== BackENd things =======
  insertSeat() {
    // console.log(this.ticketBooking)
    this.ticketBooking.seatIds = this.seatArr.join();
    this.ticketBooking.totalPrice = this.totalPriceSeat;
    this.ticketBooking.bookingStatus = "pending";
    this.ticketBooking.showId= this.showId;
    this.ticketBooking.userId = this.userCred.userId;


    var d = new Date();

    this.book_Ref = "MF_" + this.seatArr.join("") + "_" + d.getTime();
    this.backEndSeat.book_Refrence = this.book_Ref;
    localStorage.setItem("book_Reference", this.book_Ref);

    // console.log( localStorage.getItem("book_Reference"))
  
    // let book_refer = localStorage.getItem("book_Refrence");

    this.ticketBooking.bookingRef = this.book_Ref;


    // console.log(this.ticketBooking)
    // console.log(this.seatArr);
    this.backEndSeat.setBookingSeatNumber(this.ticketBooking).subscribe(data => {
      // console.log(data);
      this.router.navigate(["/summary"]);
    }, error => {
      console.log(error);
    })

  }



}
