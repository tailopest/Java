import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.print("anos: ");
        int anos = in.nextInt();            
        System.out.print("meses: ");
        int meses = in.nextInt();
        System.out.print("dias: ");
        int dias = in.nextInt();
        System.out.println(365*anos+30*meses+dias);
        in.close();
    }
}
