package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class DataDriven {

	public static void main(String[] args) {
	ArrayList< String> lst=new ArrayList<String>();
	lst.add("http://demo.actitime.com/");
	lst.add("admin");
	lst.add("chrome");
	lst.add("manager");
	System.out.println(lst.get(2));
	HashMap<String,String> map=new HashMap<String,String>();
	map.put("url", "http://demo.actitime.com/");
	map.put("username", "admin");
	map.put("browser", "chrome");
	map.put("password", "manager");
	System.out.println(map.get("password"));
	}

}
