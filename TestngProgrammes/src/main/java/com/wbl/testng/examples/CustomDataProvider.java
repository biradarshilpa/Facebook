package com.wbl.testng.examples;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {


    @DataProvider(name ="LoginDataProvider")
    public Object[][] getData() {
        String[][] data = {{"abc", "abc@gmail.com"}, {"xyz", "xyz@gmail.com"}, {"mno", "mno@gmail.com"}};
        return data;
    }
}
