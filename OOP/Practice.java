public class Practice implements Prey, Predator{

    @Override
    public void flee() {
        System.out.println("I'm fleeing");
    }

    @Override
    public void hunt() {
        System.out.println("I'm hunting");
    }

    public static void main(String[] args) {

        Practice p = new Practice();
        p.flee();
        p.hunt();
        
    }
}

interface Prey {

    void flee();

}
interface Predator {
    
    void hunt();

}
