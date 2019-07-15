package players;

import boss.Boss;
import game.Ability;

import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int health, int damage){
        super(health, damage, Ability.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random r = new Random();
        int randomNum = r.nextInt(4 - 2) + 1;
        heroes[3].setDamage(randomNum * getDamage());

    }
}