package phapmacy;

import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {

        Component pineciline = new Component("Pineciline", "10mg", 100); //создаем компоненты лекарств
        Component salt = new Component("Salt", "20gr", 10);
        Component sugar = new Component("Sugar", "87gr", 80);
        Component triflax = new Component("Triflax", "61gr", 40);

        Pharmacy pharmacy1 = new Pharmacy();  // создаем лекарства
        pharmacy1.addComponents(salt, pineciline);

        Pharmacy pharmacy2 = new Pharmacy(); // создаем лекарства
        pharmacy2.addComponents(sugar, pineciline);

        Pharmacy pharmacy3 = new Pharmacy(); // создаем лекарства
        pharmacy3.addComponents(triflax, pineciline);

        Pharmacy pharmacy4 = new Pharmacy(); // создаем лекарства
        pharmacy4.addComponents(sugar, pineciline);

        Pharmacy pharmacy5 = new Pharmacy(); // создаем лекарства
        pharmacy5.addComponents(triflax, pineciline);

//        for (Component c : pharmacy2) {
//            System.out.println(c);
//        }

        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        result.add(pharmacy5);

        System.out.println(result.size());

        List<Component> list = new ArrayList<>(); // создаем список с компонентами
        list.add(salt);
        list.add(pineciline);
        list.add(sugar);
        list.add(triflax);

        Collections.sort(list);

        System.out.println(list);
    }


}
