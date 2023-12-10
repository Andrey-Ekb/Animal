import java.time.LocalDate;
import java.util.Set;

public class Pack extends Animal {
    protected Pack(String name, LocalDate birthday, Type type) {
        super(name, birthday, type);
    }

    protected Pack(String name, LocalDate birthday, Set<String> commands, Type type) {
        super(name, birthday, commands, type);
    }
}