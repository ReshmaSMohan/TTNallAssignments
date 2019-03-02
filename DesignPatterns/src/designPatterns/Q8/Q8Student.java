package designPatterns.Q8;

public class Q8Student {
    private String firstName;
    private String lastName;
    private Integer rollNo;
    private Integer standard;
    private Integer age;

    public Q8Student(String firstName, String lastName, Integer rollNo, Integer standard, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
        this.standard = standard;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Q8Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNo=" + rollNo +
                ", standard=" + standard +
                ", age=" + age +
                '}';
    }
}
