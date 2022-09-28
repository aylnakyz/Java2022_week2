public class ProductManager {
    public void Add (Product product) {
        //JDBC kodları yazılarak veritabanıne kaydedilir:
        System.out.println("Ürün eklendi: " + product.getName());
    }
}
