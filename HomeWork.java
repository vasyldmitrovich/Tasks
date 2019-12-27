import java.util.Scanner;

public class HomeWork {
    public static int indexArray = 0;
    final static public int heightArray = 4;
    final static public int wightArray = 100;
    public static String [] [] strings = new String[heightArray][wightArray];

    public static void main(String[] args) {
        String inputSentence = getInputSentence();
        mySentence(inputSentence);
        printArray();

    }
    public static String getInputSentence(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input word or sentence: ");
        String sentence =  scanner.nextLine();
        return sentence;
    }

    public static void mySentence(String mySentence){
        for (int i = 0; i < mySentence.length(); i++){
            char oneLetter = mySentence.charAt(i);
            switch (oneLetter){
                case ' ': plusLetter(numberFree()); break;
                case '0': plusLetter(numberZero()); break;
                case '1': plusLetter(numberOne()); break;
                case '2': plusLetter(numberTwo()); break;
                // Тут мені требуде додати всі інші букви і символи, але це в самому кінці
                // а також створити новий масив то в головномму класі
                // і ще зробити метод який буде додавати в цей масив букву які потрібно
                // і збільшувати після цього індексАррей щоб далі іншу букву додати
                // і додати щоб були маленькі або великі букви аперкейс додати
                // і написати скільки максимум буде символів
            }


        }
    }

    public static void plusLetter(String [] [] str){
        int rows = str.length;// I get length rows array
        int columns = str[0].length;// I get length columns array
        for (int i=0; i < rows; i++ ){
            for (int j=indexArray; j < indexArray+columns; j++){
                strings[i][j] = str[i][j-indexArray];
            }
        }
        indexArray = indexArray+columns;
    }

    public static void printArray(){
        for (int i=0; i < strings.length; i++){
            for (int j=0; j<strings[i].length; j++){
                System.out.print(strings[i] [j]);
            }
            System.out.println();
        }
    }

    public static String [] [] numberFree (){
        String [] [] array = new String[4][3];
        array[0] [0] = " ";
        array[0] [1] = " ";
        array[0] [2] = " ";

        array[1] [0] = " ";
        array[1] [1] = " ";
        array[1] [2] = " ";

        array[2] [0] = " ";
        array[2] [1] = " ";
        array[2] [2] = " ";

        array[3] [0] = " ";
        array[3] [1] = " ";
        array[3] [2] = " ";
        return array;
    }

    public static String [] [] numberZero (){
        String [] [] array = new String[4][4];
        array[0] [0] = "*";
        array[0] [1] = "*";
        array[0] [2] = "*";
        array[0] [3] = " ";

        array[1] [0] = "*";
        array[1] [1] = " ";
        array[1] [2] = "*";
        array[1] [3] = " ";

        array[2] [0] = "*";
        array[2] [1] = " ";
        array[2] [2] = "*";
        array[2] [3] = " ";

        array[3] [0] = "*";
        array[3] [1] = "*";
        array[3] [2] = "*";
        array[3] [3] = " ";
        return array;
    }

    public static String [] [] numberOne (){
        String [] [] array = new String[4][4];
        array[0] [0] = " ";
        array[0] [1] = " ";
        array[0] [2] = "*";
        array[0] [3] = " ";

        array[1] [0] = " ";
        array[1] [1] = "*";
        array[1] [2] = "*";
        array[1] [3] = " ";

        array[2] [0] = " ";
        array[2] [1] = " ";
        array[2] [2] = "*";
        array[2] [3] = " ";

        array[3] [0] = " ";
        array[3] [1] = " ";
        array[3] [2] = "*";
        array[3] [3] = " ";
        return array;
    }

    public static String [] [] numberTwo (){
        String [] [] array = new String[4][4];
        array[0] [0] = "*";
        array[0] [1] = "*";
        array[0] [2] = "*";
        array[0] [3] = " ";

        array[1] [0] = " ";
        array[1] [1] = " ";
        array[1] [2] = "*";
        array[1] [3] = " ";

        array[2] [0] = "*";
        array[2] [1] = " ";
        array[2] [2] = " ";
        array[2] [3] = " ";

        array[3] [0] = "*";
        array[3] [1] = "*";
        array[3] [2] = "*";
        array[3] [3] = " ";
        return array;
    }

}
