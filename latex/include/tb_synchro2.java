public synchronized void ajoute(Object item) {
  while (nbElement == TAILLE_TAMPON)
    wait();
  ++nbElement;
  tampon[in] = item;
  in = (in + 1) % TAILLE_TAMPON;
  notify();
}
public synchronized Object retire() {
  Object item;
  while (nbElement == 0)
    wait();
  --nbElement;
  item = tampon[in];
  out = (out + 1) % TAILLE_TAMPON;
  notify();
  return item;
}