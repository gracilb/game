package org.thoughtworks;

public class NonFlyingCharacter {

    private final String name;

    public NonFlyingCharacter(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("Can walk");
        // rest of the logic to make the character walk
    }

    public void takeDamage() {
        System.out.println("Takes Damage");
        // rest of the logic to make the character take damage
    }

    public String name() {
        return name;
    }
}
