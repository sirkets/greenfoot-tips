import java.net.*;
import java.io.*;
import java.util.ArrayList;

/**
 * An example of how you could read a list of text from a URL
 */
public class Reader {
    public static void readInto(ArrayList<String> list) throws Exception {
        // Urls that contain lists of words
        String url = "https://raw.githubusercontent.com/first20hours/google-10000-english/master/google-10000-english-no-swears.txt";
        String nouns = "https://gist.githubusercontent.com/sirkets/7d89492826a0d245a086e8c5c56829a8/raw/307ef87315bf0360f682bf25821fdcf4fe71db8c/nouns.txt";
        
        // Create a URL instance from one of the above urls
        URL wordsURL = new URL(nouns);
        
        // Open a stream to the url
        BufferedReader in = new BufferedReader(
        new InputStreamReader(wordsURL.openStream()));
        
        // Read all words from the url into a list
        String word;
        while ((word = in.readLine()) != null){
            list.add(word);
        }
        in.close();
    }
}