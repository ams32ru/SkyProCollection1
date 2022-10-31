package Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class ProductList {
    private final Set<Product> productList = new HashSet<>();

    public void addProduct(Product product) {
        if (productList.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже добавлен в список");
        } else {
            productList.add(product);
        }
    }
    public void checkProduct(String name) {
        for (Product product : productList) {
            if (product.getNameProduct().equals(name)) {
                product.setChecked();
                break;
            }
        }
    }

    public void removeProduct(String name) {
        Iterator<Product> productIterator = this.productList.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getNameProduct().equals(name)) {
                productIterator.remove();
            }
            break;
        }
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productList=" + productList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(productList, that.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList);
    }
}
