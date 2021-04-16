import java.util.Arrays;

public class ArrayConverter {

    public static void main(String[] args) {
        ArrayConverter arr = new ArrayConverter();
        int[] newArr = arr.getNewArr(new int[]{1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7});
        System.out.println(Arrays.toString(newArr));  //ответ будет [5,6,7]

    }

    public int[] getNewArr(int[] arr) {
        int index = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                index = i + 1;
                break;   // ищем 4-ку с конца, как находим присваиваем индекс переменной Index и выходим из цикла
            }
        }
        if (index == -1) {
            throw new RuntimeException(); //в случае если Index не изменился значит 4-к нету - кидаем исключение
        }
        int[] a = new int[arr.length - index];
        System.arraycopy(arr, index, a, 0, arr.length - index);
        return a; //возвращаем новый массив состоящий из элементов после последней 4-ки согласно задания
    }
}
