import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OngoingmoviesComponent } from './ongoingmovies.component';

describe('OngoingmoviesComponent', () => {
  let component: OngoingmoviesComponent;
  let fixture: ComponentFixture<OngoingmoviesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OngoingmoviesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OngoingmoviesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
