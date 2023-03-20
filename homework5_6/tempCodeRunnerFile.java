import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String[]> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String[] phones) {
        phoneBook.put(name, phones);
    }

    public void removeContact(String name) {
        phoneBook.remove(name);
    }

    public String[] getPhones(String name) {
        return phoneBook.get(name);
    }

    public void printAllContacts() {
        for (String name : phoneBook.keySet()) {
            String[] phones = phoneBook.get(name);
            System.out.println(name + ":");
            for (String phone : phones) {
                System.out.println("\t" + phone);
            }
        }
    }

    public void printDuplicateNames() {
        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : phoneBook.keySet()) {
            if (nameCount.containsKey(name)) {
                nameCount.put(name, nameCount.get(name) + 1);
            } else {
                nameCount.put(name, 1);
            }
        }
        System.out.println("Duplicate names:");
        nameCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
    
        phoneBook.addContact("Иван Иванов", new String[]{"1111111", "2222222"});
        phoneBook.addContact("Светлана Петрова", new String[]{"3333333"});
        phoneBook.addContact("Кристина Белова", new String[]{"4444444", "5555555"});
        phoneBook.addContact("Анна Мусина", new String[]{"6666666"});
        phoneBook.addContact("Анна Крутова", new String[]{"7777777"});
        phoneBook.addContact("Иван Юрин", new String[]{"8888888", "9999999"});
        phoneBook.addContact("Петр Лыков", new String[]{"0000000"});
        phoneBook.addContact("Павел Чернов", new String[]{"1111111"});
        phoneBook.addContact("Петр Чернышов", new String[]{"2222222"});
        phoneBook.addContact("Мария Федорова", new String[]{"3333333"});
    }    
}
