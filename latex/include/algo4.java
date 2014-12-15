public class algo4 extends exclusionMutuelle {
  public void algo4() {
    demande[0] = false; demande[1] = false;
    tour = 0; // Fixé arbitrairement à 0 ou à 1
  }
  public void entreSectionCritique(int t) {
    int autre = 1 - t;
    demande[t] = true;
    tour = autre;
    System.out.println(t + " ? SC (tour="+tour+")");
    while ((demande[autre] == true) && (tour == autre))
      Thread.yield();
  }
  public void sortSectionCritique(int t) {
    demande[t] = false;
  }
  private volatile boolean[] demande = new boolean[2];
  private volatile int tour;
}