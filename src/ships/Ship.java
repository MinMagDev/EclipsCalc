package ships;

import shipParts.ShipPart;
import shipParts.ShipParts;

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

    public Ship(int size, int baseInititive){
        partAmount = size;
        this.baseInititive = baseInititive;
        shipParts = new ShipPart[partAmount];
    }

    public void replacePart(int index, ShipPart part) {
        shipParts[index] = part;
    }

    public int getInititive() {
        int res = baseInititive;
        for (ShipPart part : shipParts){
            res += part.getInititiveBonus();
        }
        return getInititive();
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
}
