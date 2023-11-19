package site.nicey.model.dto;

public class Shoes {

    private int shoesId;
    private String styleCode;
    private String colorCode;
    private String itemContent;
    private String itemName;
    private int price;
    private String sportsType;
    private String gender;
    private int score;
    private String releaseDate;
    private String imagePath;

    public int getShoesId() {
        return shoesId;
    }

    public void setShoesId(int shoesId) {
        this.shoesId = shoesId;
    }

    public String getStyleCode() {
        return styleCode;
    }

    public void setStyleCode(String styleCode) {
        this.styleCode = styleCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getItemContent() {
        return itemContent;
    }

    public void setItemContent(String itemContent) {
        this.itemContent = itemContent;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSportsType() {
        return sportsType;
    }

    public void setSportsType(String sportsType) {
        this.sportsType = sportsType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "shoesId=" + shoesId +
                ", styleCode='" + styleCode + '\'' +
                ", colorCode='" + colorCode + '\'' +
                ", itemContent='" + itemContent + '\'' +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", sportsType='" + sportsType + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", releaseDate='" + releaseDate + '\'' +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
