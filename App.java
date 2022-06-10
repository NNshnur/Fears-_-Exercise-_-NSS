import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {

        

        PeopleReader reader = new PeopleReader("people.txt");
        List<Person> people = reader.getAllPeople();
        Map<String, List<Person>> fears = groupByFear(people);

        for (String key : fears.keySet()) {

            System.out.println("Fear:   " + key );
            System.out.println ("-------------------");
            System.out.println ("-------------------");
            
                for (Person p: fears.get(key)) {

                    System.out.println (p);
                  
                 


                }
        }

    }

    public static Map<String, List<Person>> groupByFear(List<Person> people) {

        Map<String, List<Person>> m = new HashMap<String, List<Person>>();
        ArrayList<Person> spider = new ArrayList<>();
        ArrayList<Person> public_speaking = new ArrayList<>();
        ArrayList<Person> ghosts = new ArrayList<>();
        ArrayList<Person> heights = new ArrayList<>();
        ArrayList<Person> dental_surgery = new ArrayList<>();

        for (Person p : people) {
         //  System.out.println (p.getFear());

            if (p.getFear().equals("spiders")) {
                spider.add(p);
                
            }

            else if (p.getFear().equals("public speaking")) {
                public_speaking.add(p);
                

            } else if (p.getFear().equals ("ghosts")) {
                ghosts.add(p);
               
            }

            else if (p.getFear().equals("heights")) {
                heights.add(p);
                
            }

            else if (p.getFear().equals("dental surgery")) {
                dental_surgery.add(p);
                

            }

        }
        m.put("spider fear", spider);
        m.put("public speaking fear", public_speaking);
        m.put("ghosts", ghosts);
        m.put("heights", heights);
        m.put("dental surgery", dental_surgery);


        return m;
    }

}
