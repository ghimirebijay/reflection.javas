import java.time.LocalDate;

Class Employee{
    public Employee (String n, double s,int year,int month,int day){
    name=n;
    //salary=s;
    LocalDate hireDay= LocalDate.now(year,month,day);
}
public static void main(String[] args) {
    Employee e= new Employee("Romeo", 10000, 1997, 3, 13)
    //e.raiseSalary(10);
    System.out.println(e.getName()+""+e.getSalary());
}