import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Movie } from 'src/app/Model/movie';
import { MovieService } from 'src/app/Services/movie.service';

@Component({
  selector: 'app-view-all-movies',
  templateUrl: './view-all-movies.component.html',
  styleUrls: ['./view-all-movies.component.css']
})
export class ViewAllMoviesComponent implements OnInit {
  // movies:Movie[]=[];
  movies:any[]=[];
  constructor(private movieService:MovieService,private router:Router) { }

  ngOnInit(): void {
    this.movieService.getAllMovies().subscribe(data=>{
      console.log("data:"+data);
      this.movies= data;
    },
    error=>{
      console.log(error);
    }
    )
  }

  addMovie(){

    this.router.navigateByUrl("TheatreDashboard/addMovie");
  }

}
