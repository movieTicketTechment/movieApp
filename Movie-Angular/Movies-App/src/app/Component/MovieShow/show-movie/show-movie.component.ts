import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomeScreenService } from 'src/app/Services/Home/home-screen.service';

import { DatePipe } from '@angular/common';
import { ShowMovieService } from 'src/app/Services/movieShow/show-movie.service';

@Component({
  selector: 'app-show-movie',
  templateUrl: './show-movie.component.html',
  styleUrls: ['./show-movie.component.css'],
  providers: [DatePipe]
})


export class ShowMovieComponent implements OnInit {
 

  constructor(private router: Router, private homeScreen: ShowMovieService,private datePipe: DatePipe) { }
// variables

myDate=new Date();
getMovieId:any=localStorage.getItem("movieIds");
getCityName:any=localStorage.getItem("selectedCity");
showDetail:any;
getScreenId:any;
noDataMsg:any;
currentDate:any;




  ngOnInit(): void {
    this.currentDate= this.datePipe.transform(this.myDate, 'yyyy-MM-dd');
    
    
    this.homeScreen.getShowDetail(this.getMovieId,this.getCityName,this.currentDate).subscribe(data => {
      if(data==[])
      {
        this.noDataMsg="opps no data available ";
        alert(this.noDataMsg)

      }
      else{
      
        this.showDetail= data
        console.log(this.showDetail)
      
      }
  
    

  }, error => {
  console.log(error);
})

  }
   
 
seatLayoutRedirection(showId:any,screenId:any)
{

  localStorage.setItem("screenId",screenId)
  localStorage.setItem("showId",showId)
  this.router.navigate(["/seatBooking"])
}


}