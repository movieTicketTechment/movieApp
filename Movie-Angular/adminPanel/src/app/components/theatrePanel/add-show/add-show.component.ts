import { Component, OnInit } from '@angular/core';

import { Movie } from 'src/app/Model/movie';
import { Show } from 'src/app/Model/show';
import { Theatre } from 'src/app/Model/theatre';
import { Screen } from 'src/app/Model/screen';

import { ShowService } from 'src/app/Services/show.service';

@Component({
  selector: 'app-add-show',
  templateUrl: './add-show.component.html',
  styleUrls: ['./add-show.component.css']
})
export class AddShowComponent implements OnInit {

  show:Show= new Show();
  getMovie:Movie= new Movie();
  getTheatre:Theatre= new Theatre();
  getScreen:Screen=new Screen();
  movie:Movie[]=[];
  screen:Screen[]=[];
   
  selectedValue:any;
  selectedScreenValue:any;
  mySelect:any;
  constructor(private showService:ShowService) { }

  ngOnInit(): void {

    this.showService.getAllMovie().subscribe(data=>{
      console.log("data:"+data);
      this.movie= data;

    },
    error=>{
      console.log(error);
    }
    );


this.showService.getAllScreen().subscribe(data=>{
      console.log("data:"+data);
      this.screen= data;

    },
    error=>{
      console.log(error);
    }
    );

    this.showService.getAllTheatreById(1).subscribe(data=>{
      console.log("data:"+data);
      this.getTheatre= data;

    },
    error=>{
      console.log(error);
    }
    );
  }
  createShow():void{
   alert(this.show.movie)
  // this.show.theatre.theatreId=1;
  // this.show.screen.screenId=2;
  // this.show.movie.movieId=1;

  this.show.theatre=this.getTheatre;
  this.show.screen=this.getScreen;
  this.show.movie=this.getMovie;

    console.log(this.show)
    this.showService.createNewShow(this.show).subscribe(data=>
      {
        console.log(data)
      alert("Show added");
    },
    error=>
    {
      console.log("error occured",error);
    }
  
      );
  }
  selectChange(){
    this.selectedValue = this.show.movie;
    this.showService.getAllMovieById(this.selectedValue).subscribe(data=>
      {
        this.getMovie=data;
        console.log(this.getMovie)
    },
    error=>
    {
      console.log("error occured",error);
    }
  );

    alert(this.selectedValue+"hello");
    // console.log(this.selectedValue);
  }

  selectScreen()
  {
    this.selectedScreenValue = this.show.screen;
    this.showService.getAllScreenById(this.selectedScreenValue ).subscribe(data=>
      {
        this.getScreen=data;
        console.log(this.getScreen)
    },
    error=>
    {
      console.log("error occured",error);
    }
  );

    alert(this.selectedScreenValue+"hello");
  }
  
}
