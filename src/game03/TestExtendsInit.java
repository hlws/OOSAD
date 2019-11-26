package game03;

public class TestExtendsInit {
    public static void main(String[] args) {
        new MiddleSchool();
        //new MiddleSchool("666");

    }
}
class School{

    public School(String str){

        System.out.println(str);
    }
    public void test(String str){
        System.out.println("parent:"+str);
    }


    /*
    public School(){
        System.out.println("School");
    }

     */
}
class MiddleSchool extends School{
    Studentt stu=new Studentt();
    public MiddleSchool(){
        super("abc");//调用构造函数
        System.out.println("middle");
        super.test("kkk");//调用父类的方法
    }

    /*public MiddleSchool(String str){
        super("555");

    }

     */
    public void test(String str){
        System.out.println("child:"+str);

    }

}
class Studentt{
    public Studentt(){
        System.out.println("Studentt");

    }

}