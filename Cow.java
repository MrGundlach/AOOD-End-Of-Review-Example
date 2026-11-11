public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override 
    public String speak() {
        return getName() + " the cow says Mooo...";
    }

}