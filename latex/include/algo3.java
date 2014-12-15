public class algo3 extends exclusionMutuelle {
  public void algo3() {
    demande[0] = false;
    demande[1] = false;
  }
  public void entreSectionCritique(int t) {
    int autre;
    autre = 1 - t;
    demande[t] = true;
    System.out.println(t + " ? SC");
    while (demande[autre] == true)
      Thread.yield();
  }
  public void sortSectionCritique(int t) {
    demande[t] = false;
  }
  private volatile boolean[] demande = new boolean[2];
}