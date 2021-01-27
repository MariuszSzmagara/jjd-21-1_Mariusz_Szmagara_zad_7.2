public class SortingService {

    public void bubbleSort(int [] arrayToSort) {
        int comparisonCounter = 0;
        int swapCounter = 0;
        if (arrayToSort == null) {
            return;
        } else {
            int iterationsNumber = arrayToSort.length - 1;
            while (iterationsNumber >= 1) {
                boolean isSwapped = false;
                for (int i = 0; i < arrayToSort.length - 1; i++) {
                    if (arrayToSort[i] > arrayToSort[i + 1]) {
                        int tmp = arrayToSort[i + 1];
                        arrayToSort[i + 1] = arrayToSort[i];
                        arrayToSort[i] = tmp;
                        swapCounter++;
                        if (!isSwapped) {
                            isSwapped = true;
                        }
                    }
                    comparisonCounter++;
                }
                if (!isSwapped) {
                    break;
                }
                iterationsNumber -= 1;
            }
        }
        printBubbleSortStatistics(arrayToSort, comparisonCounter, swapCounter);
    }

    private void printBubbleSortStatistics(int[] sortedArray, int comparisonCounter, int swapCounter) {
        if (swapCounter == 0) {
            System.out.println("Tablica była już posortowana przed przekazaniem do posortowania");
            printArrayContent(sortedArray);
            System.out.println("Liczba porównań elementów = " + comparisonCounter
                    + "\nLiczba zamienień elementów = " + swapCounter
                    + "\nżeby stwierdzić, że tablica była juz posortowana.");
        } else {
            System.out.println("Tablica elementów po posortowaniu:");
            printArrayContent(sortedArray);
            System.out.println("Liczba porównań elementów = " + comparisonCounter
                    + "\nLiczba zamienień elementów = " + swapCounter
                    + "\nżeby posortować tablicę.");
        }
    }

    public void printArrayContent(int[] array) {
        for (int numbers : array) {
            System.out.printf("%6d|", numbers);
        }
        System.out.printf("%n" + "-".repeat((array.length) * 7) + "%n");
    }
}
