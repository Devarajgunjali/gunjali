package java_progrms;

import java.util.HashMap;

public class Hashmap {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
   // capitalCities.clear();
    System.out.println(capitalCities.size()); 
  }
}
