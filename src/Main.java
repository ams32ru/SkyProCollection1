import HomeWorkMap.HomeWorkMap;
import PhoneBook.PhoneBook;
import Product.Product;
import Product.ProductList;
import Product.Recipes;
import Product.RecipesList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PhoneBook book1 = new PhoneBook();
        book1.addContact("Андреев андрей", "8_912_383_735");
        book1.addContact("Павлушин Аверий", "8_900_567_842");
        book1.addContact("Семенов Семен", "8_912_383_935");
        book1.addContact("Артемов Артем", "8_912_383_845");
        book1.addContact("Петрова Ольга", "8_912_383_735");
        book1.addContact("Соколова Светлана", "8_912_383_795");
        book1.addContact("Ишутин Артем", "8_912_383_735");
        book1.addContact("Александров Александр", "8_912_383_735");
        book1.addContact("Ильюшин Александр", "8_456_664_554");
        book1.addContact("Парамонов Георгий", "8_912_383_735");
        book1.addContact("Плющкин Мартын", "8_912_383_735");
        book1.addContact("Собакевич Александр", "8_912_383_735");
        book1.addContact("Орейро Наталья", "8_912_383_236");
        book1.addContact("Повали Таисия", "8_932_383_735");
        book1.addContact("Земченко Гаврила", "8_34_383_743");
        book1.addContact("Санчез Рик", "8_912_33443_7343");
        book1.addContact("Петрушина София", "8_912_853_842");
        book1.addContact("Анафонов Марк", "8_916_300_423");
        book1.addContact("Энгельс Фридриг", "8_912_804_426");
        book1.addContact("Кружемелик Кружок", "8_932_383_564");
        book1.addContact("Вахмурка Вахмур", "8_914_509_325");

//        book1.PrintContact();

        Product banans = new Product("Банан", 79, 2);
        Product pineapple = new Product("Ананас", 230, 3);
        Product apple = new Product("яблоко", 100, 4);
        Product cucumber = new Product("Огурец", 99, 1);
        Product cucumber2 = new Product("Огурец", 99, 2);
        ProductList productList = new ProductList();
        productList.addProduct(banans);
        productList.addProduct(cucumber);
//        productList.addProduct(cucumber2);
//        System.out.println("productList.toString() = " + productList.toString());

        Recipes salt = new Recipes("Cалат", Set.of(cucumber,apple,pineapple));
        Recipes fresh = new Recipes("Фрэш", Set.of(pineapple,banans));
        RecipesList recipesList = new RecipesList();
        recipesList.addRecipes(salt, salt.getRecipesPrise());
        recipesList.addRecipes(fresh, fresh.getRecipesPrise());


        recipesList.printRecipes();


//        Set<Integer> numbers = new HashSet<>();
//        Random random = new Random();
        //заполняем множество рандомом от 0 до 1000, нам нужно 20 значений
//        for (int i = 0; i < 20; i++) {
//            numbers.add(random.nextInt(1001));
//        }
//        System.out.println(numbers);

//        Set<Integer> deleteNumber = new HashSet<>();
        //копируем четные числа в новое множество
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                deleteNumber.add(number);
//            }
//        }
        //нечетных чисел больше нет
//        numbers = deleteNumber;
//        System.out.println(numbers);

//        Multipy multipy = new Multipy();
//        System.out.println(multipy.toString());

        HomeWorkMap mapRandom = new HomeWorkMap();
        mapRandom.appMapRandom("random1");
        mapRandom.appMapRandom("random2");
        System.out.println("mapRandom.toString() = " + mapRandom.toString());

    }
}