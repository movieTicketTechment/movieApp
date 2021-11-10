import { Component, OnInit } from '@angular/core';
import { Movie } from 'src/app/Model/movie';
import { MovieService } from 'src/app/Services/movie.service';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {

  movie:Movie= new Movie();
  constructor(private movieService:MovieService) { }

  ngOnInit(): void {
  }

  createMovie():void{

    this.movieService.createNewMovie(this.movie).subscribe(data=>
      {
      alert("Movie added");
    },
    error=>
    {
      console.log("error occured",error);
    }
  
      );
  
  
  }

}
