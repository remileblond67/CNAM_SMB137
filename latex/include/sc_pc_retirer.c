public Object retirer() {
  // Retire un élément du tampon,
  // attente quand il est vide

  while (count == 0) ; // Attendre que le
                          tampon se remplisse
  count--;
  item = tampon[out];
  out = (out + 1) % TAILLE_TAMPON;
  return item;
}
