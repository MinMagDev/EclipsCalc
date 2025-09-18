import ships.Ship;

import java.util.Arrays;

public class Battle {

    public static double calculateAttackerWinPercentage(Ship[] attackers, Ship[] defenders){
        if (attackers.length == 0) return 0;
        if (defenders.length == 0) return 1;

        for (Ship defender: defenders){
            defender.setAttacker(false);
        }

        Ship[] battleOrder = new Ship[attackers.length + defenders.length];
        System.arraycopy(attackers, 0, battleOrder, 0, attackers.length);
        System.arraycopy(defenders, 0, battleOrder, attackers.length, defenders.length);
        sortForInititive(battleOrder);

        for(Ship ship: battleOrder){
            System.out.println("Ship has Inititive " + ship.getInititive());
        }

        return 0.5;
    }

    private static void sortForInititive(Ship[] battleOrder) {
        mergesort(battleOrder, 0, battleOrder.length-1);
    }

    private static void mergesort(Ship[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right)/2;
            mergesort(arr, left, mid);
            mergesort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(Ship[] arr, int left, int mid, int right) {
        Ship[] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        Ship[] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);
        int i=0, j=0, k=left;
        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i].getInititive() >= rightArr[j].getInititive()) arr[k++] = leftArr[i++];
            else arr[k++] = rightArr[j++];
        }
        while(i < leftArr.length) arr[k++] = leftArr[i++];
        while(j < rightArr.length) arr[k++] = rightArr[j++];
    }
}
