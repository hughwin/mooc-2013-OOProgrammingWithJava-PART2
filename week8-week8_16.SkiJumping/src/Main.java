
public class Main {

    public static void main(String[] args) {
        //UI a = new UI();
        //a.start();
        
        Jumper hugh = new Jumper("Hugh");
        Jumper jeremy = new Jumper("Jeremy");
        
       
        
        
        Jumpers jumpers = new Jumpers();
        
        jumpers.addJumper(hugh);
        jumpers.addJumper(jeremy);
        jumpers.jump();
    }
}
