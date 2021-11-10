import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Payments } from 'src/app/Model/Payment/payments';
import { TicketBooking } from 'src/app/Model/Seat/ticket-booking';

import { UserserviceService } from 'src/app/Services/User/userservice.service';

@Component({
  selector: 'app-summary',
  templateUrl: './summary.component.html',
  styleUrls: ['./summary.component.css']
})
export class SummaryComponent implements OnInit {

  ticketBooking: TicketBooking = new TicketBooking();
  bookingSummary!: any;
  payment: Payments = new Payments()

  book_ref: any = localStorage.getItem("book_Reference");
  constructor(private router: Router, private backEndSeat: UserserviceService) { }

  handler: any = null;


  ngOnInit(): void {
    this.loadStripe();


    this.backEndSeat.getBookingDetails(this.book_ref).subscribe(data => {
      console.log(data);
      this.bookingSummary = data;

    }, error => {
      console.log(error);
    })

  }



  //*****************   Stripe Payment ************************
  payNow(amount: any) {


        this.backEndSeat.updateTicketBooking(this.book_ref).subscribe(data => {
          console.log(data)
        }, error => {
          console.log(error);
        })

    var handler = (<any>window).StripeCheckout.configure({
      key: 'pk_test_51Jp2qhSDT8RbJFgUoSCtUFW9olt0nNASJH1rdeiOnM0zsdXtyf3ZFbBC9rRLDoqV3afa4MXyVmzIGERl8DvUNmhw00ZapVD4D9',
      locale: 'auto',




      token(token: any) {
        // You can access the token ID with `token.id`.
        // Get the token ID to your server-side code for use.
        console.log(token)

        // this.router.navigate(["/thanks"]);
        




      }
     
    }    );

    handler.open({
      name: 'Demo Site',
      description: '2 widgets',
      amount: amount * 100
    });

  }

  loadStripe() {

    if (!window.document.getElementById('stripe-script')) {
      var s = window.document.createElement("script");
      s.id = "stripe-script";
      s.type = "text/javascript";
      s.src = "https://checkout.stripe.com/checkout.js";
      s.onload = () => {
        this.handler = (<any>window).StripeCheckout.configure({
          key: 'pk_test_51Jp2qhSDT8RbJFgUoSCtUFW9olt0nNASJH1rdeiOnM0zsdXtyf3ZFbBC9rRLDoqV3afa4MXyVmzIGERl8DvUNmhw00ZapVD4D9',
          locale: 'auto',
          token: function (token: any) {
            // You can access the token ID with `token.id`.
            // Get the token ID to your server-side code for use.
            console.log(token)
            
            alert('Payment Success!!');
            
          }
        });
      }

      window.document.body.appendChild(s);
    }
  }
}
