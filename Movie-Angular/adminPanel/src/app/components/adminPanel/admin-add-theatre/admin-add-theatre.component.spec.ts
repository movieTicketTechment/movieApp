import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminAddTheatreComponent } from './admin-add-theatre.component';

describe('AdminAddTheatreComponent', () => {
  let component: AdminAddTheatreComponent;
  let fixture: ComponentFixture<AdminAddTheatreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminAddTheatreComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminAddTheatreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
