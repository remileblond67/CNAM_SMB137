int main(void) {
  int a=0, i, j, retour;
  // Retourne le PID du fils pour 
  // le père et 0 pour le fils
  retour = fork();
  wait();
  for (i=0; i<5; i++) {
    printf("retour=%5d -> a=%d\n",
           retour, a++);
    for (j=0; j<10000000; j++);
  }
  printf("En fin de compte, 
         retour=%d, a=%d\n",retour,a);
}
