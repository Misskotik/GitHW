package JC4two;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
     // Task 2
    public static void main(String[] args) {

        Contact myPhone = new Contact();
        myPhone.addContact("Popov", 8900023092L);


        Contact phone2 = new Contact();
        phone2.addContact("Gavrilov", 89011111100L);


        Contact phone3 = new Contact();
        phone3.addContact("Popov", 89023333333L);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(myPhone);
        phoneBook.add(phone2);
        phoneBook.add(phone3);

        System.out.println(phoneBook);

        HashMap<Long, String> phoneBook1 = new HashMap<>();

        phoneBook1.put(8900023092L, "Popov");
        phoneBook1.put(89011111100L, "Gavrilov");
        phoneBook1.put(89023333333L, "Popov");


        System.out.println(phoneBook1);
        phoneBook1.forEach((key, value) -> {
            if (value.equals("Popov")) {
                System.out.println(value + " " + key);
            }
        });



    }
    }





















