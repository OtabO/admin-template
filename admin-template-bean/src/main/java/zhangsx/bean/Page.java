package zhangsx.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhangsx on 2016/12/24.
 */
public class Page<T> implements Serializable {
    /**
     *当前页数
     */
    private int currentPage;

    /**
     *前一页
     */
    private int previouPage;

    /**
     *下一页
     */
    private int nextPage;

    /**
     *总页数
     */
    private int totalPageSize;

    /**
     * 前半部分能显示的最大页数
     * eg.  总页数10,前半部分能显示的最大页数为3,前半部分能显示的最大页数为4,则显示样子为1 2 3 ... 7 8 9 10
     */
    private int previouMaxShowPage;

    /**
     * 后半部分能显示的最大页数
     */
    private int nextMaxShowPage;

    private List<T> data;

    /**
     * 是否显示省略号
     * @return
     */
    private boolean shouldShowEllipsis(){
        if(totalPageSize>(previouMaxShowPage+nextMaxShowPage))
            return true;
        return false;
    }

    /**
     * 是否有下一页
     * @return
     */
    private boolean hasNextPage(){
        if(currentPage>=totalPageSize)
            return false;
        return true;
    }

    /**
     * 是否是第一页
     * @return
     */
    private boolean isFirstPage(){
        if(currentPage==1)
            return true;
        return false;
    }


    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPreviouPage() {
        return previouPage;
    }

    public void setPreviouPage(int previouPage) {
        this.previouPage = previouPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getTotalPageSize() {
        return totalPageSize;
    }

    public void setTotalPageSize(int totalPageSize) {
        this.totalPageSize = totalPageSize;
    }

    public int getPreviouMaxShowPage() {
        return previouMaxShowPage;
    }

    public void setPreviouMaxShowPage(int previouMaxShowPage) {
        this.previouMaxShowPage = previouMaxShowPage;
    }

    public int getNextMaxShowPage() {
        return nextMaxShowPage;
    }

    public void setNextMaxShowPage(int nextMaxShowPage) {
        this.nextMaxShowPage = nextMaxShowPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
