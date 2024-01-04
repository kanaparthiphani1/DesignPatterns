package PrototypeRegistry;

public class Student implements Prototype<Student>{

    private String name;
    private int age;
    private String address;
    private String batch;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Student() {
    }

    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.batch = s.batch;
        this.address = s.address;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
