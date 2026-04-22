package dmdev.com.oop3;

import dmdev.com.oop.Archer;
import dmdev.com.oop.Mage;
import dmdev.com.oop.Warrior;
import dmdev.com.oop3.weapon.Bow;
import dmdev.com.oop3.weapon.Sword;
import dmdev.com.oop3.weapon.Wand;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Лучник", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Мечник", 10);
        warrior.setWeapon(new Sword());

        Mage<Wand> mage = new Mage<>("Колдун", 20);
        mage.setWeapon(new Wand());

    }
}
