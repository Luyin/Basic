package Array;

import java.util.Arrays;

public class Ints {
    private void declare() {
        //배열 선언
        //크기가 20인 int 배열 선언, 정수 타입은 요소들이 0으로 전부 초기화 된다.
        int[] array = new int[10];

        //다차원 배열 선언
        //마지막 차원만 가변 길이다.
        int[][] dimensionalArray = new int[2][];

        //배열 선언과 동시에 초기화
        //배열 리터럴은 선언시에만 사용할 수 있다.
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        array2 = new int[]{1,2,3,4,5,6,7,8,9,10};
    }

    private void print() {
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        int[][] dimensionalArray = new int[][]{{1,2,3}, {4,5,6}};

        //1차원 배열 출력
        System.out.println(array2.toString());

        //다차원 배열 출력
        System.out.println(Arrays.deepToString(dimensionalArray));
    }

    private void fill() {
        //배열 채우기
        int[] array = new int[10];
        Arrays.fill(array, 1);
    }

    private void copy() {
        //배열 복사
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] copiedArray = new int[10];

        //Deep Copy
        System.arraycopy(array, 0, copiedArray, 0, copiedArray.length);

        //Shallow Copy
        copiedArray = Arrays.copyOf(array, array.length);
        copiedArray = Arrays.copyOfRange(array, 1, array.length - 1);

        //Clone API
        //primitive Type에서 clone을 사용할 경우, Deep Copy
        copiedArray = array.clone();
        //non-primitive Type에서 clone을 사용할 경우, Shallow Copy

        //Stream API (Java 8만 가능)
//        copiedArray = Arrays.stream(array).toArray(int[]::new);

        //Apache Common3 (외부 라이브러리, non-primitive Type의 Deep Copy에 사용된다.)
    }

    private void sort() {
        //배열 정렬 (오름차순)
        //내림차순 정렬은 기본 제공되지 않는다.
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        Ints ints = new Ints();

        ints.declare();
        ints.print();
        ints.fill();
        ints.copy();
        ints.sort();
    }
}
