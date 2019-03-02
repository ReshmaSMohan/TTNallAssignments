package designPatterns.Q4;

public class Q4StudentBuilder {
    private String firstName;
    private String lastName;
    private Integer rollNo;
    private Integer standard;
    private Integer age;
    private Long phoneNumber;
    private Boolean isSpeciallyAbled;

    public String getFirstName() {
        return firstName;
    }

    public Q4StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Q4StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public Q4StudentBuilder setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public Integer getStandard() {
        return standard;
    }

    public Q4StudentBuilder setStandard(Integer standard) {
        this.standard = standard;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Q4StudentBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Q4StudentBuilder setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Boolean getSpeciallyAbled() {
        return isSpeciallyAbled;
    }

    public Q4StudentBuilder isChildSpeciallyAbled(Boolean speciallyAbled) {
        isSpeciallyAbled = speciallyAbled;
        return this;
    }

    public Q4Student build(){
        return new Q4Student(this);
    }
}
