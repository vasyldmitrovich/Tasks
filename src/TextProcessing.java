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
        System.out.println("In this text is: "+(listSentence.size()-1)+" sentences");
        String sentenceUpperCase = eachSecondSentence(textFromFile);
        newFile("TextUpperCase.txt",sentenceUpperCase);
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

    private static ArrayList <Integer> wordsInFile (String textFromFile) {
        /*Form array where will be including indexes all spaces in text*/
        ArrayList <Integer> arrayListWorlds = new ArrayList<>();
        arrayListWorlds.add(0);//First index
        if (textFromFile.length() != 0) {
            for (int i = 0; i < textFromFile.length(); i++) {
                if (textFromFile.charAt(i) == ' '){
                    arrayListWorlds.add(i);
                }
            }
            arrayListWorlds.add(textFromFile.length()-1);//Last index
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
        /*Form array where will be including indexes all sentence in text*/
        ArrayList <Integer> arrayListSentence = new ArrayList<>();
        arrayListSentence.add(0);//The beginning of the sentence
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
            arrayListSentence.add(textFromFile.length()-1);//The last index of the last sentence
        }
        return arrayListSentence;
    }//Return array sentence and show how many sentence is

    public static String eachSecondSentence (String string) {
        ArrayList <Integer> listSentence = sentenceInFile(string);//Get index each sentence the existing method
        String stringTemp= "";
        for (int i = 1; i < listSentence.size(); i++) {
            if (i%2 == 0){
                stringTemp = stringTemp.concat(string.substring(listSentence.get(i-1),listSentence.get(i)).toUpperCase());
            }
            else {
                stringTemp = stringTemp.concat(string.substring(listSentence.get(i-1),listSentence.get(i)));
            }
            }
        return stringTemp;
    }//Return text where each second sentence uppercase letters

    public static String thirdSentencesConsonant (String string) {
        ArrayList <Integer> listSentence = sentenceInFile(string);
        String stringTemp= "";
        for (int i = 1; i < listSentence.size(); i++) {
            if (i%3 == 0){
                String str = "";
                str = string.substring(listSentence.get(i-1), listSentence.get(i));
                for (int j = 0; j < str.length()-1; j++ ){
                    if (str.charAt(j) == 'a'){


                    }
                }
            }
            else {
                stringTemp = stringTemp.concat(string.substring(listSentence.get(i-1),listSentence.get(i)));
            }
        }


        return stringTemp;
    }
}
