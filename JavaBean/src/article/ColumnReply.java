package article;

import java.sql.Date;

public class ColumnReply {

    private Integer columnReplyNo;
    private Integer artNo;
    private Integer memNo;
    private String comContent;
    private Date comTime;
    private Integer comStat;

    public Integer getColumnReplyNo() {
        return columnReplyNo;
    }

    public void setColumnReplyNo(Integer columnReplyNo) {
        this.columnReplyNo = columnReplyNo;
    }

    public Integer getArtNo() {
        return artNo;
    }

    public void setArtNo(Integer artNo) {
        this.artNo = artNo;
    }

    public Integer getMemNo() {
        return memNo;
    }

    public void setMemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public String getComContent() {
        return comContent;
    }

    public void setComContent(String comContent) {
        this.comContent = comContent;
    }

    public Date getComTime() {
        return comTime;
    }

    public void setComTime(Date comTime) {
        this.comTime = comTime;
    }

    public Integer getComStat() {
        return comStat;
    }

    public void setComStat(Integer comStat) {
        this.comStat = comStat;
    }
}
