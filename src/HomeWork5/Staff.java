package HomeWork5;

public class Staff {
    private String nameSurname;
    private String position;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;

    public Staff(String nameSurname, String position, String eMail, String phoneNumber, int salary, int age) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("Name is %s  position is %s email is %s phone number is %s salary is %d age is %d\n", nameSurname, position, eMail, phoneNumber, salary, age);
    }

    public void getAge(int age) {
        if(age > 40) {
            info();
        }
       // this.age = age;
    }
}
