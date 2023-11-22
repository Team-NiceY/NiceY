package site.nicey.model.dto;

public class Recommend {

    private int recId;
    private int shoesId;
    private int userId;

    public int getRecId() {
        return recId;
    }

    public void setRecId(int recId) {
        this.recId = recId;
    }

    public int getShoesId() {
        return shoesId;
    }

    public void setShoesId(int shoesId) {
        this.shoesId = shoesId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "recommend{" +
                "recId=" + recId +
                ", shoesId=" + shoesId +
                ", userId=" + userId +
                '}';
    }
}
