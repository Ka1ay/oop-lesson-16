package dmdev.com.oop;

public class Warrior extends Hero {


    public Warrior(String name, int damage) {
        super(name, damage);
    }



    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует мечом " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
