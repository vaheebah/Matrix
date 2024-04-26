import java.util.ArrayList;

class Student {
    private String name;
    private String id;
    private double CGPA;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double cGPA) {
        CGPA = cGPA;
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", "FA23-BCS-010");
        Student s2 = new Student("Ahmad", "FA23-BCS-001");
        Student s3 = new Student("Talha", "FA23-BCS-002");

        s1.setCGPA(3.2);
        s2.setCGPA(3.8);
        s3.setCGPA(3.6);

        display(s1);
        display(s2);
        display(s3);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Waleed", "FA23-BSE-020"));
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(0, new Student("Maha", "FA23-BSE-002"));
        arrayList.remove(2);
        arrayList.remove(s1);

        System.out.println("Total number of students: " + arrayList.size());
        arrayList.set(0, new Student("Farah", "FA23-BCS-123"));
        display(arrayList.get(0));
    }

    public static void display(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("CGPA: " + student.getCGPA());
        System.out.println();
    }
}
