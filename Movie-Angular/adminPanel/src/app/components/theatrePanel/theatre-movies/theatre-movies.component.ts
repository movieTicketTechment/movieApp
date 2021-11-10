import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Movie } from 'src/app/Model/movie';
import { MovieService } from 'src/app/Services/movie.service';
import { DomSanitizer } from '@angular/platform-browser';
import { PhotosService } from 'src/app/Services/photos.service';

@Component({
  selector: 'app-theatre-movies',
  templateUrl: './theatre-movies.component.html',
  styleUrls: ['./theatre-movies.component.css']
})
export class TheatreMoviesComponent implements OnInit {

  movies:Movie[]=[];
 
  constructor(private movieService:MovieService,private router:Router,private httpClient: HttpClient) { }

  // constructor(private movieService:MovieService,private router:Router,private httpClient: HttpClient,private sanitizer: DomSanitizer,private photoService:PhotosService) { }

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

    // this.photoService.getPhotoById("616e8c6bfd7fd3727ce998a7").subscribe(pics=>{
    // console.log("pics:"+pics);   
    // this.photosValue=pics;
    // this.images=pics.image.data;
    // console.log(this.images);
    // this.imageSource = this.sanitizer.bypassSecurityTrustResourceUrl(`data:image/png;base64, ${this.images}`);    
    // },
    // error=>{
    //   console.log(error);
    // }
    // )

  }



  addMovie(){
    this.router.navigateByUrl("TheatreDashboard/addMovie");
  }

  ViewAllMovieList(){
    this.router.navigateByUrl("TheatreDashboard/ViewAllMovies");
  }





}
