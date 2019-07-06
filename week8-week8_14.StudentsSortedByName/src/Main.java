
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {


    public static void main(String[] args){
        List<Student> people = new ArrayList<Student>();
        people.add(new Student("Matti"));
        people.add(new Student("Pekka"));
        people.add(new Student("Mikko"));
        people.add(new Student("Arto"));
        people.add(new Student("Merja"));
        people.add(new Student("Pertti"));

        System.out.println(people);
                Collections.sort(people);
        System.out.println(people);
    }
}
