import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    private static Nursery Nu;
    private static Scanner in;
    
    public static void main(String[] args){
        Nu = new Nursery();
        in = new Scanner(System.in);
        while (true) {
            menu();
            execOperation(getInt("ваш выбор: "));
            getText("Нажмите Enter для продолжения ...");
        }
    }
    private static void menu() {
    
        clearConsole();
        
        System.out.println("           Menu:");
        System.out.println("1. загрузите список животных");
        System.out.println("2. сохраните список животных");
        System.out.println("3. вывести список животных");
        System.out.println("4. добавить новое животное");
        System.out.println("5. добавть новые команды ");
        System.out.println("6. вывести животных по дате рождения");
        System.out.println("7. счетчик животных");
        System.out.println("0. выход из программы");
        System.out.println();
    }
    
    private static void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
    public static void execOperation(Integer operation) {
        try {
            switch (operation) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    loadAnimals();
                    break;
                case 2:
                    saveAnimals();
                    break;
                case 3:
                    printRegister();
                    break;
                case 4:
                    addAnimal();
                    break;
                case 5:
                    addCommand();
                    break;
                case 6:
                    findAnimal();
                    break;
                case 7:
                    countAnimals();
                    break;
                default:
                    System.out.println("Команда не существует...");
                    break;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            System.out.println("Ошибка");
            e.printStackTrace();
            return;
        }
    }
    
    protected static Integer getInt() {
        while (true) {
            try {
                return Integer.parseInt(getText());
            } catch (Exception e) {
                System.out.println("Неправильный ввод");
            }
        }
    }

    protected static Integer getInt(String text) {
        System.out.print(text);
        return getInt();
    }

    protected static LocalDate getDate() {
        while (true) {
            try {
                System.out.println("Введите дату в формате YYYY-MM-DD");
                return LocalDate.parse(in.nextLine());
            } catch (Exception e) {
                continue;
            }
        }
    }

    protected static String getText() {
        return in.nextLine();
    }

    protected static String getText(String text) {
        System.out.print(text);
        return getText();
    }

    protected static Animal getAnimal() {
        while (true) {
            try {
                System.out.println("Введите в формате: Type;Name;Birthday(YYYY-MM-DD);");
                return Animal.parse(in.nextLine());
            } catch (Exception e) {
                continue;
            }
        }
    }

    protected static Animal getAnimalIndex() {
        while (true) {
            try {
                return Nu.getRegister().get(getInt("Введите индекс животного: ") - 1);
            } catch (Exception e) {
                System.out.println("Животного не существует");
            }
        }
    }

    public static void printRegister() {
        Integer index = 0;

        System.out.println();
        for (Animal animal : Nu.getRegister()) {
            index += 1;
            String line = animal.toString().replace(";", " ");
            System.out.println(index + ". " + line);
        }
        System.out.println();
    }

    public static void loadAnimals() throws IOException {
        Nu.loadAnimals();
        System.out.println("Список животных загружен");
    }

    public static void saveAnimals() throws IOException {
        Nu.saveAnimals();
        System.out.println("Список животных сохранен");
    }   

    public static void findAnimal() {
        LocalDate date = getDate();
        for (Animal animal : Nu.getRegister()) {
            if (animal.getBirthday().compareTo(date) != 0)
                continue;
            String line = animal.toString().replace(";", " ");
            System.out.println(line);
        }
    }

    public static void countAnimals() {
        Integer all = 0, pet = 0, pack = 0;
        for (Animal animal : Nu.getRegister()) {
            all += 1;
            if (animal instanceof Pet)
                pet += 1;
            if (animal instanceof Pack)
                pack += 1;
        }
        System.out.println("Всего: " + all);
        System.out.println("Домашних: " + pet);
        System.out.println("Вьючных: " + pack);
    }

}