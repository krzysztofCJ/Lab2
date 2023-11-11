// Klasa Samochod z prywatnymi polami ktore okeslaja cechy obiektu
public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String fuelType;
    private String bodyType;
    private String color;
    private boolean isAutomatic;

    // Konstruktor - metoda wywolywana podczas tworzenia obiektu klasy, inicjalizuje pola obiektu
    public Car(String brand, String model, int year, double price, String fuelType, String bodyType, String color, Boolean isAutomatic) {
        this.brand = brand;  //this.brand - odnosi się do pola obiektu klasy, brand - odnosi sie do argumentu przekazywanego do konstruktora
        this.model = model;
        this.year = year;
        this.price = price;
        this.fuelType = fuelType;
        this.bodyType = bodyType;
        this.color = color;
        this.isAutomatic = isAutomatic;
    }
}