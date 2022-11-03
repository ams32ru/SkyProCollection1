package PhoneBook;

import java.util.*;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();

    public void addContact(String name, String number) {
        phoneBook.put(name,number);
    }
//    геттеры и сеттеры не добавляю, оставлю за собой этот выбор, ту стринг тоже, принтконтакта хватит
    public void PrintContact() {
        Set<Map.Entry<String, String>> set = this.phoneBook.entrySet();
        for (Map.Entry<String, String> pb : set) {
            System.out.print(pb.getKey()+" : ");
            System.out.println(pb.getValue());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook1 = (PhoneBook) o;
        return Objects.equals(phoneBook, phoneBook1.phoneBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneBook);
    }

}
