package rental_Ni;

public class RentalCategory implements java.io.Serializable{
    private Integer rCatNo;
    private String rCatName;
    private Integer rStockQty;
    private Integer rRentedQty;
    private Double rDesPrice;

    public Integer getrCatNo(){
        return rCatNo;
    }

    public void setrCatNo(Integer rCatNo){
        this.rCatNo = rCatNo;
    }

    public String getrCatName(){
        return rCatName;
    }

    public void setrCatName(String rCatName){
        this.rCatName = rCatName;
    }

    public Integer getrStockQty(){
        return rStockQty;
    }

    public void setrStockQty(Integer rStockQty){
        this.rStockQty = rStockQty;
    }

    public Integer getrRentedQty(){
        return rRentedQty;
    }

    public void setrRentedQty(Integer rRentedQty){
        this.rRentedQty = rRentedQty;
    }

    public Double getrDesPrice(){
        return rDesPrice;
    }

    public void setrDesPrice(Double rDesPrice){
        this.rDesPrice = rDesPrice;
    }
}