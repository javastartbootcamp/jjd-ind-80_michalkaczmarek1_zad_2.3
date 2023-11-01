package pl.javastart.task;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Mojito";
        drink.price = 13;
        drink.hasAlcohol = true;

        Ingredient ingredient1 = new Ingredient();
        ingredient1.name = "wódka";
        ingredient1.amount = 100;

        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "sok cytrynowy";
        ingredient2.amount = 10;

        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "woda";
        ingredient3.amount = 100;

        double capacityDrink = ingredient1.amount + ingredient2.amount + ingredient3.amount;

        System.out.printf("Drink: %s%n", drink.name);
        System.out.printf(Locale.US, "Cena: %.1fzł%n", drink.price);
        System.out.printf("Czy zawiera alkohol? %b%n", drink.name);
        System.out.println("Składniki:");
        System.out.printf("%s%n", ingredient1.name);
        System.out.printf("%s%n", ingredient2.name);
        System.out.printf("%s%n", ingredient3.name);
        System.out.printf("Pojemność: %.0fml", capacityDrink);
    }
}
