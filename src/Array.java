import java.util.Arrays;
import java.util.IntSummaryStatistics; //biblioteka do korzystania z klasy IntSummaryStatistics

public class Array
{
    public static void main(String[] args)
    {
        //Tworzenie tablic z ich danymi
        int[] tab1 = {1,3,7,13,21,17};
        int[] tab2 = {1,5,6,1,8,13};

        //1 Obliczanie sumy wszystkich elementow, kazdej z tablic (bez petli)
        int sumTab1 = Arrays.stream(tab1).sum();  // konwertowanie tablicy na strumien (operacja obliczania sumy)
        int sumTab2 =  Arrays.stream(tab2).sum();

        // Wyswietlanie wynikow
        System.out.println("Suma wszystkich elementow tablicy tab1 wynosi:" + sumTab1);
        System.out.println("Suma wszystkich elementow tablicy tab2 wynosi:" + sumTab2);

        // 2 Znalezienie maksymalnej i minimalnej wartosci dla kazdej tablicy bez uzycia petli
        IntSummaryStatistics elTab1 = Arrays.stream(tab1).summaryStatistics(); // IntSummaryStatistics przechowuje statystyki bez koniecznosci pisania dodatkowych zmiennych
        IntSummaryStatistics  elTab2 = Arrays.stream(tab2).summaryStatistics();

        int maxTab1 = elTab1.getMax();
        int minTab1 = elTab1.getMin();
        int maxTab2 = elTab2.getMax();
        int minTab2 = elTab2.getMin();

        System.out.println("Wartosc maksymalna w tablicy tab1: " + maxTab1);
        System.out.println("Wartosc minimalna w tablicy tab1: " + minTab1);
        System.out.println("Wartosc maksymalna w tablicy tab2: " + maxTab2);
        System.out.println("Wartosc minimalna w tablicy tab2: " + minTab2);

        // 3 Oblicznie sredniej
        double avgTab1 = (double) sumTab1 / tab1.length;  //rzutowanie jawne na double
        double avgTab2 = (double) sumTab2 / tab2.length;

        // Wyświetlanie wynikow
        System.out.println("Srednia wszystkich wartosci w tablicy tab1 wynosi: " + avgTab1);
        System.out.println("Srednia wszystkich wartosci w tablicy tab2 wynosi: " + avgTab2);

        // 4 Utworzenie kopii istniejacej tablicy bez uzycia petli
        int[] copyTab1 = Arrays.copyOf(tab1, tab1.length);  // metoda  do tworzenia kopii tablicy -  Arrays.copyOf

        // Wyswietlenie wynikow
        System.out.println("Oryginalna tablica (tab1): " + Arrays.toString(tab1));  // Arrays.toString - wyswietlanie ciagu znakow
        System.out.println("Skopiowana tablica (copyTab1): " + Arrays.toString(copyTab1));

        // 5 Spelnianie kryterium np wartosci wieksze od "13" w tab1
        int value = 13;
        int[] filterTab1 =  Arrays.stream(tab1).filter(element -> element > value).toArray(); //filtrowanie elementów strumienia i zatrzymanie wiekszych od 13 oraz zwrocenie obiektu

        // Wyswietlenie wynikow
        System.out.println("Oryginalna tablica (tab1): " + Arrays.toString(tab1));
        System.out.println("Nowa tablica po filtrowaniu (filterTab1): " + Arrays.toString(filterTab1));

        // 6 Usuwanie elementu "3" w tab1
        int remove = 3;
        int[] newTab1 = Arrays.stream(tab1).filter(element -> element != remove).toArray(); //  zatrzymuje tylko te wartosci kóre nie są rowne "remove"

        // Wyswietlenie wynikow
        System.out.println("Oryginalna tablica (tab1): " + Arrays.toString(tab1));
        System.out.println("Nowa tablica po usunieciu elementu (newTab1): " + Arrays.toString(newTab1));

        //7 Laczenie tablic tab1 i tab2
        int newLengthTab12 = tab1.length + tab2.length;  //oblicznie dlugosci

        //Tworzenie nowej tablicy
        int[] mergeTab12 = new int[newLengthTab12];

        // Kopiowanie elementow z tab1 do mergeTab12
        System.arraycopy(tab1, 0, mergeTab12, 0, tab1.length); // zrodlowa tablica, pozycja poczatkowa, docelowa tablica, pozycja poczatkowa

        // Kopiowanie elementow z tab2 do mergeTab12
        System.arraycopy(tab2, 0, mergeTab12, tab1.length, tab2.length);

        // Wyswietlanie wyniku
        System.out.println("Tablica tab1: " + Arrays.toString(tab1));
        System.out.println("Tablica tab2: " + Arrays.toString(tab2));
        System.out.println("Polaczona tablica mergeTab12: " + Arrays.toString(mergeTab12));

        //8 Liczba wystapien okreslonej wartosci w tablicy 2 (wartosc 1)
        int valueCount = 1;
        // Zlicznie wystapien
        long count = Arrays.stream(tab2).filter(element -> element  == valueCount).count(); //filtrowanie wartosci i sprawdzenie czy sa rowne "1", count zawiera liczbe wystapien elementow w tablicy tab2

        // Wyswietlenie wyniku
        System.out.println("Tablica tab2: " + Arrays.toString(tab2));
        System.out.println("Liczba wystapien wartosci: " + valueCount + " wynosi: " + count);
    }

}
