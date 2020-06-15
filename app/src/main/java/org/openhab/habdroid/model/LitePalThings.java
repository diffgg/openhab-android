package org.openhab.habdroid.model;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import java.io.Serializable;

/**
 * @Author： zy
 * @Date： 2020/5/12 7:59 PM
 * @Description：
 */
public class LitePalThings extends LitePalSupport implements Serializable {

    @Column(unique = true)
    private String thingsId;

    @Column(defaultValue = "")
    private String url;

    @Column(defaultValue = "")
    private String encoding;

    @Column(defaultValue = "")
    private String iconColor;

    @Column(defaultValue = "")
    private String labelColor;

    @Column(defaultValue = "")
    private String valueColor;

    @Column(defaultValue = "")
    private String period;

    @Column(defaultValue = "")
    private String rawLabel;

    @Column(defaultValue = "")
    private String service;

    public LitePalThings(String thingsId, String url, String encoding, String iconColor, String labelColor, String valueColor, String period, String rawLabel, String service) {
        this.thingsId = thingsId;
        this.url = url;
        this.encoding = encoding;
        this.iconColor = iconColor;
        this.labelColor = labelColor;
        this.valueColor = valueColor;
        this.period = period;
        this.rawLabel = rawLabel;
        this.service = service;
    }

    public String getThingsId() {
        return thingsId;
    }

    public void setThingsId(String thingsId) {
        this.thingsId = thingsId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getIconColor() {
        return iconColor;
    }

    public void setIconColor(String iconColor) {
        this.iconColor = iconColor;
    }

    public String getLabelColor() {
        return labelColor;
    }

    public void setLabelColor(String labelColor) {
        this.labelColor = labelColor;
    }

    public String getValueColor() {
        return valueColor;
    }

    public void setValueColor(String valueColor) {
        this.valueColor = valueColor;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getRawLabel() {
        return rawLabel;
    }

    public void setRawLabel(String rawLabel) {
        this.rawLabel = rawLabel;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
