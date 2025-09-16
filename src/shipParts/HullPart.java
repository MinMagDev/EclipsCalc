package shipParts;

public class HullPart extends ShipPart{
    private int hullBonus;

    public HullPart(int hullBonus, int energyCost) {
        this.hullBonus = hullBonus;
        this.setEnergyCost(energyCost);
    }

    public int getHullBonus() {
        return hullBonus;
    }
}
