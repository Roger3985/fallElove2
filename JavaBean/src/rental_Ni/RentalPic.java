package rental_Ni;

public class RentalPic implements java.io.Serializable{
    private Integer rPicNo;
    private Integer rNo;
    private Byte[] rPic;

    public Integer getrPicNo(){
        return rPicNo;
    }

    public void setrPicNo(Integer rPicNo){
        this.rPicNo = rPicNo;
    }

    public Integer getrNo(){
        return rNo;
    }

    public void setrNo(Integer rNo){
        this.rNo = rNo;
    }

    public Byte[] getrPic(){
        return rPic;
    }

    public void setrPic(Byte[] rPic){
        this.rPic = rPic;
    }
}
