package POJO_API;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

public class Employee_test {

	public static void main(String[] args) throws SerializeException, ParseException {
		
		
		//POJO-->JSON
		
		JsonSerializer JSON1=JsonSerializer.DEFAULT_READABLE;
		Employee_info E1 = new Employee_info("Pradeep", 111222333, "Pune");
		Employee_info E2 = new Employee_info("Pallavi", 123456, "Wani");
		String J1=JSON1.serialize(E1);
		String J2=JSON1.serialize(E2);
		
		System.out.println(J1);
		System.out.println(J2);
		
		//POJO-->XML
		
		XmlSerializer XML=XmlSerializer.DEFAULT_NS_SQ_READABLE;
		String X1=XML.serialize(E2);
		System.out.println(X1);
		
		// POJO to HTML
		
		HtmlSerializer HTML=HtmlSerializer.DEFAULT_SQ_READABLE;
		String H1= HTML.serialize(E2);
		String H2= HTML.serialize(E1);
		
		System.out.println(H1);
		System.out.println(H2);
		
		
		//JSON-->POJO
		
		JsonParser JSON=JsonParser.DEFAULT;
		String JSONvalue="{\r\n"
				+ "	\"id\": 111222333,\r\n"
				+ "	\"name\": \"Pradeep\",\r\n"
				+ "	\"place\": \"Pune\"\r\n"
				+ "}";
		
		Employee_info EMP	=JSON.parse(JSONvalue,Employee_info.class);
		
		System.out.println(EMP.getId());
		System.out.println(EMP.getName());
		System.out.println(EMP.getPlace());
		
		System.out.println(EMP);
		
		
		

	}

}
