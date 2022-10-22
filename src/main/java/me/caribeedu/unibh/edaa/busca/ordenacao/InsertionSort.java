package me.caribeedu.unibh.edaa.busca.ordenacao;

/**
 *
 * @author Edu Caribé
 */
public class InsertionSort {
    public static int[] sort(int[] items) {
        if (items == null)
            return new int[0];
        else if (items.length < 2)
            return items;
        
        for(int keyIndex = 1; keyIndex < items.length; keyIndex++) {
            int key = items[keyIndex];            
            int previousItemIndex = keyIndex - 1;
            
            while(previousItemIndex >= 0 && items[previousItemIndex] > key) {
                items[previousItemIndex + 1] = items[previousItemIndex];
                previousItemIndex = previousItemIndex - 1;
            }
            
            items[previousItemIndex + 1] = key;
        }
        
        return items;
    }   
}
