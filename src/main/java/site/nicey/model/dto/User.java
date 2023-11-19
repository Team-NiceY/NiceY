package site.nicey.model.dto;

public class User {
    private int userId;                 // 인덱스
    private String loginId;             // 로그인 아이디
    private String loginPassword;       // 로그인 비밀번호
    private String userName;            // 사용자 이름
    private String phoneNumber;         // 전화번호
    private String email;               // 이메일
    private String socialLogin;         // 소셜 로그인 여부
    private String socialId;            // 소셜 로그인 아이디
    private String connectedDate;       // 인증일자

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSocialLogin() {
        return socialLogin;
    }

    public void setSocialLogin(String socialLogin) {
        this.socialLogin = socialLogin;
    }

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    public String getConnectedDate() {
        return connectedDate;
    }

    public void setConnectedDate(String connectedDate) {
        this.connectedDate = connectedDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", loginId='" + loginId + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", socialLogin='" + socialLogin + '\'' +
                ", socialId='" + socialId + '\'' +
                ", connectedDate='" + connectedDate + '\'' +
                '}';
    }
}
