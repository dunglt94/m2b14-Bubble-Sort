public class BubbleSort {
    public static void main(String[] args) {
        int[] list = new int[]{3, 4, 1, 5, 2};
        System.out.println("Before Sorting: ");
        printList(list);
        System.out.println("After Sorting: ");
        bubbleSort(list);
        printList(list);
    }

    private static void printList(int[] list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
