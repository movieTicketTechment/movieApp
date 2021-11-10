import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TheatreNavBarComponent } from './theatre-nav-bar.component';

describe('TheatreNavBarComponent', () => {
  let component: TheatreNavBarComponent;
  let fixture: ComponentFixture<TheatreNavBarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TheatreNavBarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TheatreNavBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
