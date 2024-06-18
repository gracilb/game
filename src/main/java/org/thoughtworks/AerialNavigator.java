package org.thoughtworks;

public class AerialNavigator extends FlyingCharacters {
    public AerialNavigator(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Flying high");
    }

    public void shootArrow(){
        System.out.println("Shoot Arrow");
    }
}
