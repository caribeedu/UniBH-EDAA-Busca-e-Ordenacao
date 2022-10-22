package me.caribeedu.unibh.edaa.busca.ordenacao;

/**
 *
 * @author Edu Caribé
 */
public class BinarySearch {    
    public static Integer findIndex(int desiredItem, int[] items) {
        int left = 0;
        int right = items.length - 1;
        int mid;
        
        while (left <= right) {
            mid = (left + right) / 2;
            
            if (desiredItem == items[mid])
                return mid;
            
            if (desiredItem < items[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        
        return null;
    }
}