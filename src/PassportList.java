import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private final Set<Passport> passports = new HashSet<>();

    public void addUpdetePassport(Passport passport) {
        this.passports.add(passport);
    }

    public Passport findByNumber(int number) {
        for (Passport passport : passports) {
            if (passport.getNumber() == number) {
                return passport;
            }
        }return null;
    }
}
