import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TextProcessing {
    public static void main(String[] args) throws Exception {
    wordsInFile("Text.txt");




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
    }//How mane words in file

}
