import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;



public class PeopleReader {
    private final String filename;


    public PeopleReader(String filename) {
        this.filename = filename;
    }

    public List<Person> getAllPeople() throws IOException {
        List<Person> people = new ArrayList<>();

        List<String> lines = Files.readAllLines(Path.of(filename));
        for (String line : lines) {
            String[] output = line.split(" ");
            String firstName = output[0];
            if(isNumeric (output[2]) == true) {
                String middleName = null;
                String lastName = output [1];
                String age = output[2];
                String fear = output[3]; 
                people.add(new Person (firstName, lastName, age, middleName, fear));
                
            } else {
                String middleName = output[1];
                String lastName = output [2];
                String age = output[3];
                String fear = output[4]; 
                people.add(new Person (firstName, lastName, age, middleName, fear));
            }
        }
            return people;
    }

    public  boolean isNumeric(String input) {
        try {
            Integer.parseInt (input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
            
    
