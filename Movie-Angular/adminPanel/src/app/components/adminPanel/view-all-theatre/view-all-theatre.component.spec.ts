import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAllTheatreComponent } from './view-all-theatre.component';

describe('ViewAllTheatreComponent', () => {
  let component: ViewAllTheatreComponent;
  let fixture: ComponentFixture<ViewAllTheatreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewAllTheatreComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewAllTheatreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
