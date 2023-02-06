#include <stdio.h>

int main(int argc, char *argv[])
{
    if(argc <= 1)
    {
        printf("Nenhum argumento foi passado");
    }
    else
    {
        printf("%d Argumentos passados: ", argc - 1);
        for (int i = 1; i < argc; i++)
        {
            printf("%s\n", argv[i]);
        }
    }

    return 0;
}