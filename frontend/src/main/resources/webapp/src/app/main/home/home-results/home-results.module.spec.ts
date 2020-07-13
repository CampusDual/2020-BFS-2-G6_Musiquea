import { HomeResultsModule } from './home-results.module';

describe('HomeResultsModule', () => {
  let homeResultsModule: HomeResultsModule;

  beforeEach(() => {
    homeResultsModule = new HomeResultsModule();
  });

  it('should create an instance', () => {
    expect(homeResultsModule).toBeTruthy();
  });
});
