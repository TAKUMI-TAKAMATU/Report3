package jp.ac.uryukyu.ie.e175744;



public class Enemy extends LivingThing {


    public Enemy (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
        /**this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;

        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);*/

    }

    @Override
    public  void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
           dead =true;

            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }


}
