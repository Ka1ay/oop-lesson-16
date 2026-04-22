package dmdev.com.oop;

import dmdev.com.oop3.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {


    public Warrior(String name, int damage) {
        super(name, damage);
    }



    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует мечом " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
