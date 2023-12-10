
import java.time.LocalDate;
import java.util.Set;

public class Pet extends Animal {
    protected Pet(String name, LocalDate birthday, Type type) {
        super(name, birthday, type);
    }

    protected Pet(String name, LocalDate birthday, Set<String> commands, Type type) {
        super(name, birthday, commands, type);
    }
}