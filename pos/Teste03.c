#include <stdio.h>

void collatz(int n) {
    if((n % 2) == 0) {
        printf("%d -> ", n);
        collatz(n / 2);
    } else if (n != 1) {
        printf("%d -> ", n);
        collatz(n * 3 + 1);
    } else {
        printf("1");
    }
}

int main( ) {
    int n = 3;
    int sequencia[2] = {1, 1000};
    printf("Arquivo de teste 03.\n");
    printf("=> ");
    collatz(n);

    return 0;
}