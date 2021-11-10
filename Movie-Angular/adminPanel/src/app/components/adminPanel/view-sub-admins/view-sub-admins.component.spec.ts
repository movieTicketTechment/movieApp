import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewSubAdminsComponent } from './view-sub-admins.component';

describe('ViewSubAdminsComponent', () => {
  let component: ViewSubAdminsComponent;
  let fixture: ComponentFixture<ViewSubAdminsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewSubAdminsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewSubAdminsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
