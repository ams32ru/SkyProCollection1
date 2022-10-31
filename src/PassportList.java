import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PassportList {
    private final Set<Passport> passports = new HashSet<>();

    public void addUpdetePassport(Passport passport) {
        this.passports.add(passport);
    }

    public Set<Passport> getPassports() {
        return passports;
    }

    public Passport findByNumber(int number) {
        for (Passport passport : passports) {
            if (passport.getNumber() == number) {
                return passport;
            }
        }return null;
    }

    @Override
    public String toString() {
        return "PassportList{" +
                "passports=" + passports +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassportList that = (PassportList) o;
        return Objects.equals(passports, that.passports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passports);
    }
}
