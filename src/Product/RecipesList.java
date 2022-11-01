package Product;

import java.util.*;

public class RecipesList {
    private final Map<Recipes, Integer> recipes =new HashMap<>();

    public Map<Recipes, Integer> getRecipes() {
        return recipes;
    }

    public void addRecipes(Recipes recipes, Integer integer) {
        this.recipes.put(recipes, recipes.getRecipesPrise());
    }

    public void printRecipes() {
        Set<Map.Entry<Recipes,Integer>> printRecip = recipes.entrySet();
        for (Map.Entry<Recipes, Integer> recipEntry : printRecip) {
            System.out.print(recipEntry.getKey());
            System.out.println("Итого " + recipEntry.getValue() + " рублей");
        }
    }

    @Override
    public String toString() {
        return "RecipesList{" +
                "recipes=" + recipes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipesList that = (RecipesList) o;
        return Objects.equals(recipes, that.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipes);
    }
}
