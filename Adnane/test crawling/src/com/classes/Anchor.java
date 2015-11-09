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
public class Anchor {
    private Domain domain;
    private String anchorhash;
    private String anchorUrl;
    private int scanstatus;
    private boolean activated;
    private Timestamp modified;
    private Timestamp created;

    public Domain getDomain() {
        return domain;
    }

    public String getAnchorhash() {
        return anchorhash;
    }

    public String getAnchorUrl() {
        return anchorUrl;
    }

    public int getScanstatus() {
        return scanstatus;
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

    public Anchor(Domain domain, String anchorhash, String anchorUrl) {
        this.domain = domain;
        this.anchorhash = anchorhash;
        this.anchorUrl = anchorUrl;
    }

    public Anchor(Domain domain, String anchorhash, String anchorUrl, int scanstatus, boolean activated, Timestamp modified, Timestamp created) {
        this.domain = domain;
        this.anchorhash = anchorhash;
        this.anchorUrl = anchorUrl;
        this.scanstatus = scanstatus;
        this.activated = activated;
        this.modified = modified;
        this.created = created;
    }
    
}
