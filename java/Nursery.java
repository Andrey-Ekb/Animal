import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Nursery {
    private ArrayList<Animal> register;

    public Nursery() {
        register = new ArrayList<>();
    }


    public void loadAnimals() throws IOException {
        File file = new File("C:\\Users\\andre\\Desktop\\Итоговая контрольная работа по специализации\\java\\Animal.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
            while ((line = br.readLine()) != null) {
                register.add(Animal.parse(line));
            }
            br.close();   
        }

    public void saveAnimals() throws IOException {
    
        FileWriter writer = new FileWriter("C:\\Users\\andre\\Desktop\\Итоговая контрольная работа по специализации\\java\\Animal.txt",
                    false);
            for (Animal animal : register) {
                writer.append(animal.toString() + "\n");
            }
    
            writer.flush();
            writer.close();
    }
    
    public ArrayList<Animal> getRegister() {
        return register;
    }
    
    public static void addCommand(){}

    public static void addAnimal() {}        
}
