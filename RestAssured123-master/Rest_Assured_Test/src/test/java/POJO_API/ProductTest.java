package POJO_API;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

public class ProductTest {

	public static void main(String[] args) throws SerializeException, ParseException {

		// POJO--->> Json === Serialization

		JsonSerializer json = JsonSerializer.DEFAULT_READABLE;
		Product_Ecom P1 = new Product_Ecom("Apple", 5000, "Black");
		String Json1 = json.serialize(P1);
		System.out.println(Json1);
		
		System.out.println("*************************************************");
		// POJO --> XML
		
		XmlSerializer XML=XmlSerializer.DEFAULT_NS_SQ_READABLE;
		String XML1=XML.serialize(P1);
		System.out.println(XML1);
		
		System.out.println("*************************************************");
		
		//POJO --> HTML
		
		HtmlSerializer HTML=HtmlSerializer.DEFAULT_SQ_READABLE;
		String HTML1=HTML.serialize(P1);
		System.out.println(HTML1);
		
		System.out.println("*************************************************");
		
		//JSON---> POJO 
		
		JsonParser JSON=JsonParser.DEFAULT;
		String Jsonvalue="{\r\n"
				+ "	\"color\": \"Black\",\r\n"
				+ "	\"name\": \"Apple\",\r\n"
				+ "	\"price\": 5000\r\n"
				+ "}";
		
		Product_Ecom PRO1=JSON.parse(Jsonvalue, Product_Ecom.class);
		System.out.println(PRO1.getColor());
		System.out.println(PRO1.getName());
		System.out.println(PRO1.getPrice());
		
		System.out.println("*************************************************");
		
		System.out.println(PRO1);
		
		
		

	}

}
