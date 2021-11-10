import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-theatre-nav-bar',
  templateUrl: './theatre-nav-bar.component.html',
  styleUrls: ['./theatre-nav-bar.component.css']
})
export class TheatreNavBarComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  logout(){

  this.router.navigateByUrl("login");
  }

}
