Public int finLecture() {
  --nbLecteur;
  // Si je suis le dernier
  // alors libération de la
  // base de données
  if (nbLecteur == 0)
    base.V();
  return nbLecteur;
}

Public int finEcriture() {
  base.V();
}