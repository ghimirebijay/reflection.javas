package inheritance ;
import java.time.*;
public class Employees {
 public String name;
 private double salary;
 private LocalDate hireDay;
 public Employees (String name, double salary,int year,int month,int day){
    this.name;
    this.salary;
    hireDay=LocalDate.of(year,month, day);
 }   
 public String getName(){
    return name;
 }
 public double getSalary(){
    return salary;
 }
 public LocalDate gethireDay(){
    return hireDay;
 }
 public void raiseSalary(double byPercent)
 {
    double raise =salary*byPercent/100;
    salary+=raise;
 }
}
