public class Employee
{
    private int id;
    private String name;
    private int salary;

    public Employee(int new_id, String new_name, int new_salary) {
        id = new_id;
        name = new_name;
        salary = new_salary;
    }

    //Default constructor (no parameters)
    public Employee() {
        id = 0;
        name = "N/A";
        salary = 0;
    }

    // Mutator methods
public void setId(int id) {
        this.id = id;
}
public void setName(String name) {
        this.name = name;
}
public void setSalary(int salary) {
        this.salary = salary;
}

//Accessor Methods
public int getId() {
        return id;
}

public String getName() {
        return name;
}

public int getSalary() {
        return salary;
}

public int calculatePay(int hours) {
        return hours*salary;

}

}
