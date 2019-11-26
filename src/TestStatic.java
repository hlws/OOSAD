public class TestStatic {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.name="a";
        Student.claId=1;
        Student stu2=new Student();
        stu2.name="b";
        Student.claId=2;
        stu1.show();
        stu2.show();


    }
}

class Student{
    String name;
    static int claId;
    public void show(){
        System.out.println(name+","+claId);
    }
}