#include <stdio.h>

// Arquivo para testar se os argumentos no debugger estao sendo passados corretamente

int main(int argc, char *argv[]) // Passagem de argumentos para a funcao Main
{
    if(argc <= 1) // O primeiro parametro e sempre o caminho e nome do programa
    {
        printf("Nenhum argumento foi passado"); // portanto nao ha argumentos
    }
    else
    {
        printf("%d Argumentos passados: ", argc - 1); // argc - 1 para nao contar o nome do programa
        for (int i = 1; i < argc; i++) // Comeca em 1 para nao contar o nome do programa
        {
            printf("%s ", argv[i]); // argv[i] e o i-esimo argumento
        }
    }

    return 0;
}