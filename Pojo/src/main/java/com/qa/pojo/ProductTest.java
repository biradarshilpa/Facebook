package com.qa.pojo;

import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

public class ProductTest {

    public static void main(String[] args) throws SerializeException, ParseException {
        //pojo to json (serialization)

        JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
        String sellerName[] = {"Neon Enterprise", "ABC software", "XYZ IT solutions"};
        Product product = new Product("MACbook Pro", 1000, "white", sellerName);
        String json = jsonSerializer.serialize(product);
        System.out.println(json);



        //pojo to xml
        XmlSerializer xmlSerializer = XmlSerializer.DEFAULT_NS_SQ_READABLE;
        String xml =  xmlSerializer.serialize(product);
        System.out.println(xml);


        //json - pojo (DeSerialization)

        JsonParser jsonParser =JsonParser.DEFAULT;
        String jsonVal ="{\n" +
                "\t\"color\": \"white\",\n" +
                "\t\"name\": \"MACbook Pro\",\n" +
                "\t\"price\": 1000,\n" +
                "\t\"sellerName\": [\n" +
                "\t\t\"Neon Enterprise\",\n" +
                "\t\t\"ABC software\",\n" +
                "\t\t\"XYZ IT solutions\"\n" +
                "\t]\n" +
                "}";
        Product pro = jsonParser.parse(jsonVal,Product.class);
        System.out.println(pro.getColor());
        System.out.println(pro);



    }
}