package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.patterns.builder.bigmac.Bun.NOSESAME;
import static com.kodilla.patterns.builder.bigmac.Bun.SESAME;
import static com.kodilla.patterns.builder.bigmac.Ingredient.*;
import static com.kodilla.patterns.builder.bigmac.Sauce.*;

public class BigMac {

    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    private final List<Ingredient> ingredients;

    private BigMac(Bun bun, int burgers, Sauce sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public static class BicMacBuilder {
        private Bun bun;
        private int burgers;
        private Sauce sauce;
        private final List<Ingredient> ingredients = new ArrayList<>();

        public BicMacBuilder bun(Bun bun) {
            return injectBun(bun);
        }

        public BicMacBuilder burgers(int burgers) {
            return injectBurgers(burgers);
        }

        public BicMacBuilder sauce(Sauce sauce) {
            return injectSauce(sauce);
        }

        public BicMacBuilder ingredient(Ingredient ingredient) {
            return injectIngredients(ingredient);
        }

        private BicMacBuilder injectBun(Bun bun) {
            if (isChoicePossible(bun)) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("it is not possible to choose " + bun);
            }
        }

        private BicMacBuilder injectBurgers(int burgers) {
            if (burgers >= 0) {
                this.burgers = burgers;
                return this;
            } else {
                throw new IllegalStateException("number has to be > 0");
            }
        }

        private BicMacBuilder injectSauce(Sauce sauce) {
            if (isSauce(sauce)) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("there is no sauce like " + sauce);
            }
        }

        private BicMacBuilder injectIngredients(Ingredient ingredient) {
            if (isIngredient(ingredient)) {
                this.ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("there is no ingredient like " + ingredient);
            }
        }

        private boolean isChoicePossible(Bun bun) {
            return bun.equals(SESAME) || bun.equals(NOSESAME);
        }

        private boolean isSauce(Sauce sauce) {
            return sauce.equals(STANDARD) || sauce.equals(ONETHOUSANDISLANDS) ||
                    sauce.equals(BARBECUE);
        }

        private boolean isIngredient(Ingredient ingredient) {
            return ingredient.equals(LETTUCE) || ingredient.equals(ONION) ||
                    ingredient.equals(BEACON) || ingredient.equals(PICKLES) ||
                    ingredient.equals(CHILIPEPPERS) || ingredient.equals(MUSHROOMS) ||
                    ingredient.equals(SHRIMPS) || ingredient.equals(CHEESE);
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}

