package org.openhab.habdroid.model;

import org.litepal.crud.LitePalSupport;

import java.io.Serializable;

/**
 * @Author： zy
 * @Date： 2020/5/12 7:59 PM
 * @Description：
 */
public class LitePalPermission extends LitePalSupport implements Serializable {

    private String thingsId;

    private String itemId;

    private String userId;

    private String permission;

    public LitePalPermission(String thingsId, String itemId, String userId, String permission) {
        this.thingsId = thingsId;
        this.itemId = itemId;
        this.userId = userId;
        this.permission = permission;
    }

    public String getThingsId() {
        return thingsId;
    }

    public void setThingsId(String thingsId) {
        this.thingsId = thingsId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
