package shipParts;

public class WeaponPart extends ShipPart{
    private boolean isMissile;
    private int damage;
    private int diceCount;

    public boolean isMissile() {
        return isMissile;
    }

    public int getDamage() {
        return damage;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public WeaponPart(boolean isMissile, int damage, int diceCount, int energyCost, int inititiveBonus) {
         this.damage = damage;
         this.diceCount = diceCount;
         this.isMissile = isMissile;
         this.setEnergyCost(energyCost);
         this.setInititiveBonus(inititiveBonus);
    }

    public WeaponPart(boolean isMissile, int damage) {
        this(isMissile, damage, 1, 1, 0);
    }

    public WeaponPart(int damage, int energyCost){
        this(false, damage, 1, energyCost, 0);
    }

    public WeaponPart(int damage) {
        this(false, damage, 1, 0, 0);
    }
}
