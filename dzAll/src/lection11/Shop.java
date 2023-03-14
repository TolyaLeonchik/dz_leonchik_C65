package lection11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    private HashMap<String, Product> products;

    public Shop() {
        this.products = new HashMap<>();
    }

    public void addProduct(String shCode, Product product) {
        this.products.put(shCode, product);
    }

    public void deleteProduct(String shCode) {      //мой правильный простой вариант
        this.products.remove(shCode);
    }

    public boolean removeProduct(String shCode) throws ProductNotExistsException{       //второй вариант с проверкой есть ли такой продукт
        boolean isExist = this.products.containsKey(shCode);
        if (!isExist) {
            throw new ProductNotExistsException();
        }
        this.products.remove(shCode);
        return isExist;
    }

    public void removeAllProducts() throws ProductNotExistsException{
            removeProduct("333");
    }

    public boolean isProductExist(String nameOfProduct) {
        return this.products.containsValue(nameOfProduct);
    }

    /*public List<Product> getProductByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product p: this.products.values()) {
            if (p.category.equals(category)) {
                result.add(p);
            }
        }
        return result;
    }*/
    public Map<String, Product> getProductByCategory(String category) {     //со штрихкодом
        HashMap<String, Product> result = new HashMap<>();
        for (Map.Entry<String, Product> entry: this.products.entrySet()) {
            if (entry.getValue().category.equals(category)) {
                result.put(entry.getKey(), entry.getValue());
                System.out.printf("ShCode: %s \t Category: %s\n\n", entry.getKey(), entry.getValue().category);
            }
        }
        for (Map.Entry<String, Product> entry : this.products.entrySet()) {
            System.out.printf("ShCode: %s \t Product: %s\n", entry.getKey(), entry.getValue().name);
        }
        return result;
    }
}
