package HW_3;

import java.util.Random;

public abstract class Pets {
    String name;
    String answer; 
    
    public Pets(String nm) {
        this.name = nm;
    }
    public boolean ifWantPlay(){
        Random r = new Random();
        return r.nextInt(2)==1;
    }

    public boolean ifWantEat(){
        Random r = new Random();
        return r.nextInt(2)==1;
    }
    
}