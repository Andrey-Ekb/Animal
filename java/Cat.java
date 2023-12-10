package java.Animal;

import java.time.LocalDate;
import java.util.Set;

public  class Cat extends Pack {
    public Cat(String name, LocalDate birthday) {
        super(name, birthday, Animal.Cat);
    }

    public Cat(String name, LocalDate birthday, Set<String> commands) {
        super(name, birthday, commands, Animal.Cat);
    }
}
