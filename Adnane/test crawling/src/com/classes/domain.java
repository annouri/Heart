/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.sql.Timestamp;



/**
 *
 * @author Adnane
 */
public class Domain {
    private String domainhash;
    private String domainUrl;
    private boolean activated;
    private Timestamp modified;
    private Timestamp created;

    public String getDomainhash() {
        return domainhash;
    }

    public String getDomainUrl() {
        return domainUrl;
    }

    public boolean isActivated() {
        return activated;
    }

    public Timestamp getModified() {
        return modified;
    }

    public Timestamp getCreated() {
        return created;
    }

    public Domain(String domainhash, String domainUrl) {
        this.domainhash = domainhash;
        this.domainUrl = domainUrl;
    }
    /*used when loeading data from data base */
    public Domain(String domainhash, String domainUrl, boolean activated, Timestamp modified, Timestamp created) {
        this.domainhash = domainhash;
        this.domainUrl = domainUrl;
        this.activated = activated;
        this.modified = modified;
        this.created = created;
    }
    
}
