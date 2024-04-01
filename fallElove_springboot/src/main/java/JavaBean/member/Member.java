package member;

import java.sql.Date;

public class Member {

    private Integer memNo;
    private String mName;
    private String memAcc;
    private String memPwd;
    private Integer memMob;
    private Integer mGender;
    private String memMail;
    private String memAdd;
    private Double memBd;
    private String memCard;
    private Integer provider;
    private String clientID;
    private String displayName;
    private String accessToken;
    private String refreshToken;
    private Date tknExpireTime;
    private Date creationTime;
    private Date memberJoinTime;
    private Integer memStat;

    public Integer getMemNo() {
        return memNo;
    }

    public void setMemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public String getMemAcc() {
        return memAcc;
    }

    public void setMemAcc(String memAcc) {
        this.memAcc = memAcc;
    }

    public String getMemPwd() {
        return memPwd;
    }

    public void setMemPwd(String memPwd) {
        this.memPwd = memPwd;
    }

    public Integer getMemMob() {
        return memMob;
    }

    public void setMemMob(Integer memMob) {
        this.memMob = memMob;
    }

    public Integer getMGender() {
        return mGender;
    }

    public void setMGender(Integer mGender) {
        this.mGender = mGender;
    }

    public String getMemMail() {
        return memMail;
    }

    public void setMemMail(String memMail) {
        this.memMail = memMail;
    }

    public String getMemAdd() {
        return memAdd;
    }

    public void setMemAdd(String memAdd) {
        this.memAdd = memAdd;
    }

    public Double getMemBd() {
        return memBd;
    }

    public void setMemBd(Double memBd) {
        this.memBd = memBd;
    }

    public String getMemCard() {
        return memCard;
    }

    public void setMemCard(String memCard) {
        this.memCard = memCard;
    }

    public Integer getProvider() {
        return provider;
    }

    public void setProvider(Integer provider) {
        this.provider = provider;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Date getTknExpireTime() {
        return tknExpireTime;
    }

    public void setTknExpireTime(Date tknExpireTime) {
        this.tknExpireTime = tknExpireTime;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getMemberJoinTime() {
        return memberJoinTime;
    }

    public void setMemberJoinTime(Date memberJoinTime) {
        this.memberJoinTime = memberJoinTime;
    }

    public Integer getMemStat() {
        return memStat;
    }

    public void setMemStat(Integer memStat) {
        this.memStat = memStat;
    }
}
