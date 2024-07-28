//6510450291 Chutipong Triyasith
package duck;

import java.util.Random;

public class Pigeon {
    public void coo(){
        Random random = new Random();
        int number = random.nextInt(2);
        if(number == 0){
            System.out.print("Quack");
        }
        else {
            System.out.println("coo");
            System.out.print("coo");
        }
    }
}
