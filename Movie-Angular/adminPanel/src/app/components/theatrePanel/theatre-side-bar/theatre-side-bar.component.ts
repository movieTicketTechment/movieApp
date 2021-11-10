import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-theatre-side-bar',
  templateUrl: './theatre-side-bar.component.html',
  styleUrls: ['./theatre-side-bar.component.css']
})
export class TheatreSideBarComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  addMovie(){

    this.router.navigateByUrl("TheatreDashboard/addMovie");
  }
  addShow(){
    this.router.navigateByUrl("TheatreDashboard/addShow");
  }
  viewAllShowList(){
    this.router.navigateByUrl("TheatreDashboard/viewAllShows");
  }
  addScreen(){
    this.router.navigateByUrl("TheatreDashboard/addNewScreen");
  }
  viewAllScreenList(){
    this.router.navigateByUrl("TheatreDashboard/viewAllScreenList");
  }
}
