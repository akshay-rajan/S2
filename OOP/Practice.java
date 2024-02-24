public class Practice {
    public static void main(String[] args) {

        Fish fish = new Fish("Goldfish", 0.5);
        System.out.println(fish);

    }
}

class Organism {
    String name;
    
    Organism(String name) {
        this.name = name;
    
    }

    public String toString() {
        return this.name;
    }
}

class Fish extends Organism {
    double weight;
    
    Fish(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public String toString() {
        return super.toString() + " (" + this.weight + " kg)";
    }
}