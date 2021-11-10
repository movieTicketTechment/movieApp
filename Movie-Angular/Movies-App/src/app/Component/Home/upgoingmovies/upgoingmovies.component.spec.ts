import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpgoingmoviesComponent } from './upgoingmovies.component';

describe('UpgoingmoviesComponent', () => {
  let component: UpgoingmoviesComponent;
  let fixture: ComponentFixture<UpgoingmoviesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpgoingmoviesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpgoingmoviesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
