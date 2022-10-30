package Product;

import java.util.*;

public class Product {
    private final String nameProduct;
    private final int price;
    private final int amount;
    private  boolean checked;

    public void setChecked() {
        this.checked = false;
    }

    public Product(String nameProduct, int price, int amount) {
        if (nameProduct == null || nameProduct.isEmpty()||price <= 0 || amount <= 0) {
            throw new IllegalArgumentException("Заполните карточку продуктов полностью");
        } else {
            this.nameProduct = nameProduct;
            this.price = price;
            this.amount = amount;
            this.checked = true;
        }
    }

//    public static Set<Product> product = new HashSet<>();
//
////    метод для вставки с исключением
//    public static void addProduct(Product prod) {
//        for (Product i : product) {
//            if (product.contains(prod)) {
//                throw new IllegalArgumentException("Такой продукт уже добавлен в список");
//            }
//        }
//        System.out.println("Добавляем " + prod + " в список покупок");
//        product.add(prod);
//    }


    public String getNameProduct() {
        return nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isChecked() {
        return checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct);
    }

    @Override
    public String toString() {
        return "Product.Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", amountKg=" + amount +
                '}' + "\n";
    }
}

