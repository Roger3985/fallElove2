package article;

import java.sql.Date;

public class ColumnArticle {

    private Integer artNo;
    private Integer admNo;
    private String artTitle;
    private String artContent;
    private Date artTime;
    private Integer artCatNo;
    private Integer artStat;

    public Integer getArtNo() {
        return artNo;
    }

    public void setArtNo(Integer artNo) {
        this.artNo = artNo;
    }

    public Integer getAdmNo() {
        return admNo;
    }

    public void setAdmNo(Integer admNo) {
        this.admNo = admNo;
    }

    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }

    public String getArtContent() {
        return artContent;
    }

    public void setArtContent(String artContent) {
        this.artContent = artContent;
    }

    public Date getArtTime() {
        return artTime;
    }

    public void setArtTime(Date artTime) {
        this.artTime = artTime;
    }

    public Integer getArtCatNo() {
        return artCatNo;
    }

    public void setArtCatNo(Integer artCatNo) {
        this.artCatNo = artCatNo;
    }

    public Integer getArtStat() {
        return artStat;
    }

    public void setArtStat(Integer artStat) {
        this.artStat = artStat;
    }
}


