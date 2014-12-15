public class algo1 extends exclusionMutuelle {
  public void algo1() {
    occupe = false;
  }
  public void entreSectionCritique(int t) {
    System.out.println(t + " ? SC");
    while (occupe == true)
      Thread.yield();
    occupe = true;
  }
  public void sortSectionCritique(int t) {
    occupe = false;
  }
  private volatile boolean occupe;
}