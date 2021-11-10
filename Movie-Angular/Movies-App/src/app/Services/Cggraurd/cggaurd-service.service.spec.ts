import { TestBed } from '@angular/core/testing';

import { CggaurdServiceService } from './cggaurd-service.service';

describe('CggaurdServiceService', () => {
  let service: CggaurdServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CggaurdServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
