import java.text.DecimalFormat; // bibliteka do zwrocenia max 2 liczb po przecinku

// Klasa Samochod z prywatnymi polami ktore okreslaja cechy obiektu
public class Car2 {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String fuelType;
    private String bodyType;
    private String color;

    // Konstruktor - metoda wywolywana podczas tworzenia obiektu klasy, inicjalizuje pola obiektu
    public Car2(String brand, String model, int year, double price, String fuelType, String bodyType, String color) {
        this.brand = brand; //this.brand - odnosi się do pola obiektu klasy, brand - odnosi sie do argumentu przekazywanego do konstruktora
        this.model = model;
        this.year = year;
        this.price = price;
        this.fuelType = fuelType;
        this.bodyType = bodyType;
        this.color = color;
    }
    // Metody (gettery i settery) do cech samochodu. Gettery sluza do pobierania wartosci pola, a settery do ustawiania wartosci pola w obiekcie.
    // Zwraca wartosc pola brand (marki samochodu)
    public String getBrand() {
        return brand;
    }

    // Ustawia wartosci pola brand (marki samochodu) na podstawie przekazanego argumentu
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    // Metoda ktora zwraca opis samochodu
    public String getCarInfo() {
        DecimalFormat priceFormat = new DecimalFormat("0.00"); // formatowanie ceny na max 2 miejsca po przecinku
        return "Marka: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Rok produkcji: " + year + "\n" +
                "Cena: " + priceFormat.format(price) + " PLN" + "\n" +
                "Rodzaj paliwa: " + fuelType + "\n" +
                "Typ nadwozia: " + bodyType + "\n" +
                "Kolor: " + color;
    }

    // Glowna metoda
    public static void main(String[] args) {
        // Tworzenie obiektu klasy
        Car2 myCar = new Car2("Peugeot", "308", 2009, 15900.00, "Diesel", "Kombi", "Czarny");

        // Wyswietlenie wyniku
        System.out.println(myCar.getCarInfo());
    }
}
