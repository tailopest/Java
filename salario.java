import java.util.Locale; // importa a classe com regras de dados regionais
import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US); // forca a interpretacao de dados seguindo o padrao dos eua
        System.out.print("Salario minimo: ");
        float minimo = ler.nextFloat();
        System.out.print("Seu salario: ");
        float salario = ler.nextFloat();
        System.out.println("Voce recebe " + (salario/minimo) + " salarios minimos");
        ler.close();
    }
}
