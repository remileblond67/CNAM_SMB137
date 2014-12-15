public synchronized void ajoute(Object item) {
  while (nbElement == TAILLE_TAMPON)
    Thread.yield();
  ++nbElement;
  tampon[in] = item;
  in = (in + 1) % TAILLE_TAMPON;
}
public synchronized Object retire() {
  Object item;
  while (nbElement == 0)
    Thread.yield();
  --nbElement;
  item = tampon[out];
  out = (out + 1) % TAILLE_TAMPON;
  return item;
}