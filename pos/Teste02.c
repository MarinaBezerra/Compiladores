#include <stdio.h>

int main( ) {
    int vetor[10] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int tamanho = 10;
    int i, j, r, aux;

    printf("Arquivo de teste 02.\n");
    for(i = tamanho - 1; i >= 1; i--) {
        for(j = 0; j < i ; j++) {
            if(vetor[j] > vetor[j + 1]) {
                aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = aux;
            }
        }
    }

    for(r = 0; r < 10; r++) {
        printf("%d ", vetor[r]);
    }
	
	return 0;
}