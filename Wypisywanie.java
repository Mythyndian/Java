import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Witaj! W moim programie :D");

       System.out.print("Wprowadz tekst: ");
       String tekst = scanner.nextLine();

       System.out.print("Wybierz liczbe: ");
       int liczba = scanner.nextInt();

       System.out.println("Podejmij decyzje");
       System.out.println("1.Wydrukuj tekst " + liczba + " razy");
       System.out.println("2.Nie drukuj");


       int decyzja = scanner.nextInt();
       while(decyzja != 1 && decyzja != 2 ) {
           System.out.println("Nie rozumiem :(");
           System.out.print("Sprobuj ponownie: ");
           decyzja = scanner.nextInt();
       }
       if(decyzja == 1) {
           for (int i = 1; i <= liczba; i++) {
                System.out.println(tekst);
              }
           }
        if(decyzja == 2) {
            System.out.println("Dowidzenia :)");
        }
       }
}
