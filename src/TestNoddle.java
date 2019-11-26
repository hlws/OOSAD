public class TestNoddle {
    public static void main(String[] args){
        Noddle n= new Noddle("dawan",false);
        //n.bowType="小小碗";
        //n.moreMeat=false;
        n.make();
    }
}
class Noddle{
    String bowType;
    boolean moreMeat;
    public Noddle(String b,boolean m){
        bowType=b;
        moreMeat=m;

    }
    public void make(){
        String s="不加肉";
       if (moreMeat){
          s="加肉";
       }
        System.out.println(bowType+s+"的米线煮好了");
    }


}
