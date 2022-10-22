package me.caribeedu.unibh.edaa.busca.ordenacao;

import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author Edu Caribé
 */
public class Main {
    public static void main(String[] args) {
        int[] items = generateArrayOfRandomNumbers();
        int[] sortedItems = InsertionSort.sort(items);
                
        int firstRandomItem = pickRandomItem(sortedItems);
        
        System.out.println("Primeiro número aleatório escolhido: " + firstRandomItem);
        
        long startTimeBinarySearch = System.currentTimeMillis();
        
        Integer firstRandomItemIndex = BinarySearch.findIndex(firstRandomItem, sortedItems);
        
        // Em média 0ms gasto
        long elapsedTimeBinarySearch = System.currentTimeMillis() - startTimeBinarySearch;
        
        System.out.println(String.format("O índice encontrado foi %s em %sms", firstRandomItemIndex, elapsedTimeBinarySearch));
        
        int secondRandomItem = pickRandomItem(sortedItems);
        
        System.out.println("Segundo número aleatório escolhido: " + secondRandomItem);
        
        long startTimeLinearSearch = System.currentTimeMillis();
        
        int secondRandomItemOccurrences = LinearSearch.countEquals(secondRandomItem, sortedItems);
        
        // Em média 1ms gasto
        long elapsedTimeLinearSearch = System.currentTimeMillis() - startTimeLinearSearch;
        
        System.out.println(String.format("O segundo número aleatório foi encontrado %s vez(es) em %sms", secondRandomItemOccurrences, elapsedTimeLinearSearch));
    }
    
    private static int pickRandomItem(int[] items) {
        int randomArrayPosition = new Random().nextInt(0, items.length - 1);
        return items[randomArrayPosition];
    }
    
    private static int[] generateArrayOfRandomNumbers() {
        final int maxNumber = 10000;
        final int arraySize = 500;
        return IntStream.generate(() -> new Random().nextInt(1, maxNumber)).limit(arraySize).toArray();
    }
}
