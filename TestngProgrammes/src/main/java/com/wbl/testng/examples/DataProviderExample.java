package com.wbl.testng.examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {



    @Test(dataProvider = "LoginDataProvider",dataProviderClass = CustomDataProvider.class)
    public void login(String email, String pwd){
        System.out.println("Email " +email +" password " +pwd);
    }


   /*@DataProvider(name ="LoginDataProvider")
    public Object[][] getData() {
       String[][] data = {{"abc", "abc@gmail.com"}, {"xyz", "xyz@gmail.com"}, {"mno", "mno@gmail.com"}};
        return data;
    }*/



}