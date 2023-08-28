package exemplos.args;

public class Argumentos {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Você não passou nada!");
            return;
        }

        System.out.print("Você passou: ");
        for (String arg : args) {
            System.out.print(arg + ", ");
        }
        System.out.println();
    }
}
