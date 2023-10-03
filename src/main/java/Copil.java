public class Copil extends Parinte {
    public Copil(String name) {
        super(name); // Call the constructor of the superclass to set the name
    }

    public void Afiseaza() {
        System.out.println(getName()); // Use getName() from the superclass
    }
}
