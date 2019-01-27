package eu.vat.startpoint;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Calculate {
	static HashMap<String, Double> sortByComparator(Map<String, Double> unsortMap, final boolean order) {

		List<Entry<String, Double>> list = new LinkedList<Entry<String, Double>>(unsortMap.entrySet());

		// Sorting the list based on values
		Collections.sort(list, new Comparator<Entry<String, Double>>() {
			public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
				if (order) {
					return o1.getValue().compareTo(o2.getValue());
				} else {
					return o2.getValue().compareTo(o1.getValue());

				}
			}
		});

		// Maintaining insertion order with the help of LinkedList
		HashMap<String, Double> sortedMap = new LinkedHashMap<String, Double>();
		for (Entry<String, Double> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

	// Return The top N or the bottom N item based on user request
	public static void printMap(HashMap<String, Double> map, int n) {
        
		for (Entry<String, Double> entry : map.entrySet()) {
			double value=0;
			System.out.println("Name : " + entry.getKey() + " Rate : " + entry.getValue());
			if(value==entry.getValue()) continue;
			n--;
			if (n == 0)
				break;

		}
	}
}
