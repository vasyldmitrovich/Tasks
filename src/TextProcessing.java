import java.io.FileWriter;

public class TextProcessing {
    public static void main(String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter("Text.txt");
        fileWriter.close();
    }
    
}
