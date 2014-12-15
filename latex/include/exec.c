int main(void) {
  retour = fork();
  if (retour == 0) { // Processus fils
    execl("/bin/ls", "ls", "-l", (char*)0);
  }
  else if (retour > 0) { // Processus père
    wait((int*) 0); // le père attend la fin du fils
    printf("Fin du fils\n");
    exit(0);
  }
  else printf("Erreur au fork()\n");
}
