package lection11;

public class Program {
    public static void main(String[] args) {
        Shop myShop = new Shop();
        //myShop.products.put("0001", "milk");
        Product p = new Product("milk", "drink");
        myShop.addProduct("0001", p);
        myShop.addProduct("0005", new Product("Makarony", "eat"));
        myShop.deleteProduct("0005");
        try {
            myShop.removeProduct("003");
        } catch (ProductNotExistsException e) {
            System.out.println("Product not exist");
        }
        myShop.addProduct("002", new Product("Pizza", "eat"));
        myShop.isProductExist("003");
        try {
            myShop.removeAllProducts();
        } catch (ProductNotExistsException e) {
            System.out.println("Product not exist");
        }
        myShop.getProductByCategory("drink");
    }
}
