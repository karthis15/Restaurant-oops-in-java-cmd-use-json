package rest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MenuItemAdd {

	static ArrayList<MenuItems> menuItems = new ArrayList<>();

//	static void menuItems() {
//		menuItems.add(new MenuItems(1, "Vada", 10));
//		menuItems.add(new MenuItems(2, "Dosa", 50));
//		menuItems.add(new MenuItems(3, "Idli", 20));
//		menuItems.add(new MenuItems(4, "Bonda", 30));
//	}

	void menus() {
		Iterator<MenuItems> it = menuItems.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	static void demo() throws FileNotFoundException, IOException, ParseException {
//		JSONParser jsonParser = new JSONParser();
//		FileReader fileReader = new FileReader(".\\src\\rest\\Item.json");
//		Object obj = jsonParser.parse(fileReader);     
//		JSONObject object = (JSONObject) obj(i);       //org.json.simple.jsonarray cannot be cast to org.json.simple.jsonobject

		JSONParser parser = new JSONParser();
		JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(".\\src\\rest\\Item.json"));

		for (Object o : jsonArray) {
			JSONObject jsonobject = (JSONObject) o;
			long itemId = (Long) jsonobject.get("itemId");
			String itemName = (String) jsonobject.get("itemName");
			long itemprice = (Long) jsonobject.get("itemprice");
			menuItems.add(new MenuItems((int) itemId, itemName, (int) itemprice));
//			 System.out.println((int) itemId + " " + itemName + " " + itemprice);
		}
	}
}