class Student{
    int rollno;
    String name;

    static String college = "klu";

    Student(int rollno , String name){
        this.rollno = rollno;
        this.name = name;


    }

    void display(){
        System.out.println(name + " " + rollno + " " + college);
    }
}

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student(4285,"santosh");
        Student s2 = new Student(4284,"jathin");
        s1.display();
        s2.display();

    }
}
