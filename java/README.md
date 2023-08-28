# Linguagem: Python

## Explicação
<!-- TODO Revisar pastas -->
Pasta para códigos e exemplos da linguagem de programação Python. Dentro dela, você encontrará  subpastas chamadas: *codigos*, na qual você deverá armazenar seus códigos; *exemplos*, onde estão disponíveis diversos exemplos de como funciona a linguagem, os quais também podem ser utilizado para testar se os métodos de criação de arquivos executáveis está funcionando; *.vscode*, na qual está armazenado os arquivos que o programa Visual Studio Code utiliza para configurar o projeto corretamente.

## Como usar

Caso esteja utilizando a IDE chamada Visual Studio Code, simplesmente abra esta pasta chamada ***Java*** no programa e comece a programar! Quando necessitar compilar e testar seu programa, na parte esquerda, vá na aba de *Run and Debug* (acessível também pela combinação Ctrl+Shift+D) e selecione o tipo de tarefa que quer executar¹ e clique no botão verde. Nas vezes subsequentes, basta estar com o arquivo aberto e apertar *F5* que a tarefa deve executar automaticamente.

¹ O grupo PET Computação já deixou uma pré-pronta que deve funcionar na maioria dos casos.

## Cadeiras Aplicáveis

* Classificação e Pesquisa de Dados - INF01124
* Técnicas de Construção de Programas - INF01120

## Como Modificar

Para modificar a maneira na qual o programa VSCode realiza o processo de compilação e debug do seu código é necessário modificar os conteúdos da pasta .vscode. Lá dentro, estão 4  arquivos que modificam as propriedades da area de trabalho atual.

* *extensions.json:* armazena as extensões recomendadas;
* *settings.json:* armazena configurações especificas para esta pasta;
* *launch.json:* armazena o os processos que devem ser executados na aba de *Run and Debug*, para executar o processo de depuração com argumentos de linha de comando, basta adiciona-los ao item `"args"` do arquivo;
* *tasks.json:* armazena os processos de pré-depuração, normalmente executa a compilação dos arquivos para serem executados.

## Links de referencia

* [https://docs.oracle.com/javase/tutorial/](https://docs.oracle.com/javase/tutorial/) - Tutorial da Linguagem Java [EN]
* [https://www.dm.ufscar.br/~waldeck/curso/java/](https://www.dm.ufscar.br/~waldeck/curso/java/) - Guia da UFSCar de Java [PT]
* [https://docs.oracle.com/en/java/](https://docs.oracle.com/en/java/) - Documentação da Oracle de Java [EN]
* [https://www.w3schools.com/java/](https://www.w3schools.com/java/) - Guia da W3Schools de Java [EN]
* [https://www.javatpoint.com/pt/tutorial-java](https://www.javatpoint.com/pt/tutorial-java) - Guia da JavaTPoint de Java [PT]
