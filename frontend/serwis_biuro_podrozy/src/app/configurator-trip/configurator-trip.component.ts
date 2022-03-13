import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export type CityDto = {
  idCity : number;
  cityName: string;
  country: string;
}


export type TripDto = {
  idTrip: number;
  descriptionTrip: string;
  departureDate: string;
  returnDate: string;
  adultPrice: number;
  childPrice: number;
  feedingType: string;
};

export type TripSearch = {
  tripDescription: string;
  dateStartFrom: string;
  dateStartTo: string;
  priceFrom: number;
  priceTo: number;
  cityStart: string;
};

const EMPTY_TRIP_SEARCH = {
  tripDescription: '',
  dateStartFrom: '2022-03-05',
  dateStartTo: '2022-05-04',
  priceFrom: 0,
  priceTo: 0,
  cityStart: '',
};



@Component({
  selector: 'app-configurator-trip',
  templateUrl:'./configurator-trip.component.html',
  styleUrls: ['./configurator-trip.component.css'],
})
export class ConfiguratorTripComponent implements OnInit {
  tripSearch: TripSearch;
  foundTrips: TripDto[];
  cities: CityDto[];
  trips: TripDto[];

  constructor(private http: HttpClient) {
    this.tripSearch = Object.assign({}, EMPTY_TRIP_SEARCH);
    this.foundTrips=[];
    this.cities = [];
    this.trips = [];
  }

  ngOnInit(): void {
    this.http.get('http://localhost:8080/city/show').subscribe((data) => {
      let listOfCities = data as CityDto[];
      this.cities = listOfCities;
    });

    this.http.get('http://localhost:8080/trip/show').subscribe((data) => {
      let listOfTripDescription = data as TripDto[];
      this.trips = listOfTripDescription;
    });
  }

  searchTrips() {
    console.log('wyslij')
    this.http.post('http://localhost:8080/trip/search', this.tripSearch).subscribe((data) => {
      let listOfTrips = data as TripDto[];
      this.foundTrips = listOfTrips;
    });
  }
}
