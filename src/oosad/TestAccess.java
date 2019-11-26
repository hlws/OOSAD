package oosad;

public class TestAccess {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.red();

    }
}
class Student{
    Book b=new Book();
    public void red(){
        //b.name="java编程思想";
        //System.out.println("正在读"+b.name);
        b.show();
    }
}
class Book{
     private String name;
     public void show(){
          System.out.println(name);
     }

}