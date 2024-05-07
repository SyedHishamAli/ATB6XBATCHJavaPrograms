package EX_04052024;

public class CheckElement {
    //Check the element 8 in a 2D Array
    public static void main(String[] args) {
        int [][] arr={
                {2,9,6},
                {4,5,7},
                {1,8,3}};
        boolean b=false;
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==8) {
                    b = true;
                    if (b) {
                        System.out.println("element 8 exist in an array");
                    }
                }
            }

        }
    }

}


