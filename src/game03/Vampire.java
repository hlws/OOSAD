package game03;


class Vampire extends Enemy {
    String type;
    int maxLife;
    int curLife;
    boolean isLive;
    int attack;
    int defend;
    int agile;
    int hideRate;
    int getLifeRate;

    //定义构造函数 传入一个int类型的值 1是普通僵尸，2是魔法僵尸，3是大僵尸
    public Vampire(int vt) {
        isLive = true;
        hideRate = 67;
        if (vt == 1) {
            type = "吸血蝙蝠";
            maxLife = 400;
            attack = 20;
            defend = 8;
            agile = 30;
            getLifeRate = 45;
        } else if (vt == 2) {
            type = "吸血鬼";
            maxLife = 350;
            attack = 35;
            defend = 5;
            agile = 40;
            getLifeRate = 66;
        } else if (vt == 3) {
            type = "吸血鬼王";
            maxLife = 400;
            attack = 15;
            defend = 15;
            agile = 16;
            getLifeRate = 80;

        }
        curLife = maxLife;

    }

    //传入受到的伤害
    public void getLife(int damage) {
        int addLife = damage * getLifeRate / 100;
        System.out.println("吸血成功生命+" + addLife + "，当前生命：" + curLife);
        if (addLife + curLife >= maxLife) {
            curLife = maxLife;
        } else {
            curLife += addLife;
        }


    }

    public void kill(Hunter hunter) {
        if (!isLive) {
            return;
        }
        if (!hunter.isLive) {
            return;
        }
        System.out.println(type + ":呼呼呼呼!杀向" + hunter.name);
        //依然需要传递自己的攻击力
        hunter.injured(this);
        int lostLift = hunter.injured(this);
        this.getLife(lostLift);

    }
}
