package dmdev.com.oop;

public class TrainingGround {

    public static void main(String[] args) {
        Hero warrior = new Warrior("Булат", 15);
        Archer archer = new Archer("Лучник", 10);
        Hero mage = new Mage("Колдун", 20);

        Archer.Wolf wolf = archer.new Wolf("Second wolf", 11);

        Enemy enemy = new Enemy("Зомби", 100);
        attackEnemy(enemy, warrior, archer, mage);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
