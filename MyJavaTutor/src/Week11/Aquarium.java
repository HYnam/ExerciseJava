package Week11;

import java.util.ArrayList;
import java.util.List;

class Fish {}

class Goldfish extends Fish {}

class Guppy extends Fish {}

class Betta extends Fish {}

public class Aquarium<T extends Fish> {
    private List<T> fish;

    public Aquarium() {
        this.fish = new ArrayList<>();
    }

    // implement the remaining methods here
    public void addFish(T Fish){
        if (this.fish instanceof Betta){

        } else if (this.fish.contains(Betta) instanceof Betta){

        } else {
            fish.add(Fish);
        }
    }

    public void removeFish(T Fish){
        fish.remove(Fish);
    }

    public List<T> getFish(){
        return fish;
    }
}
