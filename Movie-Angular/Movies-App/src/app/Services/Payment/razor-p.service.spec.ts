import { TestBed } from '@angular/core/testing';

import { RazorPService } from './razor-p.service';

describe('RazorPService', () => {
  let service: RazorPService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RazorPService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
