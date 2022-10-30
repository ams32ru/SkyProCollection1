import Product.Product;
import Product.ProductList;
import Product.Recipes;
import Product.RecipesList;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Product banans = new Product("Банан", 79, 3);
        Product pineapple = new Product("Ананас", 230, 3);
        Product apple = new Product("яблоко", 100, 5);
        Product cucumber = new Product("Огурец", 99, 4);
        Product cucumber2 = new Product("Огурец", 99, 4);
        ProductList productList = new ProductList();
        productList.addProduct(banans);
        productList.addProduct(cucumber);
//        productList.addProduct(cucumber2);
        System.out.println("productList.toString() = " + productList.toString());

        Recipes recipes = new Recipes("Cалат", Set.of(cucumber, apple));
        RecipesList recipesList = new RecipesList();
       recipesList.addRecipes(recipes);

        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        //заполняем множество рандомом от 0 до 1000, нам нужно 20 значений
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1001));
        }
        System.out.println(numbers);

        Set<Integer> deleteNumber = new HashSet<>();
        //копируем четные числа в новое множество
        for (int number : numbers) {
            if (number % 2 == 0) {
                deleteNumber.add(number);
            }
        }
        //нечетных чисел больше нет
        numbers = deleteNumber;
        System.out.println(numbers);

        Multipy multipy = new Multipy();
        System.out.println(multipy.toString());

    }
}