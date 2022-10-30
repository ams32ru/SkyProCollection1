import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Passport {
    private final int number;
    private String lastName;
    private String name;
    private String middleName;
    private final LocalDate localDate;

    public Passport(int number, String lastName, String name, String middleName, LocalDate localDate) {
        if (lastName == null || name == null || lastName.isBlank() || name.isBlank()
                || localDate == null || number == 0) {
            throw new IllegalArgumentException("Введите данные полностью");
        } else {
            this.number = number;
            this.lastName = lastName;
            this.name = name;
            this.middleName = middleName;
            this.localDate = localDate;
        }
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
