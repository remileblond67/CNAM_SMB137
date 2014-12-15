public abstract class exclusionMutuelle {
  public static void sectionCritique() {
    try {
      Thread.sleep( (int) (Math.random() * TIME) );
    } catch (InterruptedException e){}
  }
  public static void sectionNonCritique () {
    try {
      Thread.sleep( (int) (Math.random() * TIME) );
    } catch (InterruptedException e) {}
  }
  public abstract void entreSectionCritique(int t);
  public abstract void sortSectionCritique(int t);
  private static final int TIME = 6000;
}