package org.openhab.habdroid.model;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import java.io.Serializable;

/**
 * @Author： zy
 * @Date： 2020/5/12 7:59 PM
 * @Description：
 */
public class UserInfo extends LitePalSupport implements Serializable {

    private String userName;

    private String password;

    private String permission;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public boolean isAdmin() {
        if ("admin".equals(userName) && "admin".equals(password)) {
            return true;
        }
        return false;
    }
}
