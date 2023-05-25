import { TestBed } from '@angular/core/testing';

import { ClubServiceService } from './club-service.service';

describe('ClubService', () => {
  let service: ClubServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ClubServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
