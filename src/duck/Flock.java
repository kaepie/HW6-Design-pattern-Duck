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
        for(Quackable q : quackers){
            q.quack();
        }
    }
}
