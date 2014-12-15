Public int debutLecture() {
  ++nbLecteur;
  // Si je suis le premier
  // alors verrouillage de
  // la base de données
  if (nbLecteur == 1)
    base.P();
  return nbLecteur;
}

Public int debutEcriture() {
  base.P();
}