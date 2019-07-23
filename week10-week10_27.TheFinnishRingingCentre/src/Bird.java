
import java.util.Objects;


public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;
    private int observations; 

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
        this.observations = 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.latinName,  this.ringingYear);
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return latinName.equals(bird.latinName) && (ringingYear == bird.ringingYear);
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    
    
}


