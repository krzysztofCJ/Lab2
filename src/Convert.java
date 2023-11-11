import java.util.Scanner;

public class Convert
{
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        //Deklaracja zmiennych
        int intValue;
        double doubleValue;
        char charValue;
        boolean boolValue;

        //Pobieramy wartosci od uzytkownika
        System.out.println("Podaj liczbe calkowita: ");
        intValue = scanner.nextInt();

        System.out.println("Podaj liczbe zmiennoprzecinkowa: ");
        doubleValue = scanner.nextDouble();

        System.out.println("Podaj pojedynczy znak: ");
        charValue = scanner.next().charAt(0); // pozwala wczytać pojedynczy znak z wprowadzonego tekstu

        System.out.println("Podaj wartosc logiczna: ");
        boolValue = scanner.nextBoolean();

        //Konwersja
        int doubleToInt = (int) doubleValue;
        double intToDouble = (double) intValue;
        int charToInt = (int) charValue;
        String boolToString = String.valueOf(boolValue);

        //Wyswietlenie wynikow
        System.out.println("Konwersja double na int: " + doubleToInt);
        System.out.println("Konwersja int na double: " + intToDouble);
        System.out.println("Konwersja char na int: " + charToInt);
        System.out.println("Konwersja boolean na string: " + boolToString);

        scanner.close();
     }
}
