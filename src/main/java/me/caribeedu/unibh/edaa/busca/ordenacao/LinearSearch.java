package me.caribeedu.unibh.edaa.busca.ordenacao;

/**
 *
 * @author Edu Caribé
 */
public class LinearSearch {
    public static int countEquals(int desiredItem, int[] items) {
        int occurrences = 0;
        
        for (int i = 0; i < items.length; i++)
            if (desiredItem == items[i])
                occurrences++;
        
        return occurrences;
    }
}
