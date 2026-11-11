abstract class Animal {
    private String name;
    private int barnNumber;

    public Animal(String name) {
        this.name = name;
        this.barnNumber = 1;
    }

    public String getName() {
        return this.name;
    }

    public int getBarnNumber() {
        return this.barnNumber;
    }

    public abstract String speak();
}