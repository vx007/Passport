import java.util.Date;
import java.util.HashSet;

public class Main {
    public static HashSet<Passport> passports = new HashSet<>();

    public static void main(String[] args) {

        add(new Passport(7809, "Иван", "Иванович", "Иванов", new Date(564466)));
        add(new Passport(6575, "Пётр", "Петрович", "Петров", new Date(5787997)));
        add(new Passport(6575, "Василий", "Васильевич", "Васильев", new Date(564898796)));

        System.out.println("Размер базы данных: " + passports.size());
        System.out.println(find(6575));
    }

    public static void add(Passport passport) {
        if (!passports.contains(passport)){
            passports.add(passport);
        } else {
            for (Passport element: passports)
                if (element.equals(passport)){
                    element.setFirstName(passport.getFirstName());
                    element.setMiddleName(passport.getMiddleName());
                    element.setLastName(passport.getLastName());
                    element.setDateOfBirth(passport.getDateOfBirth());
                }
        }
    }

    public static Passport find(int id) {
        for (Passport passport : passports) {
            if (passport.getId() == id) {
                return passport;
            }
        }
        return null;
    }
}
