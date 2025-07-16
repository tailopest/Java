import java.util.Scanner;
public class conversaoTempo {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int segundos = ler.nextInt();
        System.out.println(segundos/3600 + ":" + ((segundos - ((segundos/3600)*3600))/60) + ":" + (segundos - ((segundos/60)*60)));
        ler.close();
    }
}