package pl.edu.agh.kis.pets;

/**
 * Created by wojtek on 23.05.17.
 */
public class Pet {
    private String name;
    private int weight;

    public Pet(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
