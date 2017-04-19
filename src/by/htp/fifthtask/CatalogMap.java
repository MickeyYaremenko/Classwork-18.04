package by.htp.fifthtask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CatalogMap {

	public static void main(String[] args) {

		String laptop = "Laptop";
		String phone = "Smartphone";
		String tv = "TV";
		String camera = "Photocamera";
		String headphones = "Headphones";

		Integer intLaptop = 0;
		Integer intPhone = 1500;
		Integer intTv = 25000;
		Integer intCamera = 5000;
		Integer intHP = 4000;

		HashMap<String, Integer> catalogMap = new HashMap<>();

		catalogMap.put(laptop, intLaptop);
		catalogMap.put(phone, intPhone);
		catalogMap.put(tv, intTv);
		catalogMap.put(camera, intCamera);
		catalogMap.put(headphones, intHP);

		System.out.println(catalogMap.toString());

		Map<String, Integer> finalMap = new LinkedHashMap<>();

		ArrayList<Integer> tempList = new ArrayList<>(catalogMap.values());
		Collections.sort(tempList);

		for (int i = 0; i < tempList.size(); i++) {
			for (Map.Entry<String, Integer> entry : catalogMap.entrySet()) {
				if (tempList.get(i).equals(entry.getValue())) {
					finalMap.put(entry.getKey(), entry.getValue());
				}
			}
		}
		
		System.out.println(finalMap.toString());
		
	}

}
