package rental_Ni;

import java.sql.Date;

public class RentalMyFavorite implements java.io.Serializable{
    private Integer rNo;
    private Integer memNo;
    private Date rFavTime;


    public Integer getrNo(){
        return rNo;
    }

    public void setrNo(Integer rNo){
        this.rNo = rNo;
    }

    public Integer getmemNo(){
        return memNo;
    }

    public void setmemNo(Integer memNo){
        this.memNo = memNo;
    }

    public Date getrFavTime(){
        return rFavTime;
    }

    public void setrFavTime(Date rFavTime){
        this.rFavTime = rFavTime;
    }
}
