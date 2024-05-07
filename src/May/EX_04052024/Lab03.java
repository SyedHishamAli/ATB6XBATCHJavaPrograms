package EX_04052024;

public class Lab03 {
    public static void main(String[] args) {
        int[][] arr={
                {25,63,78,41},
                {123,45,89,98}
        };
        for (int i=0; i< arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
