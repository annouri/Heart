/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.classes.Anchor;
import com.classes.Domain;
import com.classes.WebPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Adnane
 */
public class BalUT {
    
    public BalUT() {
    }
    @Test
    public void WebPageloadFromweb(){
       Domain domain = new Domain("1234-123","http://www.jsoup.org");
       Anchor anchor = new Anchor(domain,"1234-123","http://www.jsoup.org");
       WebPage webpage = new WebPage(anchor);
       webpage.loadDocumentFromWeb();
       assertTrue("Test Results", webpage.getDocument() != null);
      
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
}
