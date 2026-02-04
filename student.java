class Student {
    int roll;
    String name;
    int age;

    Student() {
        roll = 0;
        name = "Not Assigned";
        age = 0;
    }

    Student(int r, String n, int a) {
        roll = r;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println();
    }

    
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student(1,"Ronit",19);

        s1.display();
        s2.display();
    }
}
