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
    public void addFish(T toBeAdded){
        Boolean bettaInside = false;

        for (T currentFish : fish){
            if (currentFish instanceof Betta){
                bettaInside = true;
            }
        }

        if (fish.size() > 0 && !(toBeAdded instanceof Betta) && bettaInside == false){
            fish.add(toBeAdded);
        } else if (fish.size() == 0) {
            fish.add(toBeAdded);
        }
    }

    public void removeFish(T Fish){
        fish.remove(Fish);
    }

    public List<T> getFish(){
        return fish;
    }
}