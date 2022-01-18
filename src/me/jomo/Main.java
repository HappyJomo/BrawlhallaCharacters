package me.jomo;

import java.util.*;

public class Main {

    static int number = 1;

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

        Scanner scanner = new Scanner(System.in);

        int sword = 0;
        int gauntlets = 0;
        int spear = 0;
        int lance = 0;
        int orb = 0;
        int katars = 0;
        int scythe = 0;
        int hammer = 0;
        int axe = 0;
        int greatSword = 0;
        int cannon = 0;
        int blasters = 0;
        int bow = 0;

        System.out.println("Enter how much you like swords (1-10):");
        try {
            sword = Integer.parseInt(scanner.nextLine());
            if (sword < 1 || sword > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like gauntlets (1-10):");
            gauntlets = Integer.parseInt(scanner.nextLine());
            if (gauntlets < 1 || gauntlets > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like spears (1-10):");
            spear = Integer.parseInt(scanner.nextLine());
            if (spear < 1 || spear > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like lances (1-10):");
            lance = Integer.parseInt(scanner.nextLine());
            if (lance < 1 || lance > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like orbs (1-10):");
            orb = Integer.parseInt(scanner.nextLine());
            if (orb < 1 || orb > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like katars (1-10):");
            katars = Integer.parseInt(scanner.nextLine());
            if (katars < 1 || katars > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like scythes (1-10):");
            scythe = Integer.parseInt(scanner.nextLine());
            if (scythe < 1 || scythe > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like hammers (1-10):");
            hammer = Integer.parseInt(scanner.nextLine());
            if (hammer < 1 || hammer > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like axes (1-10):");
            axe = Integer.parseInt(scanner.nextLine());
            if (axe < 1 || axe > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like great swords (1-10):");
            greatSword = Integer.parseInt(scanner.nextLine());
            if (greatSword < 1 || greatSword > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like cannons (1-10):");
            cannon = Integer.parseInt(scanner.nextLine());
            if (cannon < 1 || cannon > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like blasters (1-10):");
            blasters = Integer.parseInt(scanner.nextLine());
            if (blasters < 1 || blasters > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

            System.out.println("Enter how much you like bows (1-10):");
            bow = Integer.parseInt(scanner.nextLine());
            if (bow < 1 || bow > 10) {
                System.out.println("You didn't enter a number between 1 and 10!");
                return;
            }

        } catch (NumberFormatException ex) {
            System.out.println("You didn't enter a number!");
            return;
        }

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

                if (weaponScore1 > weaponScore2) {
                    return -1;
                }

                if (weaponScore1 == weaponScore2) {
                    if (character1.lowestWeapon > character2.lowestWeapon) {
                        return 1;
                    }
                    if (character1.lowestWeapon < character2.lowestWeapon) {
                        return -1;
                    }

                }

                return 1;
            }

        });

        System.out.println("Calculating your characters...");
        System.out.println("Here are your top 10:");
        for (int i = 0; i < 10; i++) { //The list that should be printed (Max is 54 characters)
            System.out.println(number + ". " + characterList.get(i).getName());
            number++;
        }

    }
}