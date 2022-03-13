import { TripComponent } from './trip/trip.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Router, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ConfiguratorTripComponent } from './configurator-trip/configurator-trip.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { DeleteTripsComponent } from './delete-trips/delete-trips.component';




const routes: Routes = [
{path:"", redirectTo: "home", pathMatch:"full"},
{path:"configurator-trip", component: ConfiguratorTripComponent},
{path:"home", component: HomeComponent},
{path:"about", component: AboutComponent},
{path:"contact", component: ContactComponent},
{path:"delete-trips", component: DeleteTripsComponent},
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
