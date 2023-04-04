//create a main class
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        //create a collection of Employee class and Add elements
        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(103, "Jayesh", 34));
        empList.add(new Employee(105, "Lavish", 22));
        empList.add(new Employee(102, "Yash", 21));
        empList.add(new Employee(105, "Shiva", 44));
        empList.add(new Employee(101, "Amish", 55));
        System.out.println("Before Sorting");
        for (Employee e : empList) {
            System.out.println(e.e_id + " , " + e.e_name + " , " + e.e_age);
        }
        //Sort Collection by using sort method
        Collections.sort(empList);
        System.out.println("\nAfter Sorting");
        for (Employee e : empList) {
            System.out.println(e.e_id + " , " + e.e_name + " , " + e.e_age);
        }
    }
}
