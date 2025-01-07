public class Unit5 {
public static void main(String[] args){

    Employee emp = new Employee(22, "Mr.Crane", 35 );
    Employee emp2 = new Employee();

    System.out.println("Employee ID: " + emp.getId());
    System.out.println("Employee Name: " + emp.getName());
    System.out.println("Employee Salary: " + emp.getSalary());
    System.out.println("Employee Pay: " + emp.calculatePay(40) + " per week."); // assume 40 hours per week
    System.out.print("\n\n");
    System.out.println("Employee ID: " + emp2.getId());
    System.out.println("Employee Name: " + emp2.getName());
    System.out.println("Employee Salary: " + emp2.getSalary());
    System.out.println("Employee Pay: " + emp2.calculatePay(40) + " per week.");
}

}
