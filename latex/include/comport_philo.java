while (true) {
  // Prendre fourchette gauche et droite
  fourchette[i].P();
  fourchette[(i+1)%5].P();
  manger();
  // Reposer les fourchettes
  fourchette[i].V(); fourchette[(i+1)%5].V();
  penser();
}