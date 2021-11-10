import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TheatreSideBarComponent } from './theatre-side-bar.component';

describe('TheatreSideBarComponent', () => {
  let component: TheatreSideBarComponent;
  let fixture: ComponentFixture<TheatreSideBarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TheatreSideBarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TheatreSideBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
