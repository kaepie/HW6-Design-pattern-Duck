package duck;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable{

    List<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quackable){
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        if (!quackers.isEmpty())
        {
            for (int i = 0 ;i < 3;i++) {
                quackers.getFirst().quack();
                System.out.println();
            }
            quackers.removeFirst();
            if(!quackers.isEmpty()) {
                for (Quackable q : quackers) {
                    q.quack();
                    System.out.println();
                }
            }
        }
    }
}
