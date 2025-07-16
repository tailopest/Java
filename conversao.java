import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in); 
        System.out.print("anos: ");
        int anos = le.nextInt();            
        System.out.print("meses: ");
        int meses = le.nextInt();
        System.out.print("dias: ");
        int dias = le.nextInt();
        System.out.println(365*anos+30*meses+dias);
        le.close();
    }
}
