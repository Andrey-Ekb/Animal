package java.Animal;

import java.time.LocalDate;
import java.util.Set;

public  class Dog extends Pack {
    public Dog(String name, LocalDate birthday) {
        super(name, birthday, Animal.Dog);
    }

    public Dog(String name, LocalDate birthday, Set<String> commands) {
        super(name, birthday, commands, Animal.Dog);
    }
}