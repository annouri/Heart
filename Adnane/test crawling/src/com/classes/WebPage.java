/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import test.crawling.TestCrawling;

/**
 *
 * @author Adnane
 */
public class WebPage {
    private final Anchor anchor;
    private String webPagehash;
    private int anchorParseStatus;
    private int emailparseStatus;
    private Document document;

    public String getWebPagehash() {
        return webPagehash;
    }

    public int getAnchorParseStatus() {
        return anchorParseStatus;
    }

    public int getEmailparseStatus() {
        return emailparseStatus;
    }

    public Document getDocument() {
        return document;
    }

    public WebPage(Anchor anchor) {
        this.anchor = anchor;
    }
    public void loadDocumentFromWeb(){
    try {
            // TODO code application logic here
            document = Jsoup.connect(anchor.getAnchorUrl()).get();
            
           
        } catch (IOException ex) {
            Logger.getLogger(TestCrawling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
