import { HomeRecommendationsModule } from './home-recommendations.module';

describe('HomeRecommendationsModule', () => {
  let homeRecommendationsModule: HomeRecommendationsModule;

  beforeEach(() => {
    homeRecommendationsModule = new HomeRecommendationsModule();
  });

  it('should create an instance', () => {
    expect(homeRecommendationsModule).toBeTruthy();
  });
});
