import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Box<T extends Fruit> {
    ArrayList<T> box;

    public Box() {
        box = new ArrayList<>();
    }

    public Box(T fruit) {
        box = new ArrayList<>();
        box.add(fruit);
    }

    public boolean compare(Box<?> box){
        if(this.getWeight()>box.getWeight())
            return true;
        return false;
    }

    public float getWeight(){
        float weight = 0.0f;
        for (T s: box) {
            weight+= s.weight;
        }
        return weight;
    }
    public void addFruit(Box<T> box){
        try {
            this.box.addAll((Collection<? extends T>) box);
            ((Collection<?>) box).clear();
        }catch (ClassCastException e){
            System.out.println("нельзя перемешивать");
        }

    }
    public void addFruit(T  fruit)throws ClassCastException{
        try {
        this.box.add(fruit);
        ((Collection<?>) box).clear();
        }catch (ClassCastException e){
            System.out.println("нельзя перемешивать");
        }
    }


}
