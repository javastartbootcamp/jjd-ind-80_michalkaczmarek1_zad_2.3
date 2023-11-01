package pl.javastart.task;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Mojito";
        drink.price = 13;
        drink.hasAlcohol = true;

        drink.ingredient1 = new Ingredient();
        drink.ingredient1.name = "wódka";
        drink.ingredient1.amount = 100;

        drink.ingredient2 = new Ingredient();
        drink.ingredient2.name = "sok cytrynowy";
        drink.ingredient2.amount = 10;

        drink.ingredient3 = new Ingredient();
        drink.ingredient3.name = "woda";
        drink.ingredient3.amount = 100;

        double capacityDrink = drink.ingredient1.amount + drink.ingredient2.amount + drink.ingredient3.amount;

        System.out.printf("Drink: %s%n", drink.name);
        System.out.printf(Locale.US, "Cena: %.1fzł%n", drink.price);
        System.out.printf("Czy zawiera alkohol? %b%n", drink.name);
        System.out.println("Składniki:");
        System.out.printf("%s%n", drink.ingredient1.name);
        System.out.printf("%s%n", drink.ingredient2.name);
        System.out.printf("%s%n", drink.ingredient3.name);
        System.out.printf("Pojemność: %.0fml", capacityDrink);
    }
}
