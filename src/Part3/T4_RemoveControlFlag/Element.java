package Part3.T4_RemoveControlFlag;

public class Element {
    public void searchElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element found");
                break;
            }
            System.out.println("Element not found");
        }
    }
}