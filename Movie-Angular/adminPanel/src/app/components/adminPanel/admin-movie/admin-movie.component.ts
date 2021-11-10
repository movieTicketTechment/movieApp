import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { Router } from '@angular/router';
import { Movie } from 'src/app/Model/movie';
import { MovieService } from 'src/app/Services/movie.service';
import { PhotosService } from 'src/app/Services/photos.service';

@Component({
  selector: 'app-admin-movie',
  templateUrl: './admin-movie.component.html',
  styleUrls: ['./admin-movie.component.css']
})
export class AdminMovieComponent implements OnInit {
  movies:Movie[]=[];
  nmovieId:any;
 
  constructor(private movieService:MovieService,private router:Router,private httpClient: HttpClient,private sanitizer: DomSanitizer,private photoService:PhotosService) { }

  photosValue:any;

  imageSource:any;

  images!:string ;

  // photoService
  ngOnInit(): void {

    this.movieService.getAllMovies().subscribe(data=>{
      console.log("data:"+data);
      this.movies= data;
    },
    error=>{
      console.log(error);
    }
    )

    this.photoService.getPhotoById("616e8c6bfd7fd3727ce998a7").subscribe(pics=>{
    console.log("pics:"+pics);
    // console.log("")
    this.photosValue=pics;

    this.images=pics.image.data;
    console.log(this.images);

    this.imageSource = this.sanitizer.bypassSecurityTrustResourceUrl(`data:image/png;base64, ${this.images}`);
    // console.log("photosValue"+this.photosValue);
    },
    error=>{
      console.log(error);
    }
    )



  }



  addMovie(){

    this.router.navigateByUrl("SuperDashboard/addMovie");
  }

  ViewAllMovieList(){
    this.router.navigateByUrl("SuperDashboard/ViewAllMovies");
  }


  movieGet:Movie = new Movie();

  updateMovie() {
    alert(this.movieGet.movieId)
          this.movieService.updateMovie(this.movieGet.movieId, this.movieGet).subscribe(
            (data) => alert(data),
           
            (error) => console.log(error)
          );
    }
    movieGet1:Movie= new Movie();


}
