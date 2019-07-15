package players;

import boss.Boss;
import game.Ability;

public class Magical extends Hero {

    public Magical(int health, int damage){
        super(health, damage, Ability.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for(int i = 0; i < heroes.length; i++){
            heroes[i].setDamage(heroes[i].getDamage() + 20);
        }
    }
}