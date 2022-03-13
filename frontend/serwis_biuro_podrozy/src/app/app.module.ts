import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { TripComponent } from './trip/trip.component';
import { AppRoutingModule } from './app-routing.module';
import { ConfiguratorTripComponent } from './configurator-trip/configurator-trip.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { DeleteTripsComponent } from './delete-trips/delete-trips.component';



@NgModule({
  declarations: [
    AppComponent,
    TripComponent,
    ConfiguratorTripComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    DeleteTripsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
