package zhangsx.bean;

import java.io.Serializable;

/**
 * Created by zhangsx on 2016/12/25.
 */
public class SearchDO<T> implements Serializable {
    private String orderBy;
    private int toPage;
    private int sizeOfEveryPage;
    private T data;

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public int getToPage() {
        return toPage;
    }

    public void setToPage(int toPage) {
        this.toPage = toPage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getSizeOfEveryPage() {
        return sizeOfEveryPage;
    }

    public void setSizeOfEveryPage(int sizeOfEveryPage) {
        this.sizeOfEveryPage = sizeOfEveryPage;
    }
}
