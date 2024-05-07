package EX_04052024;

public class Lab02 {
    public static void main(String[] args) {
        int [][] arr={
                {78, 54},
                {45,65,89},
                {12,86,78},
        };
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
