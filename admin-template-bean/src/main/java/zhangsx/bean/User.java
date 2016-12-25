package zhangsx.bean;

import java.io.Serializable;

/**
 * Created by zhangsx on 2016/12/23.
 */
public class User implements Serializable{
    private String userName;
    private String password;
    private int authority;

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

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }
}
