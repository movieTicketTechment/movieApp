import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-home',
  templateUrl: './admin-home.component.html',
  styleUrls: ['./admin-home.component.css']
})
export class AdminHomeComponent implements OnInit {


  userName:any;
  userEmail!:string;
  userRole!:string;
  userCred:any;

  showMovies=false;
  constructor(private router:Router) { }

  ngOnInit(): void {

   this.userName = localStorage.getItem('SuperAdminName');
    
  }

  showMovieDashboard(){
    this.router.navigateByUrl("SuperDashboard/movies");
  }

  showUserDashboard(){
    this.router.navigateByUrl("SuperDashboard/users");
  }

  showTheatreDashboard(){
    this.router.navigateByUrl("SuperDashboard/theatres");
  }

  showBookingDashboard(){
    this.router.navigateByUrl("SuperDashboard/bookings");
  }
  showShowTimeDashboard(){
    this.router.navigateByUrl("SuperDashboard/shows");
  }

  ViewAllMovieList(){
    this.router.navigateByUrl("SuperDashboard/ViewAllMovies");
  }

  addMovie(){
    this.router.navigateByUrl("SuperDashboard/addMovie");
  }

  showUserList(){
    this.router.navigateByUrl("SuperDashboard/userList");
  }

  addUser(){
    this.router.navigateByUrl("SuperDashboard/addUser");
  }
  addShow(){
    this.router.navigateByUrl("TheatreDashboard/addShow");
  }
  viewAllShowList(){
    this.router.navigateByUrl("TheatreDashboard/viewAllShows");
  }

  showSubAdminDashboard(){
    this.router.navigateByUrl("SuperDashboard/subAdmins");
  }
  
  addSubAdmin(){

    this.router.navigateByUrl("SuperDashboard/addSubAmin");
  }

  showHomeDashboard(){

    this.router.navigateByUrl("SuperDashboard");
  }
  addTheatre(){

    this.router.navigateByUrl("SuperDashboard/addTheatre");
  }

  viewAllTheatre(){

    this.router.navigateByUrl("SuperDashboard/viewAllTheatre");
  }
}
