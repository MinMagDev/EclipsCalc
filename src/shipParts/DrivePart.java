package shipParts;

public class DrivePart extends ShipPart {
    private int speedBonus;

    public DrivePart(int speedBonus, int energyCost, int inititiveBonus) {
        this.speedBonus = speedBonus;
        this.setEnergyCost(energyCost);
        this.setInititiveBonus(inititiveBonus);
    }

    public int getSpeedBonus() {
        return speedBonus;
    }
}
