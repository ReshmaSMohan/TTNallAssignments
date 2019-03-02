package designPatterns.Q4;

public class Q4Student {

    private String firstName;
    private String lastName;
    private Integer rollNo;
    private Integer standard;
    private Integer age;
    private Long phoneNumber;
    private Boolean isSpeciallyAbled;

    public Q4Student(Q4StudentBuilder q4StudentBuilder) {
        this.firstName = q4StudentBuilder.getFirstName();
        this.lastName = q4StudentBuilder.getLastName();
        this.rollNo = q4StudentBuilder.getRollNo();
        this.standard = q4StudentBuilder.getStandard();
        this.age = q4StudentBuilder.getAge();
        this.phoneNumber = q4StudentBuilder.getPhoneNumber();
        this.isSpeciallyAbled = q4StudentBuilder.getSpeciallyAbled();
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

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getSpeciallyAbled() {
        return isSpeciallyAbled;
    }

    public void setSpeciallyAbled(Boolean speciallyAbled) {
        isSpeciallyAbled = speciallyAbled;
    }

    @Override
    public String toString() {
        return "Q4Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNo=" + rollNo +
                ", standard=" + standard +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", isSpeciallyAbled=" + isSpeciallyAbled +
                '}';
    }
}
