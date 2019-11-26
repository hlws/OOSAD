package game03;

public class TestPerson {
    public static void main(String[] args) {
        Student t=new Student();
        t.name="小李";
        t.age=15;
        t.study();
        Teacher s=new Teacher();
        s.age=45;
        s.name="张老师";
        s.study();

    }
}
class Person{
    String name;
    int age;
    public void study(){
        System.out.println(name+age+"正在学习");
    }
}
class Student extends Person{
    public void study(){
        System.out.println(name+age+"正在呼呼大睡");
    }

}
class Teacher extends Person{
     public void study(){
         System.out.println(name+age+"正在埋头学习");
     }


}