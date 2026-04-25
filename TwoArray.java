public class TwoArray {

    public static void main(String[] args) {
        int[][] a1 = {{0, 1, 0, 1, 0}, {1, 1, 1, 1, 1}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {1, 1, 0, 1, 1}};

        int zeros = 0;
        int ones = 0;
        int[] empty = {0,0,0,0,0}; //0 empty rooms

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                if (a1[i][j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
            }
        }

        System.out.println("No of empty beds: " + zeros);
        System.out.println("No of occupied beds: " + ones);

        //Most empty beds in a row
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                if(a1[i][j] == 0 ){
                    empty[i] = empty[i] +1;
                }
            }
        }

        int largest =0;
        int room = 0;
        for(int i=0; i<empty.length; i++){
            if(largest < empty[i]){
                largest = empty[i];
                room = i;
            }
        }

        System.out.println("The room wiyth most empty beds: "+ room+1 + " with " + largest + " empty rooms");

    }
}
