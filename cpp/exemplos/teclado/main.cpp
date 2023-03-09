#include <iostream> // Biblioteca padrao de entrada e saida

// Arquivo para testar se as entradas e saidas estao funcionando corretamente

int main(void)
{
    std::cout << "Entre com um numero inteiro: "; // Imprime na tela

    int num = 0;                                       // Variavel para armazenar o numero digitado
    std::cin >> num;                                   // Le o número digitado pelo usuario
    std::cout << "Voce digitou: " << num << std::endl; // Imprime na tela a mensagem e o numero digitado

    return 0;
}