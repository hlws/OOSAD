package game01;

public class Game {
    Hunter hunter;
    Monster m1;
    Monster m2;
    Monster m3;
    Monster m4;
    Monster m5;
    Vampire v1,v2,v3;
    public Game(){
         hunter=new Hunter("S","大睫毛刷");
         m1=new Monster(1);
         m2=new Monster(1);
         m3=new Monster(2);
         m4=new Monster(3);
         m5=new Monster(4);
         v1=new Vampire(1);
         v2=new Vampire(2);
         v3=new Vampire(3);
    }
    public void start(){
        while (true){//如果hunter dead执行end，break循环
            //判断monster 是否全部死亡，如果是，调用end ，break
//生产1-5随机数，表示要战斗的僵尸
            if (!hunter.isLive){
                //end();
                break;
            }
            if (!m1.isLive&&!m2.isLive&&!m3.isLive&&!m4.isLive&&!m5.isLive){
                //end();
                break;
            }

            int ran= GameUtil.randomRange(1,9);
            /*if (ran==1){
                hunter.fight(m1);
            }
            if (ran==2){
                hunter.fight(m2);
            }
            if (ran==3){
                hunter.fight(m3);
            }
            if (ran==4){
                hunter.fight(m4);
            }
            if (ran==5){
                hunter.fight(m5);
            }
            else
            {
                System.out.println("拜托，你得找个正常点的打");
            }

             */
            switch (ran){
                case 1:hunter.fight(m1);break;
                case 2:hunter.fight(m2);break;
                case 3:hunter.fight(m3);break;
                case 4:hunter.fight(m4);break;
                case 5:hunter.fight(m5);break;
                case 6:hunter.fight(v1);break;
                case 7:hunter.fight(v2);break;
                case 8:hunter.fight(v3);break;
                default:break;
            }
            try {
                Thread.sleep(300);
            }
            catch (Exception e){

            }
            end();

        }

    }
    public void end(){

    }
}
