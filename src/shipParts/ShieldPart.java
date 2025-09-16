package shipParts;

public class ShieldPart extends ShipPart{
    private int attackMalus;

    public ShieldPart(int attackMalus, int energyCost) {
        this.attackMalus = attackMalus;
        this.setEnergyCost(energyCost);
    }

    public int getAttackMalus() {
        return attackMalus;
    }
}
