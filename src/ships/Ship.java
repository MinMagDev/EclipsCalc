package ships;

import shipParts.*;

import java.util.ArrayList;

public class Ship {

    //List of all Ships
    private static final int INTERCEPTOR_SIZE = 4;
    private static final int CRUISER_SIZE     = 6;
    private static final int DREADNOUGHT_SIZE = 8;

    private static final int INTERCEPTOR_INI = 2;
    private static final int CRUISER_INI     = 1;
    private static final int DREADNOUGHT_INI = 0;


    private int partAmount;
    private int baseInititive;
    private ShipPart[] shipParts;


    private int damage = 0;
    private int totalHull;
    private int attackBonus;
    private int defendBonus;
    private ArrayList<Integer> attacks = new ArrayList<>();
    private int inititive;

    public Ship(int size, int baseInititive){
        partAmount = size;
        this.baseInititive = baseInititive;
        shipParts = new ShipPart[partAmount];
    }

    public void replacePart(int index, ShipPart part) {
        shipParts[index] = part;
        updateStats();
    }

    public boolean damage(int damage){
        this.damage += damage;
        return damage > totalHull;
    }

    public void updateStats(){
        int newHull = 0;
        int newAttack = 0;
        int newDefense = 0;
        int newInititive = baseInititive;
        attacks.clear();

        for(ShipPart part : shipParts){
            newInititive += part.getInititiveBonus();
            if (part instanceof WeaponPart){
                int amountAttacks = ((WeaponPart) part).getDiceCount();
                int amountDamage = ((WeaponPart) part).getDamage();

                for(int i = 0; i < amountAttacks; i++) attacks.add(amountDamage);
            } else if(part instanceof HullPart){
                newHull += ((HullPart) part).getHullBonus();
            } else if (part instanceof ComputerPart) {
                newAttack += ((ComputerPart) part).getAttackBonus();
            } else if (part instanceof ShieldPart) {
                newDefense += ((ShieldPart) part).getAttackMalus();
            }
        }

        totalHull = newHull;
        attackBonus = newAttack;
        defendBonus = newDefense;
        inititive = newInititive;
    }


    //Getter for Base Ships
    public static void getBaseInterceptor(){
        Ship ship = new Ship(INTERCEPTOR_SIZE, INTERCEPTOR_INI);
        ship.replacePart(0, ShipParts.NUCLEAR_SOURCE);
        ship.replacePart(1, ShipParts.ION_CANNON);
        ship.replacePart(2, ShipParts.NUCLEAR_DRIVE);
    }

    public static void getBaseCruiser(){
        Ship ship = new Ship(CRUISER_SIZE, CRUISER_INI);
        ship.replacePart(0, ShipParts.ELECTRON_COMPUTER);
        ship.replacePart(1, ShipParts.NUCLEAR_SOURCE);
        ship.replacePart(2, ShipParts.ION_CANNON);
        ship.replacePart(3, ShipParts.HULL);
        ship.replacePart(5, ShipParts.NUCLEAR_DRIVE);
    }

    public static void getBaseDreadnought(){
        Ship ship = new Ship(DREADNOUGHT_SIZE,DREADNOUGHT_INI);
        ship.replacePart(0, ShipParts.ELECTRON_COMPUTER);
        ship.replacePart(1, ShipParts.NUCLEAR_SOURCE);
        ship.replacePart(2, ShipParts.ION_CANNON);
        ship.replacePart(3, ShipParts.HULL);
        ship.replacePart(4, ShipParts.ION_CANNON);
        ship.replacePart(5, ShipParts.HULL);
        ship.replacePart(7, ShipParts.NUCLEAR_DRIVE);
    }

    public int getDamage() {
        return damage;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getDefendBonus() {
        return defendBonus;
    }

    public int getInititive() {
        return inititive;
    }
}