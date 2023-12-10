

import java.time.LocalDate;
import java.util.Set;

public  class Horse extends Pack {
    public Horse(String name, LocalDate birthday) {
        super(name, birthday, Animal.Horse);
    }

    public Horse(String name, LocalDate birthday, Set<String> commands) {
        super(name, birthday, commands, Animal.Horse);
    }
}