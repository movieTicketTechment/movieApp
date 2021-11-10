import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PhotosModuleComponent } from './photos-module.component';

describe('PhotosModuleComponent', () => {
  let component: PhotosModuleComponent;
  let fixture: ComponentFixture<PhotosModuleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PhotosModuleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PhotosModuleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
