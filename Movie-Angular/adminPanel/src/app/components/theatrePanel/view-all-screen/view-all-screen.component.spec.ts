import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAllScreenComponent } from './view-all-screen.component';

describe('ViewAllScreenComponent', () => {
  let component: ViewAllScreenComponent;
  let fixture: ComponentFixture<ViewAllScreenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewAllScreenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewAllScreenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
