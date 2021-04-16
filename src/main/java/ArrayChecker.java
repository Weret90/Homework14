import java.util.stream.IntStream;

//Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//        [ 1 1 1 4 4 1 4 4 ] -> true
//        [ 1 1 1 1 1 1 ] -> false
//        [ 4 4 4 4 ] -> false
//        [ 1 4 4 1 1 4 3 ] -> false

public class ArrayChecker {
    public boolean arrayChecker(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == 4 || arr[i] == 1)) { //если будет число кроме 4 или 1 то вернем false
                return false;
            }
        }
        if (IntStream.of(arr).allMatch(s -> s == 4)) return false; //если все числа будут 4 вернем false
        if (IntStream.of(arr).allMatch(s -> s == 1)) return false; //если все числа будут 1 вернем false
        return true;
    }

    public static void main(String[] args) {
        ArrayChecker array = new ArrayChecker();
        System.out.println(array.arrayChecker(new int[]{1, 1, 1, 1, 4})); //ответ true
    }
}