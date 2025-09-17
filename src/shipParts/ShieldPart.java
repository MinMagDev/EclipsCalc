package shipParts;

public class ShieldPart extends ShipPart{
    private int attackMalus;

    public ShieldPart(int attackMalus, int energyCost) {
        this.attackMalus = attackMalus;
        this.setEnergyCost(energyCost);
    }

    public ShieldPart(int attackMalus, int energyCost, int inititiveBonus) {
        this.attackMalus = attackMalus;
        this.setEnergyCost(energyCost);
        this.setInititiveBonus(inititiveBonus);
    }

    public int getAttackMalus() {
        return attackMalus;
    }
}
