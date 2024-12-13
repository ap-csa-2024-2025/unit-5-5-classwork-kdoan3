import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create objects and test your classes in here

    Dog d = new Dog();
    d.setBreed("terrier");
    System.out.println(d.getBreed());

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

  }
}
