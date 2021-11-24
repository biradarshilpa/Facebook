package stepdefinitions;

import amazonimplementations.Product;
import amazonimplementations.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
    Product product;
    Search search;

    @Given("I have Search a field on Amazon Page")
    public void i_have_search_a_field_on_amazon_page() {
        System.out.println("step:1 I am on search page");
    }

    @When("I search for product with name {string} and price {int}")
    public void i_search_for_product_with_name_and_price(String productName, Integer price) {
        System.out.println("step:2 Search the product with name and price " +productName +"price" +price);
         product = new Product(productName, price);
    }

    @Then("Product With name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
        System.out.println("step:3 Apple MAC book is displayed");
        search = new Search();
        String name = search.displayTheProduct(product);
        System.out.println("search product is : " +name );
    }


}
