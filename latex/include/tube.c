#include <stdio.h>
#include <unistd.h>
void pereFils(char *process1, char *process2) {
  int monTube[2];
  pipe(monTube);
  if (fork() != 0) {
    close(monTube[0]);   // Ferme lecture
    dup2(monTube[1], 1); // Redir. stdout
    close(monTube[1]);
    execl(producteur, producteur, 0);
  } else {
    close(monTube[1]);   // Ferme écriture
    dup2(monTube[0], 0); // Redir. stdin
    close(monTube[0]);
    execl(consomateur, consomateur, 0);
  }
}