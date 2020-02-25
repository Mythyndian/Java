import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        /*
        Sprawdź, czy wprowadzona przez użytkownika liczba jest pierwsza (0 i 1 nie są pierwsze, 2 jest liczbą pierwszą,
         dalej standardowa definicja). Do sprawdzenia użyj prostego algorytmu sprawdzającego, czy liczba dzieli się
         przez wszystkie liczby mniejsze od jej połowy. Jeśli dzieli się przez którąkolwiek, nie jest pierwsza.
        */

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        if(CzyPierwsza(liczba) == true){
            System.out.println("Witam liczba pierwsza");
        }

        else {
            System.out.println("Nara lamusie nie pierwsza");
        }

    }

    public static boolean CzyPierwsza(int n) {
        if(n<2) {
            return false;
        }

        for(int i = 2; i*i <= n; i++) {
            if(n%i == 0) {
                return false;
            }
        }

        return true;
    }
}
