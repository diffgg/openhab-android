package org.openhab.habdroid.model;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import java.io.Serializable;

/**
 * @Author： zy
 * @Date： 2020/5/12 7:59 PM
 * @Description：
 */
public class LitePalItems extends LitePalSupport implements Serializable {

    @Column(unique = true)
    private String itemId;

    @Column(defaultValue = "")
    private String name;

    @Column(defaultValue = "")
    private String label;

    @Column(defaultValue = "")
    private String category;

    @Column(defaultValue = "")
    private String link;

    public LitePalItems(String itemId, String name, String label, String category, String link) {
        this.itemId = itemId;
        this.name = name;
        this.label = label;
        this.category = category;
        this.link = link;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
