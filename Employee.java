
public class Employee {
        private int id;
        private String firstName;
        private String lastName;
        private int salary;
        private int yearExp;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.yearExp = yearExp;
    }
    public int getId(){
        return id;
    }
    public String firstName(){
        return firstName;
    }
    public void getFirstName(String firstName){
        this.firstName = firstName;
    }
    public String lastName(){
        return lastName;
    }

    public void getLastName(String lastName){
        this.lastName = lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }

    // public int raiseSalary(int percent){
    //     int raiseAmount = salary * percent /100;
    //     salary += raiseAmount;
    //     return salary;
    // }


    public int getYearExp(){
        return yearExp;
    }
    public void setYearExp(int yearExp){
        this.yearExp = yearExp;
    }
    public void raiseSalary() {
        if (yearExp >= 2 && yearExp < 5) {
            salary = (int) (salary * 1.05);
        } else if (yearExp >= 5 && yearExp < 7) {
            salary = (int) (salary * 1.1);
        } else if (yearExp >= 7 && yearExp < 10) {
            salary = (int) (salary * 1.15);
        } else if (yearExp >= 10) {
            salary = (int) (salary * 1.2);
        }
    }

    public String toString() {
        return "Employee[id= " + id + ",name= " + getName() + ",salary= " + salary + "]";
    }


    
    


}
