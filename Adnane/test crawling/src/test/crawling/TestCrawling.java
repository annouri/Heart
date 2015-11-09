/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.crawling;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *
 * @author Adnane
 */
public class TestCrawling {    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Document doc = (Document) Jsoup.connect("http://www.jsoup.org/").get();
            Elements newsHeadlines;newsHeadlines = doc.select("a");
        } catch (IOException ex) {
            Logger.getLogger(TestCrawling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
