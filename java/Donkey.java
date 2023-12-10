
import java.time.LocalDate;
import java.util.Set;

public  class Donkey extends Pack {
    public Donkey(String name, LocalDate birthday) {
        super(name, birthday, Animal.Donkey);
    }

    public Donkey(String name, LocalDate birthday, Set<String> commands) {
        super(name, birthday, commands, Animal.Donkey);
    }
}