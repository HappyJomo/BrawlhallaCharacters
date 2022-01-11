package me.jomo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    // SOLVED If two characters have the same score, the one with the best worst weapon will come out ahead. Still sharing the position, but ahead.

    /*Put numbers next to all the characters (allows some to be tied), example of how my list SHOULD be:
    1. Val
    2. Hattori
    3. Wu Shang
    4. Sir Roland
    5. Orion
    5. Petra
    5. Asuri
    8. Dusk
    8. Caspian
    8. Jiro
    */


    static class Character {

        String name;
        int firstWeapon;
        int secondWeapon;
        int lowestWeapon;

        public Character(String name, int firstWeapon, int secondWeapon) {
            this.name = name;
            this.firstWeapon = firstWeapon;
            this.secondWeapon = secondWeapon;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        int sword = 1;
        int gauntlets = 2;
        int spear = 3;
        int lance = 4;
        int orb = 5;
        int katars = 6;
        int scythe = 7;
        int hammer = 8;
        int axe = 9;
        int greatSword = 10;
        int cannon = 11;
        int blasters = 12;
        int bow = 13;

        List<Character> characterList = new ArrayList<>();

        characterList.add(new Character("Bödvar", hammer, sword));
        characterList.add(new Character("Cassidy", blasters, hammer));
        characterList.add(new Character("Orion", lance, spear));
        characterList.add(new Character("Lord Vraxx", lance, blasters));
        characterList.add(new Character("Gnash", hammer, spear));
        characterList.add(new Character("Queen Nai", spear, katars));
        characterList.add(new Character("Hattori", sword, spear));
        characterList.add(new Character("Sir Roland", lance, sword));
        characterList.add(new Character("Scarlet", hammer, lance));
        characterList.add(new Character("Thatch", sword, blasters));
        characterList.add(new Character("Ada", blasters, spear));
        characterList.add(new Character("Sentinel", hammer, katars));
        characterList.add(new Character("Lucien", katars, blasters));
        characterList.add(new Character("Teros", axe, hammer));
        characterList.add(new Character("Brynn", axe, spear));
        characterList.add(new Character("Asuri", katars, sword));
        characterList.add(new Character("Barraza", axe, blasters));
        characterList.add(new Character("Ember", bow, katars));
        characterList.add(new Character("Azoth", bow, axe));
        characterList.add(new Character("Koji", axe, blasters));
        characterList.add(new Character("Ulgrim", axe, lance));
        characterList.add(new Character("Diana", blasters, bow));
        characterList.add(new Character("Jhala", sword, axe));
        characterList.add(new Character("Kor", gauntlets, hammer));
        characterList.add(new Character("Wu Shang", gauntlets, spear));
        characterList.add(new Character("Val", gauntlets, sword));
        characterList.add(new Character("Ragnir", katars, axe));
        characterList.add(new Character("Cross", blasters, gauntlets));
        characterList.add(new Character("Mirage", scythe, spear));
        characterList.add(new Character("Nix", scythe, blasters));
        characterList.add(new Character("Mordex", scythe, gauntlets));
        characterList.add(new Character("Yumiko", scythe, spear));
        characterList.add(new Character("Artemis", scythe, lance));
        characterList.add(new Character("Caspian", katars, gauntlets));
        characterList.add(new Character("Sidra", cannon, sword));
        characterList.add(new Character("Xull", cannon, axe));
        characterList.add(new Character("Kaya", spear, bow));
        characterList.add(new Character("Isiah", cannon, blasters));
        characterList.add(new Character("Jiro", sword, scythe));
        characterList.add(new Character("Lin Fei", katars, cannon));
        characterList.add(new Character("Zariel", gauntlets, bow));
        characterList.add(new Character("Rayman", axe, gauntlets));
        characterList.add(new Character("Dusk", spear, orb));
        characterList.add(new Character("Fait", scythe, orb));
        characterList.add(new Character("Thor", hammer, orb));
        characterList.add(new Character("Petra", gauntlets, orb));
        characterList.add(new Character("Vector", lance, bow));
        characterList.add(new Character("Volkov", scythe, axe));
        characterList.add(new Character("Onyx", gauntlets, cannon));
        characterList.add(new Character("Jaeyun", greatSword, sword));
        characterList.add(new Character("Mako", greatSword, katars));
        characterList.add(new Character("Magyar", greatSword, hammer));
        characterList.add(new Character("Reno", blasters, orb));
        characterList.add(new Character("Munin", scythe, bow));

        characterList.sort(new Comparator<Character>() {
            @Override
            public int compare(Character character1, Character character2) {
                int weaponScore1 = character1.firstWeapon + character1.secondWeapon;
                int weaponScore2 = character2.firstWeapon + character2.secondWeapon;

                if (character1.firstWeapon < character1.secondWeapon) {
                    character1.lowestWeapon = character1.firstWeapon;
                }

                if (character1.firstWeapon > character1.secondWeapon) {
                    character1.lowestWeapon = character1.secondWeapon;
                }

                if (character2.firstWeapon < character2.secondWeapon) {
                    character2.lowestWeapon = character2.firstWeapon;
                }

                if (character2.firstWeapon > character2.secondWeapon) {
                    character2.lowestWeapon = character2.secondWeapon;
                }

                if (weaponScore1 < weaponScore2) {
                    return -1;
                }

                if (weaponScore1 == weaponScore2) {
                    if (character1.lowestWeapon < character2.lowestWeapon) {
                        return 1;
                    }
                    if (character1.lowestWeapon > character2.lowestWeapon) {
                        return -1;
                    }

                }

                return 1;
            }

        });

        for (int i = 0; i < 54; i++) {
            //Max is 54 characters
            System.out.println(characterList.get(i).getName());
        }

    }
}