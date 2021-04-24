package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class BicMacBuilder {
        public static final String SESAME = "SESAME";
        public static final String NOSESAME = "NOSESAME";
        public static final String STANDARD = "STANDARD";
        public static final String ONETHOUSANDISLANDS = "ONETHOUSANDISLANDS";
        public static final String BARBECUE = "BARBECUE";
        public static final String LETTUCE = "LETTUCE";
        public static final String ONION = "ONION";
        public static final String BEACON = "BEACON";
        public static final String PICKLES = "PICKLES";
        public static final String CHILIPEPPERS = "CHILIPEPPERS";
        public static final String MUSHROOMS = "MUSHROOMS";
        public static final String SHRIMPS = "SHRIMPS";
        public static final String CHEESE = "CHEESE";
        private String bun;
        private int burgers;
        private String sauce;
        private final List<String> ingredients = new ArrayList<>();

        public BicMacBuilder bun(String bun) {
            return injectBun(bun);
        }

        public BicMacBuilder burgers(int burgers) {
            return injectBurgers(burgers);
        }

        public BicMacBuilder sauce(String sauce) {
            return injectSauce(sauce);
        }

        public BicMacBuilder ingredient(String ingredient) {
            return injectIngredients(ingredient);
        }

        private BicMacBuilder injectBun(String bun) {
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

        private BicMacBuilder injectSauce(String sauce) {
            if (isSauce(sauce)) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("there is no sauce like " + sauce);
            }
        }

        private BicMacBuilder injectIngredients(String ingredient) {
            if (isIngredient(ingredient)) {
                this.ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("there is no ingredient like " + ingredient);
            }
        }

        private boolean isChoicePossible(String bun) {
            return bun.equals(SESAME) || bun.equals(NOSESAME);
        }

        private boolean isSauce(String sauce) {
            return sauce.equals(STANDARD) || sauce.equals(ONETHOUSANDISLANDS) ||
                    sauce.equals(BARBECUE);
        }

        private boolean isIngredient(String ingredient) {
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

