#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>

void * thread_1 (void *arg) {
  printf ("***** Nous sommes dans le thread *****\n");
  pthread_exit (NULL);
}

int main (void) {
  pthread_t thread1;
  printf ("Avant la création du thread.\n");
  if (pthread_create (&thread1, NULL, thread_1, NULL)) {
      perror ("pthread_create");
      return EXIT_FAILURE;
    }
  for (int i = 0; i < 10000000; i++) {
      if (i % 1000000 == 0) printf ("Suite du processus principal...\n");
    }
  // On attend la fin du thread
  if (pthread_join (thread1, NULL)) {
      perror ("pthread_join");
      return EXIT_FAILURE;
    }
  printf ("Fin du processus principal.\n");
  return EXIT_SUCCESS;
}
