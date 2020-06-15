package org.openhab.habdroid.model;

import org.litepal.crud.LitePalSupport;

import java.io.Serializable;

/**
 * @Author： zy
 * @Date： 2020/5/12 7:59 PM
 * @Description：
 */
public class LitePalUserInfo extends LitePalSupport implements Serializable {

    private String userName;

    private String password;

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

}
