import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TextProcessing {
    public static void main(String[] args) throws Exception {
        String textFromFile =  returnString("Text.txt");
        ArrayList <Integer> listSpaceBetweenWords = wordsInFile(textFromFile);
        whatALongWord(listSpaceBetweenWords);
        ArrayList <Integer> listSentence = sentenceInFile(textFromFile);

    }

    public static void newFile(String fileName, String textInFile) throws Exception {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(textInFile);
        fileWriter.close();
    }//Create new file and add text in this file

    public static String returnString (String fileName) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = new FileReader(fileName);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine());
        }
        return stringBuilder.toString();
    }//Return text from file

    public static ArrayList <Integer> wordsInFile (String textFromFile) {
        ArrayList <Integer> arrayListWorlds = new ArrayList<>();
        arrayListWorlds.add(0);
        if (textFromFile.length() != 0) {
            for (int i = 0; i < textFromFile.length(); i++) {
                if (textFromFile.charAt(i) == ' '){
                    arrayListWorlds.add(i);
                }
            }
            arrayListWorlds.add(textFromFile.length()-1);
        }
        System.out.println("In this file is: "+(arrayListWorlds.size()-1)+" words");
        return arrayListWorlds;
    }//Return array spaces between words

    public static void whatALongWord (ArrayList <Integer> listSpace) {
        int three = 0;
        int five = 0;
        int seven = 0;
        for (int i = 0; i < listSpace.size()-1; i++) {
            int longWord = 0;
            if (i == 0) {
                longWord = listSpace.get(i) - listSpace.get(i + 1);
            }
            if (i > 0 && i < listSpace.size() - 2) {
                longWord = (listSpace.get(i) - listSpace.get(i + 1))+1;
            }
            if (i == listSpace.size() - 2) {
                longWord = listSpace.get(i) - listSpace.get(i + 1);
            }
            switch (longWord) {
                case -3:
                    three++; break;
                case -5:
                    five++; break;
                case -7:
                    seven++; break;
            }
        }
            System.out.println("In this file is: " + three + " words that have three symbol");
            System.out.println("In this file is: " + five + " words that have five symbol");
            System.out.println("In this file is: " + seven + " words that have seven symbol");
    }//How many words those are have three five and seven symbol

    public static ArrayList <Integer> sentenceInFile (String textFromFile) {
        ArrayList <Integer> arrayListSentence = new ArrayList<>();
        arrayListSentence.add(0);
        if (textFromFile.length() != 0) {
            for (int i = 0; i < textFromFile.length(); i++) {
                if (i >= 1) {
                    if (textFromFile.charAt(i) == ' ' & textFromFile.charAt(i-1) == '.' ||
                            textFromFile.charAt(i) == ' ' & textFromFile.charAt(i-1) == '!' ||
                    textFromFile.charAt(i) == ' ' & textFromFile.charAt(i-1) == '?')  {
                        arrayListSentence.add(i);
                    }
                }
            }
            arrayListSentence.add(textFromFile.length()-1);
        }
        System.out.println("In this text is: "+(arrayListSentence.size()-1)+" sentences");
        return arrayListSentence;
    }//Return array sentence and show how many sentence is
}
