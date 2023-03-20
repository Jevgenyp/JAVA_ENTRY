import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Laptop {
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;
    private double price;
    
    public Laptop(String brand, String model, int ram, int storage, String os, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getRam() {
        return ram;
    }
    
    public int getStorage() {
        return storage;
    }
    
    public String getOs() {
        return os;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
        // создать множество ноутбуков
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("HP", "Pavilion", 8, 512, "Windows 10", "Silver", 849.99));
        laptops.add(new Laptop("Dell", "Inspiron", 16, 1000, "Windows 11", "Black", 1099.99));
        laptops.add(new Laptop("Apple", "MacBook Air", 8, 256, "macOS", "Gold", 999.99));
        // и т.д.
    
        // запросить критерии фильтрации у пользователя
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объём ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int ram = scanner.nextInt();
                filters.put("ram", ram);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int storage = scanner.nextInt();
                filters.put("storage", storage);
                break;
            case 3:
                System.out.println("Введите название операционной системы:");
                String os = scanner.next();
                filters.put("os", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filters.put("color", color);
                break;
            default:
                System.out.println("Некорректный выбор");
                return;
        }
    
        // выполнить фильтрацию и вывести результаты
        Set<Laptop> filteredLaptops = filterLaptops(laptops, filters);
        System.out.println("Результаты фильтрации:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop.getBrand() + " " + laptop.getModel() + " " + laptop.getRam() + " ГБ ОЗУ " +
                    laptop.getStorage() + " ГБ ЖД " + laptop.getOs() + " " + laptop.getColor() + " " + laptop.getPrice() + " руб.");
        }
    }

    private static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, Object> filters) {
        return null;
    }
    
    
}
