import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o primeiro parametro");
        int param1 = leitor.nextInt();
        System.out.println("Insira o primeiro parametro");
        int param2 = leitor.nextInt();

        try {
            contar(param1, param2);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parametro não pode ser menor que o primeiro, verifique.");
        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = param2 - param1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo número " + i);
        }
    }
}
