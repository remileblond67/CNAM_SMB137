#include<stdio.h>
#include<stdlib.h>
int dire_bonjour(int nb) {
  int i;
  printf("Bonjour tout le monde ");
  for (i=nb; i>0; i--) {
    printf("!");
  }
  printf ("\n", nb);

  if (nb>0) {
    printf("(retour : %d)\n", dire_bonjour(nb-1));
  }
   
  return nb;
}
int main(void) {
  printf("(Retour final : %d)\n", dire_bonjour(10));
  return EXIT_SUCCESS;
}
