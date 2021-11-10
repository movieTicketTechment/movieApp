import { TestBed } from '@angular/core/testing';

import { ShowMovieService } from './show-movie.service';

describe('ShowMovieService', () => {
  let service: ShowMovieService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ShowMovieService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
