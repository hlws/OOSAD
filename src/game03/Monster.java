package game03;


class Monster extends Enemy{
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

}
