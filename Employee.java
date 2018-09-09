
/**
 * Write a description of class Employees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee
{
   // instance variables
   private String name;
   private int age;
   private int salary;
   private String position;

   /**
    * Constructor for objects of class Employees
    */
   public Employee(String aName, int anAge, int aSalary, String aPosition)
   {
      // initialise instance variables
      this.name = aName;
      this.age = anAge;
      this.salary = aSalary;
      this.position = aPosition;
   }

   /**
    * Setter for the name
    */
   public void setName(String aName)
   {
      this.name = aName;
   }
   
   /**
    * Setter for the age
    */
   public void setAge(int anAge)
   {
      this.age = anAge;
   }
   
   /**
    * Setter for the salary
    */
   public void setSalary(int aSalary)
   {
      this.salary = aSalary;
   }
   
   /**
    * Setter for the position
    */
   public void setPosition(String aPosition)
   {
      this.position = aPosition;
   }
   
   /**
    * Getter for the name
    */
   public String getName()
   {
      return name;
   }

   /**
    * Getter for the age
    */
   public int getAge()
   {
      return age;
   }
   
   /**
    * Getter for the salary
    */
   public int getSalary()
   {
      return salary;
   }
   
   /**
    * Getter for the position
    */
   public String getPosition()
   {
      return position;
   }
   
    /**
    * Returns true if the names, ages, salaries
    * and positions for two Employee objects are 
    * the same, and false if otherwise.
    */
   @Override
   public boolean equals(Object obj)
   {
      Employee employee = (Employee) obj;
     
      if (this.getName() == employee.getName() && this.getAge() == employee.getAge()
      && this.getSalary() == employee.getSalary() && this.getPosition() == employee.getPosition())
      {
         return true;
      }
      else
      {
         return false;
      }
   }
 
   /**
    * Returns the number of characters in the name
    * of an Activity object.
    */
   @Override
   public int hashCode()
   {
      return this.getName().length();
   }
   
   /**
    * Provides a description of each employee which
    * will be used when the value of each key-pair
    * is printed in the class Company.
    */
   @Override
   public String toString()
   {
      return this.name; 
   }
}
