import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAllShowsComponent } from './view-all-shows.component';

describe('ViewAllShowsComponent', () => {
  let component: ViewAllShowsComponent;
  let fixture: ComponentFixture<ViewAllShowsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewAllShowsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewAllShowsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
