public class Main {
    public static void main(String[] args) {
        SortingService sortingService = new SortingService();
        System.out.println("\n\nTablica do posortowania:");
        int[] array = new int[]{1, 2, 3, 4, 5};
        sortingService.printArrayContent(array);
        sortingService.bubbleSort(array);
        System.out.println("\n\nTablica do posortowania:");
        int[] array2 = new int[]{5, 4, 3, 2, 1};
        sortingService.printArrayContent(array2);
        sortingService.bubbleSort(array2);
        System.out.println("\n\nTablica do posortowania:");
        int[] array3 = createHundredElementsIncreasedFromOne();
        sortingService.printArrayContent(array3);
        sortingService.bubbleSort(array3);
        System.out.println("\n\nTablica do posortowania:");
        int[] array4 = createHundredElementsDecreasedFromHundred();
        sortingService.printArrayContent(array4);
        sortingService.bubbleSort(array4);
    }

    public static int[] createHundredElementsIncreasedFromOne() {
        final int maxSize = 100;
        int[] hundredElements = new int[maxSize];
        for (int i = 0; i < hundredElements.length; i++) {
            hundredElements[i] = i + 1;
        }
        return hundredElements;
    }

    public static int[] createHundredElementsDecreasedFromHundred() {
        final int maxSize = 100;
        int[] hundredElements = new int[maxSize];
        for (int i = hundredElements.length - 1; i >= 0; i--) {
            hundredElements[i] = hundredElements.length - i;
        }
        return hundredElements;
    }
}
