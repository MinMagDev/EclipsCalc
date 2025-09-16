package shipParts;

public class EnergyPart extends ShipPart{
    EnergyPart(int energy) {
        this.setEnergyCost( -energy);
    }
}
