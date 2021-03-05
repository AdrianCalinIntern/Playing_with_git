package unit1;

import java.util.ArrayList;

public class Arrays {

    public void arr() {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Dogs");
        animals.add("Cats");
        animals.add("Rabits");
        animals.add("Elephants");
        for (int i = 0; i < animals.size(); i++) {
            System.out.print("Animal: " + i + " " + animals.get(i) + "\n");
        }
    }

}
