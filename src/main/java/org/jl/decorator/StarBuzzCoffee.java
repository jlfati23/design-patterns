package org.jl.decorator;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.description + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        Mocha darkRoastWithMocha = new Mocha(darkRoast);
        Whip darkRoastWithMochaAndWhip = new Whip(darkRoastWithMocha);
        System.out.println(darkRoastWithMochaAndWhip.getDescription() + " $" + darkRoastWithMochaAndWhip.cost());
    }
}
