package eu.vat.startpoint;


import eu.vat.model.*;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Startpoint {

	static HashMap<String, Double> map = new HashMap<String, Double>();
	// variables to sort result in ascending and descending orders
	final static boolean ASC = true;
	final static boolean DESC = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper = new ObjectMapper();
		// parse from the URL
		try {
			URL url = new URL("http://jsonvat.com");
			Root page = objectMapper.readValue(url, Root.class);

			printParsedObject(page);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Get the parsed result
	private static void printParsedObject(Root page) {
		// Get Rate class instance from the root class
		List<Rate> posts = page.getRates();
		
		// hashmap to store the country name and vat rate
		final HashMap<String, Double> hm = new HashMap<String, Double>();

		// Iterate through the rate class and assign for the Periods class instance
		for (Rate post : posts) {

			List<Periods> a = post.getPeriods();
			// since there are more than one standard vat rate return this variable help us
			// to return the recent one

			int i = 0;
			for (Periods model : a) {
				++i;
				if (i > 2)
					break;
				Rates ob = model.getRates();
				// Put the country name and the Vat Rate  in the hashmap ,
				hm.put(post.getName(), (double) ob.getStandard());

			}

		}
        // sort the hasmap value ascending or descending based on the need of the user 
		
		HashMap<String, Double> sortedMapAsc = Calculate.sortByComparator(hm, DESC);
		// call the class that will return the top n result, the first parameter is for sorted hasmap object and the 
		//second parameter for Top N parameters 
		System.out.println("EU countries with the highest standard VAT rate"); 
		Calculate.printMap(sortedMapAsc, 3);
		System.out.println();
		HashMap<String, Double> sortedMapAsc1 = Calculate.sortByComparator(hm, ASC);
		//call the class that will return the top n result, the first parameter is for sorted hasmap object and the 
		//second parameter for Top N parameters 
		System.out.println("EU countries with the Lowest standard VAT rate"); 
		Calculate.printMap(sortedMapAsc1, 3);

	}

}
