package org.thoughtworks;

public class Warrior extends NonFlyingCharacter {
    public Warrior(String name) {
        super(name);
    }

    public void swingSword() {
        System.out.println("Swings sword");
    }

}
