#include <stdio.h>

#ifndef COLLATZ
void collatz(int n) {
    if((n % 2) == 0) {
        #ifndef PRINTNUMBER
        printf("%d -> ", n);
        #endif
        collatz(n / 2);
    } else if (n != 1) {
        #ifndef PRINTNUMBER
        printf("%d -> ", n);
        #endif
        collatz(n * 3 + 1);
    } else {
        #ifndef PRINTNUMBER
        printf("1");
        #endif
    }
}
#endif

int main( ) {
    int n = 3;
    int sequencia[2] = {1, 1000};
    printf("Arquivo de teste 03.\n");
    printf("=> ");
    #ifndef SIZE
    collatz(n);
    #ifdef SIZE
    maiorSequencia(sequencia);
    #endif
    #endif

    return 0;
}