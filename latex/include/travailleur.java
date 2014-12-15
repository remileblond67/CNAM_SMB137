public class travailleur extends Thread {
  private int id; private exclusionMutuelle mutex;
  public travailleur(int i, exclusionMutuelle em) {	
    id = i; mutex = em;
  }
  public void fin() {
    mutex.sortSectionCritique(id); this.stop();
  }
  public void run() {
    while (true) {
      mutex.entreSectionCritique(id);
      System.out.println(id + " > SC");
      exclusionMutuelle.sectionCritique();
      mutex.sortSectionCritique(id);
      System.out.println(id + " < SC");
      exclusionMutuelle.sectionNonCritique();
    }
  }
}