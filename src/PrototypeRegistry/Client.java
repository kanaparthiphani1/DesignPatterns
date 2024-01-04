package PrototypeRegistry;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student apr21BatchStudent = new Student();
        apr21BatchStudent.setBatch("April 21");

        studentRegistry.register("apr21Batch" , apr21BatchStudent);

    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student sid = studentRegistry.get("apr21Batch").clone();

    }
}
