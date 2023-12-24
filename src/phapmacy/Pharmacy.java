package phapmacy;


import java.util.*;
import java.util.function.Consumer;

public class Pharmacy implements Iterator<Component>, Comparable <Pharmacy> {
    private int index;
    private int sPower;
    private final List<Component> components;


    public Pharmacy() {
        this.index = 0;
        this.sPower = 0;
        this.components = new ArrayList<>();
    }
    public void addComponents(Component ... components){
        if (components.length == 0) System.out.println("Вы ничего не добавили!");
        else Collections.addAll(this.components, components);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return index == pharmacy.index && Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, components);
    }


    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
//        component c = components.get(index);
//        index++;
//        return c;
        return components.get(index++);
    }


    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(o.sPower, this.sPower());
    }

    public int sPower(){
        int result = 0;
        for (Component c : this.components){
            result = result + c.getPower();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "index=" + index +
                ", sPower=" + sPower +
                ", components=" + components +
                '}';
    }
}


