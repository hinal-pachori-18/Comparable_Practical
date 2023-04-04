//create a class Employee and implement comparable interface
public class Employee implements Comparable<Employee> {
    //create an instance variable
    int e_id;
    String e_name;
    int e_age;
    Employee(int e_id, String e_name, int e_age) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_age = e_age;
    }
    //Write sorting logic in compareTo() Method based on employee id
    @Override
    public int compareTo(Employee emp) {
        if (e_id > emp.e_id) {
            return 1;
        } else if (e_id < emp.e_id) {
            return -1;
        } else {
            return 0;
        }
    }
}
