#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>
int i; // Variable globale
void * thread_1 (void *arg) {  // Fonction du thread
  printf ("*** Dans le thread, i=%d ***\n", i);
  pthread_exit (NULL);
}
int main (void) {              // Fonction principale
  pthread_t thread1;
  printf ("Avant la création du thread.\n");
  if (pthread_create (&thread1, NULL, thread_1, NULL)) {
      perror ("pthread_create");
      return EXIT_FAILURE; }
  for (i = 0; i < 10000000; i++) {
      if (i % 1000000 == 0) printf ("Suite du processus principal...\n"); }
  if (pthread_join (thread1, NULL)) {
      perror ("pthread_join"); // On attend la fin du thread
      return EXIT_FAILURE;
    }
  printf ("Fin du processus principal.\n");
  return EXIT_SUCCESS;
}
