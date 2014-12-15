Public class TamponBorne {
  public TamponBorne () {
    count=0; in=0; out=0;
    tampon = new Object [TAILLE_TAMPON];
  }
  public void ajouter(Object item) {
    while (count == TAILLE_TAMPON);
    count++;
    tampon[in] = item;
    in = (in + 1) % TAILLE_TAMPON;
  }
  public Object retirer() {
    while (count == 0) ;
    --count;
    item = tampon[out];
    out = (out + 1) % TAILLE_TAMPON;
    return item;
  }
}