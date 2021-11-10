import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomeScreenService } from 'src/app/Services/Home/home-screen.service';

@Component({
  selector: 'app-best-rated-movies',
  templateUrl: './best-rated-movies.component.html',
  styleUrls: ['./best-rated-movies.component.css']
})
export class BestRatedMoviesComponent implements OnInit {

  constructor(private router: Router, private homeScreen: HomeScreenService) { }

  // variables
  heroMovie: any;
  heroHomeAll: any;
  

  ngOnInit(): void {
    this.homeScreen.getHeroHome().subscribe(data => {
      this.heroMovie = data[4]
  
    

  }, error => {
  console.log(error);
})


  }
  bookTicketSec(id:any){
    console.log(id)
    this.homeScreen.id = id
    localStorage.setItem("movieIds", id);
    this.router.navigate(["/bookTicket"])
  }
  }


