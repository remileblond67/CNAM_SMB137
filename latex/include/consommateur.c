// Retire un élément
// du tampon,
// attente quand il
// est vide
while (count == 0) ;

--count;
item = tampon[out];
out = (out+1) % TAILLE_TAMPON;