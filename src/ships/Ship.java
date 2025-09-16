package ships;

import shipParts.ShipPart;

public class Ship {
    private int partAmount;
    private int baseInititive;
    private ShipPart[] shipParts = new ShipPart[partAmount];

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
}
