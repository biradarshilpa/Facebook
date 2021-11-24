package amazonimplementations;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    private int price;

    public Product(String productname ,int productprice){
        this.productName = productname;
        this.price= productprice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getProductList(){
        List <String>  productList = new ArrayList<>();
        productList.add("Apple MAcBook pro");
        productList.add("Apple ipad");
        productList.add("Apple phone");
        return productList;
    }


}
