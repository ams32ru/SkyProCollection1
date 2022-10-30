package Product;

import java.util.HashSet;
import java.util.Set;

public class RecipesList {
    private final Set<Recipes> recipes =new HashSet<>();

    public void addRecipes(Recipes recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже существует");
        } else {
            recipes.add(recipe);
        }
    }
}
