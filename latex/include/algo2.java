public class algo2 extends exclusionMutuelle {
  public void algo2() {
    tour = 0;
  }
  public void entreSectionCritique(int t) {
    System.out.println(t + " ? SC");
    while (tour != t)
      Thread.yield();
  }
  public void sortSectionCritique(int t) {
    tour = 1 - t;
  }
  private volatile int tour;
}