public class TestReference {
    public static void main(String[] args){
        Person p1=new Person();
        p1.name="老张";
        Person p2=p1;
        p2.name="老李";
        p1.show();//老李
        p2.show();//老李
        //引用赋值是将p1所指向的对象赋值给p2
        //此时p1p2指向同一个内存（堆内存），修改p2就是修改p1
        p1=new Person();
        p2=new Person();
        p1.show();//null
        p2.show();//null 此时p1 p2指向新内存，原来的内存变成垃圾内存，内存不够用时自动清理
        int a=10;
        int b=a;
        b=30;
        System.out.println(a+","+b);//10,30,这是普通变量赋值，不是引用赋值，都在栈内存，直接更改变量的值

    }
}
class Person{
    String name;
    public void show(){
        System.out.println(name);
    }
}
