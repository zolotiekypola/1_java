public class Program {
    public static void main(String[] args) {
        int [] arr;
        arr = new int[10];
        int [] arr1;
        arr1 = new int[10];
        int [] arr2;
        arr2 = new int[10];
        int [] arr3;
        arr3 = new int[10];
        int [] arr4;
        arr4 = new int[10];
        arrRandom(arr,arr1,arr2,arr3,arr4);

    }
    public static void arrRandom(int[] arr, int[] arr1, int[] arr2, int[] arr3, int[] arr4){

        for (int i = 0; i < 10; i++) {
            arr[i] += Math.random() * 10;
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            arr1[i] += Math.random() * 10;
            System.out.printf("%d ", arr1[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            arr2[i] += Math.random() * 10;
            System.out.printf("%d ", arr2[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            arr3[i] += Math.random() * 10;
            System.out.printf("%d ", arr3[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            arr4[i] += Math.random() * 10;
            System.out.printf("%d ", arr4[i]);
        }
    }
}

