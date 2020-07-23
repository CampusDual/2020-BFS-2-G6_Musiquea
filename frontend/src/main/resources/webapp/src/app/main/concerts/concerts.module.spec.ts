import { ConcertsModule } from './concerts.module';

describe('ConcertsModule', () => {
  let concertsModule: ConcertsModule;

  beforeEach(() => {
    concertsModule = new ConcertsModule();
  });

  it('should create an instance', () => {
    expect(concertsModule).toBeTruthy();
  });
});
