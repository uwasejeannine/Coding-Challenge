import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MostUsedWords {
    public static void main(String[] args) throws Exception {
            String line, sentences = "";
            int count = 0, maxCount = 0;
            ArrayList<String> sentence = new ArrayList<String>();

            //Opens file in read mode
            FileReader file = new FileReader("/home/student/Downloads/Coding Challenge");
            BufferedReader br = new BufferedReader(file);

            //Reads each line
            while((line = br.readLine()) != null) {
                String strings[] = line.toLowerCase().split("([,.\\s]+) ");
                //Adding all words generated in previous step into words
                for(String s : strings){
                    sentence.add(s);
                }
            }

            //Determine the most repeated word in a file
            for(int i = 0; i < sentence.size(); i++){
                count = 1;
                //Count each word in the file and store it in variable count
                for(int j = i+1; j < sentence.size(); j++){
                    if(sentence.get(i).equals(sentence.get(j))){
                        count++;
                    }
                }

                if(count > maxCount){
                    maxCount = count;
                    sentences = sentence.get(i);
                }
            }

            System.out.println("Sentence with repeted words: " + sentences);
            br.close();
        }

    }

