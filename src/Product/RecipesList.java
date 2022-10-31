package Product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RecipesList {
    private final Set<Recipes> recipes =new HashSet<>();

    public Set<Recipes> getRecipes() {
        return recipes;
    }

    public void addRecipes(Recipes recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже существует");
        } else {
            recipes.add(recipe);
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
