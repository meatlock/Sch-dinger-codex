import java.io.*;
import java.net.URL;
import java.util.ArrayList;

/** 
 * The class gives a start for a web crawler by reading a line by line
 * from a web page given by a URL and collecting all URLs on the page
 * in an ArrayList.
 *
 * @version 2016-11-01
 * @author Manfred Kerber
 */
public class WebCrawler {

    /**
     *  Auxiliary method to chop of a string from the end of a given string.
     *  @param string A string whose end is chopped off, e.g.
     *  "abc-de" 
     *  @param chop The string after which everything is chopped off, e.g. "-"
     *  @return The reduced string, e.g. "abc"
     */
    public static String chopOff(String string, String chop) {
        String[] parts = string.split(chop);
        return parts[0];
    }

    /**
     *  @param string The string in which all URLs are to be found.
     *  @return The ArrayList of all URLs found in the string.
     */
    public static ArrayList<String> findUrls(String string) {
        ArrayList<String> result = new ArrayList<String>();
        String[] parts = string.split("<a href=\"");
        for (int i = 1; i < parts.length; i++) {
            if (parts.length > 1) {
                result.add(chopOff(parts[i], "\">"));
            }
        }
        return result;
    }

    /**
     *  @param urlString The string represents a URL, the corresponding
     *  web page is read and all URLs on it to be collected in an ArrayList.
     *  @return An ArrayList of all URLs found on the web page, the empty list
     *  if there are no URLs on it, or if the web page is not found.
     */
    public static ArrayList<String> collectUrls(String urlString) {
        String readString; // to read in a line
        // The result is initially empty.
        ArrayList<String> result = new ArrayList<String>(); 
        try {
            URL url = new URL(urlString);
            BufferedReader in =
                new BufferedReader(new
                                   InputStreamReader(url.openStream()));
            //Loop invariant: The result contains all URLs read so far.
            while ((readString = in.readLine()) != null) {
                result.addAll(findUrls(readString));
            }
            in.close();
        } catch (IOException e) {
            System.out.println("no access to URL: " + urlString);
        } finally {
            //The result is returned whether or not an exception has been caught.
            return result;
        }
    }

    //Test for the given URL.
    public static void main(String[] args){
        String s = "http://cs.bham.ac.uk/~mmk/teaching/java/test.html";
        s = "http://www.cs.bham.ac.uk/~mmk/teaching.php";
        System.out.println(collectUrls(s));
    }
}
