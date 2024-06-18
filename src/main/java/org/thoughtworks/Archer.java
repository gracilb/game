package org.thoughtworks;

public class Archer extends NonFlyingCharacter {
    public Archer(String name) {
        super(name);
    }

    public void shootArrow() {
        System.out.println("Shoots Arrow");
    }

}
