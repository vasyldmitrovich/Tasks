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
        String sentencesConsonant = thirdSentencesConsonant(textFromFile);
        newFile("TextConsonant.txt",sentencesConsonant);
    }

    private static void newFile(String fileName, String textInFile) throws Exception {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(textInFile);
        fileWriter.close();
    }//Create new file and add text in this file

    private static String returnString (String fileName) throws Exception {
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

    private static void whatALongWord (ArrayList <Integer> listSpace) {
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

    private static ArrayList <Integer> sentenceInFile (String textFromFile) {
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

    private static String eachSecondSentence (String string) {
        ArrayList <Integer> listSentence = sentenceInFile(string);//Get index each sentence the existing method
        String stringTemp= "";
        /*We listing all sentence*/
        for (int i = 1; i < listSentence.size(); i++) {
            /*First two if - for last sentence, others if - for others sentences */
            if ( listSentence.get(i) == listSentence.get(listSentence.size()-1) & i%2 == 0) {
                stringTemp = stringTemp.concat(string.substring(listSentence.get(i-1),(listSentence.get(i)+1)).toUpperCase());
            }
            if ( listSentence.get(i) == listSentence.get(listSentence.size()-1) & i%2 != 0) {
                stringTemp = stringTemp.concat(string.substring(listSentence.get(i-1),(listSentence.get(i)+1)));
            }
            if (i%2 == 0 & listSentence.get(i) < listSentence.get(listSentence.size()-1)){
                stringTemp = stringTemp.concat(string.substring(listSentence.get(i-1),listSentence.get(i)).toUpperCase());
            }
            if (i%2 != 0 & listSentence.get(i) < listSentence.get(listSentence.size()-1)) {
                stringTemp = stringTemp.concat(string.substring(listSentence.get(i-1),listSentence.get(i)));
            }
            }
        return stringTemp;
    }//Return text where each second sentence uppercase letters

    private static String thirdSentencesConsonant (String string) {
        /*Rewrite vowel to consonant*/
        ArrayList<Integer> listSentence = sentenceInFile(string);//Get index each sentence the existing method
        char whatWeWantToRewrite = 'W';
        String str = "";
        String stringTemp = "";
        /*We listing all sentence*/
        for (int i = 1; i < listSentence.size(); i++) {
            /*First two if - for last sentence, others if - for others sentences */
            if (listSentence.get(i) == listSentence.get(listSentence.size() - 1) & i % 3 == 0) {
                /*Take from string the sentence we need*/
                str = string.substring(listSentence.get(i - 1), (listSentence.get(i)+1));
                StringBuilder stringBuilder = new StringBuilder();
                /*We listing each char in the sentence search consonant*/
                for (int j = 0; j < str.length(); j++) {
                    /*If consonant is, we rewrite this consonant*/
                    if (str.charAt(j) == 'a' || str.charAt(j) == 'e'
                            || str.charAt(j) == 'o' || str.charAt(j) == 'u') {
                        stringBuilder.append(whatWeWantToRewrite);
                    }
                    else {
                        stringBuilder.append(str.charAt(j));
                    }
                }
                stringTemp = stringTemp.concat(stringBuilder.toString());
            }
            if (listSentence.get(i) == listSentence.get(listSentence.size() - 1) & i % 3 != 0) {
                stringTemp = stringTemp.concat(string.substring(listSentence.get(i - 1), (listSentence.get(i) + 1)));
            }
            if (i % 3 == 0 & listSentence.get(i) < listSentence.get(listSentence.size() - 1)) {
                /*Take from string the sentence we need*/
                str = string.substring(listSentence.get(i - 1), listSentence.get(i));
                StringBuilder stringBuilderTwo = new StringBuilder();
                /*We listing each char in the sentence search consonant*/
                for (int j = 0; j < str.length(); j++) {
                    /*If consonant is, we rewrite this consonant*/
                    if (str.charAt(j) == 'a' || str.charAt(j) == 'e'
                            || str.charAt(j) == 'o' || str.charAt(j) == 'u') {
                        stringBuilderTwo.append(whatWeWantToRewrite);
                    }
                    else {
                        stringBuilderTwo.append(str.charAt(j));
                    }
                }
                stringTemp = stringTemp.concat(stringBuilderTwo.toString());
            }
            if (i % 3 != 0 & listSentence.get(i) < listSentence.get(listSentence.size() - 1)) {
                stringTemp = stringTemp.concat(string.substring(listSentence.get(i - 1), listSentence.get(i)));
            }
        }
        return stringTemp;
    }//Search each third sentences and rewrite letter from vowel to consonant


}
