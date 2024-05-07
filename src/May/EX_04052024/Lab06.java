package EX_04052024;

public class Lab06 {
    public static void main(String[] args) {
        int arr[][] = {
                {45, -45 ,12},
                {25, 63, 96 },
                {78, 65, -56}
        };
        int man_Array=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(man_Array<arr[i][j]){

                    man_Array=arr[i][j];

                }
            }
        }
        System.out.println(man_Array);
    }
}
