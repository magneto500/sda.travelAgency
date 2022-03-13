import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConfiguratorTripComponent } from './configurator-trip.component';

describe('ConfiguratorTripComponent', () => {
  let component: ConfiguratorTripComponent;
  let fixture: ComponentFixture<ConfiguratorTripComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConfiguratorTripComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConfiguratorTripComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
