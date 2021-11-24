package amazonimplementations;

public class Search {
    public String displayTheProduct(Product product){

        if(product.getProductList().contains(product.getProductName()))
        {
            return product.getProductName();
        }
        else
            return null;

    }
}
