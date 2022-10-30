package Product;

import Product.Product;

import java.util.*;

public class Recipes {
    private final String recipesName;
    private final Set<Product> recipesProduct;

    public Recipes(String recipesName, Set<Product> recipesProduct) {
        if (recipesName == null || recipesName.isEmpty() || recipesProduct.size() == 0) {
            throw new IllegalArgumentException("Не заполненны все поля");
        }
        this.recipesName = recipesName;
        this.recipesProduct = recipesProduct;
    }

    public String getRecipesName() {
        return recipesName;
    }

    public Set<Product> getRecipesProduct() {
        return recipesProduct;
    }

    public int getRecipesPrise() {
        int sum = 0;
        for (Product product : recipesProduct) {
            sum += product.getPrice();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Objects.equals(recipesName, recipes.recipesName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipesName);
    }
}