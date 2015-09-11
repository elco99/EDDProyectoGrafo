package proyectografo;

import java.io.Serializable;

public class Peso implements Serializable{

    int weight;

    public Peso(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return weight+"";
    }

}
