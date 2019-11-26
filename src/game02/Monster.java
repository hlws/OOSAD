package game02;

class Monster {
    String type;
    int maxLife;
    int curLife;
    boolean isLive;
    int attack;
    int defend;
    int agile;
    int hideRate;
    //定义构造函数 传入一个int类型的值 1是普通僵尸，2是魔法僵尸，3是大僵尸
    public Monster(int mt){
        isLive=true;
        hideRate=67;
        if (mt==1){
            type="普通僵尸";
            maxLife=40;
            attack=15;
            defend=8;
            agile=30;
        }
        else if (mt==2){
            type="魔法僵尸";
            maxLife=35;
            attack=27;
            defend=5;
            agile=40;
        }
        else if(mt==3){
            type="防御僵尸";
            maxLife=40;
            attack=10;
            defend=15;
            agile=16;

        }
        else if(mt==4){
            type="大僵尸";
            maxLife=40;
            attack=30;
            defend=10;
            agile=20;
        }
        curLife=maxLife;

    }
    public boolean hidden(){
        //增加躲避判断
        return GameUtil.isHide(this.hideRate,this.agile);
    }
    public void injured(Hunter hunter){
        if (hidden()){
            System.out.println(type+"躲避成功");
        }else {
        System.out.println(type+"嗷嗷嗷");
        int lostLife= GameUtil.calLostLife(hunter.attack,this.defend);
        curLife-=lostLife;
        if (curLife<=0){
           dead(hunter);
           return;
        }}
        show();
        kill(hunter);
    }
    public void kill(Hunter hunter){
        if (!isLive){
            return;
        }
        if (!hunter.isLive){
            return;
        }
        System.out.println(type+":呼呼呼呼!杀向"+hunter.name);
        //依然需要传递自己的攻击力
        hunter.injured(this);

    }
    public void dead(Hunter hunter){
        hunter.expAdd(this);
        System.out.println("呜呜呜");
        isLive=false;

    }
    public void show(){
        System.out.println("["+type+",life:"+curLife+"maxlife"+maxLife+",isLife:"+isLive+"]"+"攻击力"+attack+"防御力"+defend);

    }
}
