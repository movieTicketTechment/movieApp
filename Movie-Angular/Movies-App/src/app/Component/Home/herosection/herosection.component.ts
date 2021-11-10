import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomeScreenService } from 'src/app/Services/Home/home-screen.service';

@Component({
  selector: 'app-herosection',
  templateUrl: './herosection.component.html',
  styleUrls: ['./herosection.component.css']
})
export class HerosectionComponent implements OnInit {

  constructor(private router: Router, private homeScreen: HomeScreenService) { }

  // variables
  heroHome: any;
  heroHomeAll: any;
  


  ngOnInit(): void {

    this.homeScreen.getHeroHome().subscribe(data => {
      this.heroHome = data.splice(1,3)
      this.heroHomeAll = data
      console.log(this.heroHomeAll)
    

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
