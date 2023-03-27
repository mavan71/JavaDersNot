package J24_Encapsulation.Tasks.task03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employees {


    private String name;
    private int salary;
    private String dob;

    public Employees(String name, int salary, String dob) {
        this.name = name;
        this.salary = salary;
        this.dob=dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return yasKontrol();
    }

    public String yasKontrol() {
        if (ageCalculator() > 18) {
            return "Welcome to our company " + name + " your salary is " + salary;
        } else if (ageCalculator() < 18) {
            return "come back when you are 18 years old.";
        } else  {
            return "we can have inter with you after that you can have a "+ salary + " salary";
        }
    }

    public int ageCalculator(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return Period.between(LocalDate.parse(dob,dtf), LocalDate.now()).getYears();
    }


}
