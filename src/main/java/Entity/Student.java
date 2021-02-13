package Entity;

import java.util.Map;

public class Student {
    private int age;

    public Student(int age, String name, char[] password, String ID, Map<String, Double> grade) {
        this.age = age;
        this.name = name;
        this.password = password;
        this.ID = ID;
        this.grade = grade;
    }

    private String name;
    private char[] password;
    private String ID;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Map<String, Double> getGrade() {
        return grade;
    }

    public void setGrade(Map<String, Double> grade) {
        this.grade = grade;
    }

    private Map<String, Double> grade;

}
