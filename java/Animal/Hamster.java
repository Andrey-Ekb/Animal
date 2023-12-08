package java.Animal;

import java.time.LocalDate;
import java.util.Set;

public  class Hamster extends Pack {
    public Hamster(String name, LocalDate birthday) {
        super(name, birthday, Animal.Dog);
    }

    public Hamster(String name, LocalDate birthday, Set<String> commands) {
        super(name, birthday, commands, Animal.Dog);
    }
}