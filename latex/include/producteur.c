// Ajout d ’un élément
// dans le tampon,
// attendre quand 
// il est plein
while
  (count==TAILLE_TAMPON) ;

++count;
tampon[in] = item;
in = (in+1) % TAILLE_TAMPON;