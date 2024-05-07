package EX_04052024;

public class Max2dArray {
    // Max number in the 2D Array
    public static void main(String[] args) {
        int [][] ar={
                {45,36,55},
                {78,69},
                {12,36,78,45}};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <ar.length ; i++) {
                for (int j = 0; j < ar[i].length; j++) {
                    if (max<ar[i][i]){
                        max=ar[i][j];
                    }
                }

        }
        System.out.println(max);
    }

}
