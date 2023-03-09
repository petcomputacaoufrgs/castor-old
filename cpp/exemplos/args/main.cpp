#include <iostream>

// Arquivo para testar se os argumentos no debugger estao sendo passados corretamente

int main(int argc, char *argv[]) // Passagem de argumentos para a funcao Main
{
    if (argc == 1) // O primeiro parametro e sempre o caminho e nome do programa
    {
        std::cout << "Nenhum argumento foi passado" << std::endl; // portanto nao ha argumentos
    }
    else
    {
        std::cout << argc - 1 << " Argumentos passados: "; // argc - 1 para nao contar o nome do programa
        for (int i = 1; i < argc; i++)                     // Comeca em 1 para nao contar o nome do programa
        {
            std::cout << argv[i] << std::endl; // argv[i] e o i-esimo argumento
        }
    }

    return 0;
}