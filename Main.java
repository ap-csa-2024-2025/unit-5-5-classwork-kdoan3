import java.util.Scanner;

public class Main
{
  public static void createDog(Dog inDog, String breed, String name, String color, double size)
  {
    inDog.setBreed(breed);
    indog.setName(name);
    inDog.setColor(color);
    indog.setSize(size);
  }
  public static void main(String[] args)
  {
    Dog d = new Dog("weiner dog", "schnitzel", "red", 1000);
    Dog d1 = new Dog();
    Dog d2 = new Dog("terrier", "max", "white", 5);
    Dog d3 = new Dog1();
  }
} 

System.out.println("Enter the person's first name:");
String fname = sc.nextLine();

System.out.println("Enter the person's last name:");
String lname = sc.nextLine();

System.out.println("Enter the person's age:");
int age = sc.nextInt();

System.out.println("Enter the person's social security number:")
String ss = sc.nextLine();



Oven myOven = new Oven();
myOven.setMaxTemp(450);
myOven.setCurrentTemp(70);
String input = "";
while (!input.equals("q"))
{
  System.out.println(myOven); // comes from toString()
  System.out.println("To preheat the oven enter /"p/", to turn the oven off eneter /"o/", to restart enter /"r/", .");
  input = sc.nextLine();

  if (input.equals("p"))
  {
    System.out.println("Enter the temperature to preheat the oven to:");
    int temp = sc.nextInt();
    // preheat the oven

    sc.nextLine(); // consumer enter key left ehind by nextInt()
  }
  else if (input.equals("o"))
  {
    System.out.println("Turning the oven off.");
    int temp = 0;
  }
}

  

