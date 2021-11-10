import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Show } from 'src/app/Model/show';
import { ShowService } from 'src/app/Services/show.service';

@Component({
  selector: 'app-view-all-shows',
  templateUrl: './view-all-shows.component.html',
  styleUrls: ['./view-all-shows.component.css']
})
export class ViewAllShowsComponent implements OnInit {
  shows:any[]=[];
  constructor(private showService:ShowService,private router:Router) { }

  ngOnInit(): void {

    this.showService.getAllShows().subscribe(data=>{
      console.log("data:"+data);
      this.shows= data;
    },
    error=>{
      console.log(error);
    }
    )
  }

  addShow(){

    this.router.navigateByUrl("TheatreDashboard/addShow");
  }

}




