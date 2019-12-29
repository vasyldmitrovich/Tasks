import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        String [] [] array = new String[4][3];
        array[0] [0] = "*";
        array[0] [1] = "*";
        array[0] [2] = "*";

        array[1] [0] = "*";
        array[1] [1] = " ";
        array[1] [2] = "*";

        array[2] [0] = "*";
        array[2] [1] = " ";
        array[2] [2] = "*";

        array[3] [0] = "*";
        array[3] [1] = "*";
        array[3] [2] = "*";

        String [] [] arraySpace = new String[4][3];
        arraySpace[0] [0] = " ";
        arraySpace[0] [1] = " ";
        arraySpace[0] [2] = " ";

        arraySpace[1] [0] = " ";
        arraySpace[1] [1] = " ";
        arraySpace[1] [2] = " ";

        arraySpace[2] [0] = " ";
        arraySpace[2] [1] = " ";
        arraySpace[2] [2] = " ";

        arraySpace[3] [0] = " ";
        arraySpace[3] [1] = " ";
        arraySpace[3] [2] = " ";

        String [] [] strings = new String[4][3];
        for (int i=0; i < strings.length; i++){
            for (int j=0; j < strings[i].length; j++){
                strings[i] [j] = array[i][j];
            }
        }

        for (int i=0; i < strings.length; i++){
            for (int j=0; j<strings[i].length; j++){
                System.out.print(strings[i] [j]);
            }
            System.out.println();
        }

        String [] [] strings1 = new String[4][12];
        for (int k=0; k < strings1.length; k++){
            for (int l=0; l < strings1[k].length; l++){
                strings1[k] [l] = " $ ";
            }
        }
        for (int k=0; k < strings1.length; k++){
            for (int l=3; l < 6; l++){
                strings1[k] [l] = " 1 ";
            }
        }
        for (int k=0; k < strings1.length; k++){
            for (int l=6; l < 9; l++){
                strings1[k] [l] = " 2 ";
            }
        }
        for (int k=0; k < strings1.length; k++){
            for (int l=6; l < 9; l++){
                strings1[k] [l] = array[k][l-6];

            }
        }
        for (int k=0; k < strings1.length; k++){
            for (int l=9; l < 12; l++){
                strings1[k] [l] = arraySpace[k][l-9];

            }
        }

        for (int z=0; z < strings1.length; z++){
            for (int x=0; x<strings1[z].length; x++){
                System.out.print(strings1[z] [x]);
            }
            System.out.println();
        }
            numberOne();
        String [] [] strings2 = new String[4][12];
        int start = 0;

        for (int k=0; k < strings2.length; k++){
            for (int l=start; l < start+3; l++){
                strings2[k] [l] = array[k][l-start];

            }
        }
        start = start+3;

        for (int k=0; k < strings2.length; k++){
            for (int l=start; l < start+3; l++){
                strings2[k] [l] = arraySpace[k][l-start];

            }
        }
        start = start+3;

        for (int k=0; k < strings2.length; k++){
            for (int l=start; l < start+3; l++){
                strings2[k] [l] = numberOne()[k][l-start];

            }
        }
        start = start+3;


        for (int z=0; z < strings2.length; z++){
            for (int x=0; x<strings2[z].length; x++){
                System.out.print(strings2[z] [x]);
            }
            System.out.println();
        }

    }

    public static void numberZero (){
        String [] [] array = new String[4][3];
        array[0] [0] = "*";
        array[0] [1] = "*";
        array[0] [2] = "*";

        array[1] [0] = "*";
        array[1] [1] = " ";
        array[1] [2] = "*";

        array[2] [0] = "*";
        array[2] [1] = " ";
        array[2] [2] = "*";

        array[3] [0] = "*";
        array[3] [1] = "*";
        array[3] [2] = "*";
        for (int i=0; i < array.length; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i] [j]);
            }
            System.out.println();
        }
    }

    public static String [] [] numberOne (){
        String [] [] array = new String[4][3];
        array[0] [0] = " ";
        array[0] [1] = " ";
        array[0] [2] = "*";

        array[1] [0] = " ";
        array[1] [1] = "*";
        array[1] [2] = "*";

        array[2] [0] = " ";
        array[2] [1] = " ";
        array[2] [2] = "*";

        array[3] [0] = " ";
        array[3] [1] = " ";
        array[3] [2] = "*";
        for (int i=0; i < array.length; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i] [j]);
            }
            System.out.println();
        }
        return array;
    }
}
