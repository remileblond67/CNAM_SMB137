public class test1 {
  public static void main(String args[]) {
    exclusionMutuelle em = new algo1();
    travailleur premier = new travailleur(0, em);
    travailleur deuxieme = new travailleur(1, em);
    premier.start();
    deuxieme.start();
    try {
      Thread.sleep( (int) 4000);
    } catch (InterruptedException e) {};
    System.out.println("Fin de 0");
    premier.fin();
  }
}