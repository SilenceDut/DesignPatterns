package com.silencedut.creational_patterns.builder;

/**
 * Created by SilenceDut on 16/7/5.
 */

public class BuilderTest {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts =new NutritionFacts.Builder(100,10)
                .carbohydrate(7)
                .fat(200)
                .carbohydrate(30)
                .build();
    }

}
