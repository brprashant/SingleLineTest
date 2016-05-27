
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

/**
 * Created by brprashant on 5/12/16.
 */
public class TextProcess {

    public static void main(String[] args){
        URL url= TextProcess.class.getClassLoader().getResource("alice-in-wonderland.txt");


        BitSet set = new BitSet();
        try {
            assert url != null;
            Scanner sc = new Scanner(new File(url.toURI()));
            int count = 0;
            Map<String,Integer> wordCount=new TreeMap<>();
            while (sc.hasNext()) {
                String line = sc.nextLine();
                count++;

                Scanner lineScan = new Scanner(line);
                while(lineScan.hasNext()){
                    String word = lineScan.next();
                    if (wordCount.containsKey(word)){
                        wordCount.put(word,wordCount.get(word)+1);
                    } else {
                        wordCount.put(word,1);
                    }
                }
            }
            System.out.println("Line count " + count);
            System.out.println("workdCount" + wordCount.size());
            System.out.println("word found most times ");
        } catch (FileNotFoundException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
