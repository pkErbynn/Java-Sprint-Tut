package arrayObj;

public class TestArrays {

    public static void main(String[] args) {
        int y = 0;

        String[] islands = new String[4];

        int[] index = new int[4];

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cuzumel";

        int ref;
        while(y < 4){

//            storing values of index...1,3,0,2
            ref = index[y];

            System.out.print("island = ");

//            ...used as index of island
            System.out.println(islands[ref]);
            y = y + 1;
        }

    }
}
