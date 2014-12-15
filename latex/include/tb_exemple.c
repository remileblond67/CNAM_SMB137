#define N 1000
séma mutex = 1;
séma production = N;
séma consommation = 0;

void consommateur() {
  while (true) {
    P(consommation);
    P(mutex);
    viderCase();
    V(mutex);
    V(production);
}

void producteur() {
  while (true) {
    P(production);
    P(mutex);
    remplirCase();
    V(mutex);
    V(consommation);
}