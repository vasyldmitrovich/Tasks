import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TextProcessing {
    public static void main(String[] args) throws Exception {
    wordsInFile("Text2.txt");
    whatALongWord("Text2.txt");




    }

    public static void newFile(String fileName, String textInFile) throws Exception {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(textInFile);
        fileWriter.close();
    }//Create new file and add text in this file

    public static void wordsInFile (String fileName) throws Exception{
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = new FileReader(fileName);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine());
        }
        String string = stringBuilder.toString();
        string.trim();
        int count = 1;
        if (string.length() != 0) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println("FILE INSIDE: "+stringBuilder);
        System.out.println("In this file is: "+count+" words");
        fileReader.close();
    }//How many words in file

    public static void whatALongWord (String fileName) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = new FileReader(fileName);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine());
        }
        String string = stringBuilder.toString();
        string.trim();

        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        if (string.length() != 0) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' '){
                    System.out.println(i);
                    arrayList.add(i);

                }
            }
        }
        int three = 0;
        int five = 0;
        int seven = 0;
        for (int j=1; j < arrayList.size();j++){
            switch ((arrayList.get(j)-arrayList.get(j-1))-1){
                case 3: three++;
                case 5: five++;
                case 7: seven++;
            }
        }
        System.out.println("FILE INSIDE: "+stringBuilder);
        System.out.println("In this file is: "+three+" words that have three symbol");
        System.out.println("In this file is: "+five+" words that have five symbol");
        System.out.println("In this file is: "+seven+" words that have seven symbol");

        fileReader.close();
    }//How many words those are have three five and seven symbol

}
