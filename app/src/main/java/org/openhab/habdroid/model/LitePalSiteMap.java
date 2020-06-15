package org.openhab.habdroid.model;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import java.io.Serializable;

/**
 * @Author： zy
 * @Date： 2020/5/12 7:59 PM
 * @Description：
 */
public class LitePalSiteMap extends LitePalSupport implements Serializable {

    @Column(unique = true)
    private String name;

    private String label;

    private String homepageLink;

    public LitePalSiteMap(String name, String label, String homepageLink) {
        this.name = name;
        this.label = label;
        this.homepageLink = homepageLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getHomepageLink() {
        return homepageLink;
    }

    public void setHomepageLink(String homepageLink) {
        this.homepageLink = homepageLink;
    }
}
