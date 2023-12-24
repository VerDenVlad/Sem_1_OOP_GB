package phapmacy;

public class Component implements Comparable<Component>{
    private String name;
    private String weight;
    private int  power;


    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {    // переопределяем toString
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    public int getPower() {
        return power;
    }

    @Override
    public int compareTo(Component o) {
//        return Integer.compare(o.power, this.power); //сортировка по убыванию
        return Integer.compare(this.power, o.power);  //сортировка по возрастанию
//        if (this.power > o.power) return  -1;  //для смены сортировки поменять 1 и -1 местами
//        if (this.power < o.power) return  1;
//        return 0;
    }
}
