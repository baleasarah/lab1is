import java.util.ArrayList;
import java.util.Collections; // Import the Collections class
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Parinte> list = new ArrayList<>();
        list.add(new Parinte("Maria"));
        list.add(new Copil("Ioana"));
        list.add(new Parinte("Sarah"));
        list.add(new Parinte("Ana"));

        // Sort the list alphabetically based on the names
        Collections.sort(list, new Comparator<Parinte>() {
            @Override
            public int compare(Parinte p1, Parinte p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        for (Parinte i : list) {
            i.Afiseaza();
        }
    }
}