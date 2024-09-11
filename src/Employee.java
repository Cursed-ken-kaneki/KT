package ee.ivkhkdev;
public class Employee {
    private Person person;
    private String appointment;
    private String salary;

    public Employee(Person person, String appointment, String salary) {
        this.person = person;
        this.appointment = appointment;
        this.salary = salary;
    }
}
