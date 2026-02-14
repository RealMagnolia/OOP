package lab1;

public class Person {
    private Gender gender;
    private String name;
    public Person(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Gender getGender() {
        return gender;
    } 
}
