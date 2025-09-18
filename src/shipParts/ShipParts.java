package shipParts;

public class ShipParts {

    //List of all ShipParts

    //Weapons
    public static final WeaponPart ION_CANNON        = new WeaponPart(1);
    public static final WeaponPart PLASMA_CANNON     = new WeaponPart(2,2);
    public static final WeaponPart SOLITON_CANNON    = new WeaponPart(3,3);
    public static final WeaponPart ANTIMATTER_CANNON = new WeaponPart(4,4);

    public static final WeaponPart FLUX_MISSILE   = new WeaponPart(true, 1,2,0,1);
    public static final WeaponPart PLASMA_MISSILE = new WeaponPart(true, 2,2,1,0);

    public static final WeaponPart ION_MISSILE        = new WeaponPart(true, 1, 3,0,0);
    public static final WeaponPart SOLITON_MISSILE    = new WeaponPart(true, 3, 1,0,0);
    public static final WeaponPart ANTIMATTER_MISSILE = new WeaponPart(true, 4, 1,0,0);
    public static final WeaponPart ION_TURRET         = new WeaponPart(false, 2,2,0,0);
    public static final WeaponPart SOLITON_CHARGER    = new WeaponPart(false, 3,1,1,0);
    //TODO: Missing Ancient Weapon Ship Parts

    //Computers
    public static final ComputerPart ELECTRON_COMPUTER = new ComputerPart(1,0);
    public static final ComputerPart POSITRON_COMPUTER = new ComputerPart(2,1);
    public static final ComputerPart GLUON_COMPUTER    = new ComputerPart(3,2);
    //TODO: Missing ancient computer ship Parts

    //Shields
    public static final ShieldPart GAUSS_SHIELD      = new ShieldPart(1,0);
    public static final ShieldPart PHASE_SHIELD      = new ShieldPart(2,1);
    public static final ShieldPart ABSORPTION_SHIELD = new ShieldPart(1,-4);
    public static final ShieldPart INVERSION_SHIELD  = new ShieldPart(2,2);

    public static final ShieldPart FLUX_SHIELD       = new ShieldPart(3,2,1);

    //Hulls
    public static final HullPart HULL           = new HullPart(1,0);
    public static final HullPart IMPROVED_HULL  = new HullPart(2,0);
    public static final  HullPart CONIFOLD_HULL = new HullPart(3,3);

    //Drives
    public static final DrivePart NUCLEAR_DRIVE    = new DrivePart(1,1,1);
    public static final DrivePart FUSION_DRIVE     = new DrivePart(2,2,2);
    public static final DrivePart TACHYON_DRIVE    = new DrivePart(3,3,3);
    public static final DrivePart TRANSITION_DRIVE = new DrivePart(3,0,0);

    //Energy
    public static final EnergyPart NUCLEAR_SOURCE    = new EnergyPart(3);
    public static final EnergyPart TACHYON_SOURCE    = new EnergyPart(9);
    public static final EnergyPart FUSION_SOURCE     = new EnergyPart(6);
    public static final EnergyPart HYPERGRID_SOURCE  = new EnergyPart(11);
    public static final EnergyPart ZERO_POINT_SOURCE = new EnergyPart(12);



}