#include <iostream>

int main(int argc, char *argv[])
{
    if(argc == 1)
    {
        std::cout << "Nenhum argumento foi passado" << std::endl;
    }
    else
    {
        std::cout << argc - 1 << " Argumentos passados: ";
        for(int i = 1; i < argc; i++)
        {
            std::cout << argv[i] << std::endl;
        }
    }

    return 0;
}