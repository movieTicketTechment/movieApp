import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Theatre } from 'src/app/Model/theatre';
import { TheatreService } from 'src/app/Services/theatre.service';


@Component({
  selector: 'app-view-all-theatre',
  templateUrl: './view-all-theatre.component.html',
  styleUrls: ['./view-all-theatre.component.css']
})
export class ViewAllTheatreComponent implements OnInit {

  theatres:Theatre[]=[];

  constructor(private theatreService:TheatreService,private router:Router) { }

  ngOnInit(): void {
  
    this.theatreService.getAllTheatres().subscribe(data=>{
      console.log("data:"+data);
      this.theatres= data;
    },
    error=>{
      console.log(error);
    }
    )
  }


  addTheatre(){

    this.router.navigateByUrl("SuperDashboard/addTheatre");
  }

}
