package shipParts;

public class ComputerPart extends ShipPart{
    private int attackBonus;

    public ComputerPart(int attackBonus, int energyCost) {
        this.attackBonus = attackBonus;
        this.setEnergyCost(energyCost);
    }

    public int getAttackBonus() {
        return attackBonus;
    }
}
