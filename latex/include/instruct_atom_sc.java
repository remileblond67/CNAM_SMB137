// Fonction exécutée sans interruption possible
public static boolean testAndSet(TAS target) {
  TAS temp = target.get();
  target.set(true);
  return temp.get();
}
// lock : variable partagée initialisée à false

// Dans le processus comportant une section critique
while (testAndSet(lock)) Thread.yield();

// Section critique

lock.set(false);

// Section non critique
