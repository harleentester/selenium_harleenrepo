import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeList {
    public static void addEmployee()
    {
        int size;  int i;
        System.out.println("Please enter no. of employees you want to enter: Size =");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        List<String> alist= new ArrayList<>();
        System.out.println("Please enter name of employees:");
        for(i=0;i<=size;i++)
        {
            Scanner mc = new Scanner(System.in);
            String name = mc.nextLine();
            System.out.println(name);
            alist.add(name);
        }
        System.out.println("Your new list is");
        System.out.println(alist);
    }





    //Adding "Steve" at the fourth position
     // alist.add(3, "Steve");

    //displaying elements
      //System.out.println(alist);




}
