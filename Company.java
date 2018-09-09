import java.util.*;
import ou.*;

/**
 * Instances of class Company represent a collection of
 * employees that can be added to, removed, searched etc.
 * 
 * @author Sam Lichy
 * @version 25/04/18
 */
public class Company
{
   private Map<String, Set<Employee>> company;
   
   /**
    * Constructor for objects of class Company
    */
   public Company()
   {
     company = new HashMap<String, Set<Employee>>();
   }
   
   /**
    * Method to populate the map with some test data 
    * suitable to the chosen scenario
    */
   public void populateMap()
   {
      Set<Employee> department = new TreeSet<>();
      company.put("testCompany1", department);
   }
  
   /**
    * Iterates over all the map's keys to print out a
    * meaningful textual representation of each key in
    * the map and the associated value.
    */
   public void printMap()
   {
      Set<String> companyKeys = company.keySet();
     
      for (String key: companyKeys)
      {
         if (company.get(key).size() == 0)
         {
            System.out.println("The " + key + " department contains " +
                           company.get(key).size() + " employees.");
         }
         else
         {
            System.out.println("The " + key + " department contains " +
                           company.get(key).size() + " employees. They are listed as follows: " + 
                           company.get(key));
         }             
      }
   }
   
   /**
    * If the argument is a key in the map, the function prints 
    * a meaningful textual representation of its associated value, 
    * otherwise it prints an output line announcing that the key is 
    * not present.
    */
   public void printMapValue(String key)
   {
      Set<String> companyKeys = company.keySet();
     
      for (String keyInMap: companyKeys)
      {
         if (keyInMap == key)
         {
            System.out.println("The " + keyInMap + " department contains " +
                           company.get(keyInMap).size() + " employees: " + company.get(keyInMap));
         }
         else
         {
            System.out.println("That key is not present.");
         }               
      }
   }
  
   /**
    * Takes two arguments representing a key and a value. Adds the 
    * key and value to the map. If the key is already present the 
    * existing value is overwritten. 
    */
   public void addMapEntry(String key, Set<Employee> value)
   {
      if (company.containsKey(key))
      {
         company.put(key, value);
      }             
      else
      {
         company.put(key, value);
      }
   }
   
   /**
    * Takes a single argument representing a key in the map. 
    * If the key given as the argument exists, deletes the key–value 
    * pair from the map, and returns true, otherwise returns false.
    */
   public boolean deleteEntry(String key)
   {
      if (company.containsKey(key))
      {
         company.remove(key);
         return true;
      }             
      else
      {
         return false;
      }
   }
   
   /**
    * Takes two arguments representing a key in the map and an object 
    * in the associated value collection. Adds a new element to the collection 
    * of elements for the particular key. 
    * 
    * You can assume that the key exists in the map. 
    * 
    * Returns no value.
    */
   public void addValue(String key, Employee object)
   {
      company.get(key).add(object);
   }
   
   /**
    * Takes two arguments representing a key in the map and an object 
    * in the associated value collection. Deletes a particular element 
    * from the collection of elements for a particular key. You can assume 
    * that the key exists in the map and the corresponding collection contains 
    * the specified element.
    * 
    * Returns no value.
    */
   public void deleteValue(String key, Employee object)
   {
      company.get(key).remove(object);
   }
}
