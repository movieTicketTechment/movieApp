import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomeScreenService } from 'src/app/Services/Home/home-screen.service';

@Component({
  selector: 'app-book-ticket',
  templateUrl: './book-ticket.component.html',
  styleUrls: ['./book-ticket.component.css']
})
export class BookTicketComponent implements OnInit {

  constructor(private router: Router, private homeScreen: HomeScreenService) { }

  // variables
  heroMovie: any;
  id:any = localStorage.getItem("movieIds")
  heroHomeAll: any;
  

  ngOnInit(): void {
    this.homeScreen.getHeroHome().subscribe(data => {
    
     console.log(this.id)
      this.heroMovie = data[this.id-1]
  
    

  }, error => {
  console.log(error);
})


  }
  }


