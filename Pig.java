public class Pig extends Animal{
    private int penAssigned;

    public Pig(String pigName) {
        super(pigName);
        penAssigned = 1;
    }

    public Pig(String pigName, int pen) {
       super(pigName);   
       penAssigned = pen;
    }

    public int getPenAssigned() {
        return penAssigned;
    }

    @Override 
    public String speak() {
        return getName() + " the pig says Oink...";
    }
}
