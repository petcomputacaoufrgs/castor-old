#include <stdio.h> // Inclui a biblioteca padrao de entrada e saida

// Arquivo para testar se as entradas e saidas estao funcionando corretamente

int main(void)
{
    printf("Entre com um numero inteiro: "); // Imprime a mensagem na tela

    int num = 0; // Declara a variavel num do tipo inteiro
    scanf("%d", &num); // Le o numero digitado pelo usuario e armazena na variavel num
    printf("Voce Digitou: %d", num); // Imprime saida na tela

    return 0;
}