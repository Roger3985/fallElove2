package rental_Ni;

public class Rental implements java.io.Serializable{
    private Integer rNo;
    private Integer rCatNo;
    private String rName;
    private Double rPrice;
    private Integer rSize;
    private String rColor;
    private String rInfo;
    private Integer rStat;


    public Integer getrNo(){
        return rNo;
    }

    public void setrNo(Integer rNo){
        this.rNo = rNo;
    }


    public Integer getrCatNo(){
        return rCatNo;
    }

    public void setrCatNo(Integer rCatNo){
        this.rCatNo = rCatNo;
    }

    public String getrName(){
        return rName;
    }

    public void setrName(String rName){
        this.rName = rName;
    }

    public Double getrPrice(){
        return rPrice;
    }

    public void setrPrice(Double rPrice){
        this.rPrice = rPrice;
    }

    public Integer getrSize(){
        return rSize;
    }

    public void setrSize(Integer rSize){
        this.rSize = rSize;
    }

    public String getrColor(){
        return rColor;
    }

    public void setrColor(String rColor){
        this.rColor = rColor;
    }

    public String getrInfo(){
        return rInfo;
    }

    public void setrInfo(String rInfo){
        this.rInfo = rInfo;
    }

    public Integer getrStat(){
        return rStat;
    }

    public void setrStat(Integer rStat){
        this.rStat = rStat;
    }
}
