package qsp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataDrivenTesting {

	public static void main(String[] args) {

		ArrayList< String> lst=new ArrayList<String>();
		lst.add("https://demo.actitime.com/");
		lst.add("admin");
		lst.add("admin@actitime.com");
		lst.add("manager");
	System.out.println(lst.get(2));   // print email instead of password(since new data is added)

		Map<String,String> map=new HashMap<String,String>();
		map.put("url", "https://demo.actitime.com/");
		map.put("username", "admin");
		map.put("String", "admin@actitime.com");
		map.put("password", "manager");
System.out.println(map.get("password")); //print password even if one more data is added or removed
	}

}
