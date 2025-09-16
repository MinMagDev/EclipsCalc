package shipParts;

public abstract class ShipPart {
    private int energyCost;
    private int inititiveBonus;

    public int getEnergyCost() {
        return energyCost;
    }

    public int getInititiveBonus() {
        return inititiveBonus;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }

    public void setInititiveBonus(int inititiveBonus) {
        this.inititiveBonus = inititiveBonus;
    }
}
