package backend;

public class ServicePicture implements java.io.Serializable{
    private Integer servicePicNo;
    private Integer recordNo;
    private Byte[] servicePic;

    public Integer getServicePicNo() {
        return servicePicNo;
    }

    public void setServicePicNo(Integer servicePicNo) {
        this.servicePicNo = servicePicNo;
    }

    public Integer getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(Integer recordNo) {
        this.recordNo = recordNo;
    }

    public Byte[] getServicePic() {
        return servicePic;
    }

    public void setServicePic(Byte[] servicePic) {
        this.servicePic = servicePic;
    }
}
