package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rowin Vleeshouwer <r.w.vleeshouwer@st.hanze.nl>
 * Basket that can contain multiple sorts of fruit
 */

public class FruitBasket<F extends Fruit> {

    private final List<F> contents;

    public FruitBasket(List<F> contents) {
        this.contents = contents;
    }

    public FruitBasket() {
        this.contents = new ArrayList<>();
    }

    public void add(F fruit) {
        contents.add(fruit);
    }

    public boolean contains(F fruit) {
        return contents.contains(fruit);
    }

    public boolean isEmpty() {
        return contents.isEmpty();
    }

    public int size() {
        return contents.size();
    }

    public F get() {
        return contents.remove(0);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Contents of this fruit basket: ");
        for (F fruit : contents) {
            stringBuilder.append(fruit).append(", ");
        }
        return stringBuilder.toString();
    }
}
