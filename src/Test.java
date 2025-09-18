import ships.Ship;

public class Test {

    static Ship[] fleet1 = new Ship[]{Ship.getBaseCruiser(), Ship.getBaseInterceptor(), Ship.getBaseCruiser()};
    static Ship[] fleet2 = new Ship[]{Ship.getBaseCruiser(), Ship.getBaseDreadnought()};

    public static void main(String[] args) {
        double res = Battle.calculateAttackerWinPercentage(fleet1, fleet2);
    }
}
