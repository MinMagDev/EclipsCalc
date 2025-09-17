package shipParts;

public class ShipParts {

    //List of all ShipParts

    //Weapons
    public final WeaponPart ION_CANNON        = new WeaponPart(1);
    public final WeaponPart PLASMA_CANNON     = new WeaponPart(2,2);
    public final WeaponPart SOLITON_CANNON    = new WeaponPart(3,3);
    public final WeaponPart ANTIMATTER_CANNON = new WeaponPart(4,4);

    public final WeaponPart FLUX_MISSILE   = new WeaponPart(true, 1,2,0,1);
    public final WeaponPart PLASMA_MISSILE = new WeaponPart(true, 2,2,1,0);

    public final WeaponPart ION_MISSILE        = new WeaponPart(true, 1, 3,0,0);
    public final WeaponPart SOLITON_MISSILE    = new WeaponPart(true, 3, 1,0,0);
    public final WeaponPart ANTIMATTER_MISSILE = new WeaponPart(true, 4, 1,0,0);
    public final WeaponPart ION_TURRET         = new WeaponPart(false, 2,2,0,0);
    public final WeaponPart SOLITON_CHARGER    = new WeaponPart(false, 3,1,1,0);
    //TODO: Missing Ancient Weapon Ship Parts

    //Computers
    public final ComputerPart ELECTRON_COMPUTER = new ComputerPart(1,0);
    public final ComputerPart POSITRON_COMPUTER = new ComputerPart(2,1);
    public final ComputerPart GLUON_COMPUTER    = new ComputerPart(3,2);
    //TODO: Missing ancient computer ship Parts

    //Shields
    public final ShieldPart GAUSS_SHIELD      = new ShieldPart(1,0);
    public final ShieldPart PHASE_SHIELD      = new ShieldPart(2,1);
    public final ShieldPart ABSORPTION_SHIELD = new ShieldPart(1,-4);
    public final ShieldPart INVERSION_SHIELD  = new ShieldPart(2,2);

    public final ShieldPart FLUX_SHIELD       = new ShieldPart(3,2,1);

    //Hulls
    public final HullPart HULL           = new HullPart(1,0);
    public final HullPart IMPROVED_HULL  = new HullPart(2,0);
    public final  HullPart CONIFOLD_HULL = new HullPart(3,3);

    //Drives
    public final DrivePart NUCLEAR_DRIVE    = new DrivePart(1,1,1);
    public final DrivePart FUSION_DRIVE     = new DrivePart(2,2,2);
    public final DrivePart TACHYON_DRIVE    = new DrivePart(3,3,3);
    public final DrivePart TRANSITION_DRIVE = new DrivePart(3,0,0);

    //Energy
    public final EnergyPart NUCLEAR_SOURCE    = new EnergyPart(3);
    public final EnergyPart TACHYON_SOURCE    = new EnergyPart(9);
    public final EnergyPart FUSION_SOURCE     = new EnergyPart(6);
    public final EnergyPart HYPERGRID_SOURCE  = new EnergyPart(11);
    public final EnergyPart ZERO_POINT_SOURCE = new EnergyPart(12);



}
