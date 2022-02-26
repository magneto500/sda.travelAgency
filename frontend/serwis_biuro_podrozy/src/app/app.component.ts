import { Component } from '@angular/core';
import {RouterModule, Router, Routes} from '@angular/router';
import { TripComponent } from './trip/trip.component';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = "";
}
