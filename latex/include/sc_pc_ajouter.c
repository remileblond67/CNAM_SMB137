public void ajouter(Object item) {
  // Ajout d’un élément dans le tampon,
  // attente quand il est plein
  while (count == TAILLE_TAMPON);
  count++;
  tampon[in] = item;
  in = (in + 1) % TAILLE_TAMPON;
}