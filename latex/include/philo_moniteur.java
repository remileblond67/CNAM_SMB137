monitor dinerPhilosophes {
  int[] etat = new int[5];
  static final int MANGER = 0;
  static final int FAIM   = 1;
  static final int PENSER = 2;
  condition[] demandeur =
              new condition[5];

  public dinerPhilosophes {
    for (int i=0; i<5; i++)
      etat[i] = PENSER;
  }
  public entry prendre(int i) {
    etat[i] = FAIM;
    test(i);
    if (etat[i] != MANGER) {
      demandeur[i].wait;
    }
  }
  public entry poser(int i) {
    etat[i] = PENSER;
    test((i+1)%5);
    test((i+4)%5);
  }
  private test(int i) {
    if (etat[(i+4)%5] != MANGER) && 
       (etat[i] == FAIM) &&
       (etat[(i+1)%5] != MANGER) {
      etat[i] = MANGER;
      demandeur[i].signal;
    }
  }
}