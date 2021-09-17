import java.io.BufferedReader;
import java.io.FileReader;

public class CountWords {
    public static void main(String[] args) throws Exception {
        String line;
        int count = 0;

        //change the value to match the path your file is stored
        String filePath = "/home/student/Downloads/Coding Challenge";

        //Opens a file in read mode
        FileReader file = new FileReader(filePath);
        BufferedReader br = new BufferedReader(file);

        //Gets each line till end of file is reached
        while((line = br.readLine()) != null) {
            //Splits each line into words
            String words[] = line.split(" ");
            //Counts each word
            count = count + words.length;
        }
        System.out.println("Number of words: " + count);
        br.close();
    }
}





