class Product {
    private int productCode;
    private String productName;
    private int price;

    Product(int productCode, String productName, int price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    int getPrice() {
        // Returns price of a product
        return this.price;
    }

    void display() {
        System.out.println("Product Code=" + productCode);
        System.out.println("Product Name=" + productName);
        System.out.println("Product Price=" + price);
    }
}

class LowestPrice {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Bag", 600);
        Product p2 = new Product(102, "Pencil", 20);
        Product p3 = new Product(103, "Book", 30);
        Product res;
        // Comparing Price
        if (p1.getPrice() < p2.getPrice()) {
            if (p1.getPrice() < p3.getPrice()) {
                res = p1;
            } else {
                res = p3;
            }
        } else {
            if (p2.getPrice() < p3.getPrice()) {
                res = p2;
            } else {
                res = p3;
            }
        }
        System.out.println("Lowest price product info");
        res.display();
    }
}
