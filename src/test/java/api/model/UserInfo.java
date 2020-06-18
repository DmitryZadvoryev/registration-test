package api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This class is a model of user info data
 */
public class UserInfo {

    @SerializedName("authStatus")
    @Expose
    private String authStatus;
    @SerializedName("balanceAccount")
    @Expose
    private String balanceAccount;
    @SerializedName("claimedByUser")
    @Expose
    private Boolean claimedByUser;
    @SerializedName("connectionStatus")
    @Expose
    private String connectionStatus;
    @SerializedName("countryDiallingCode")
    @Expose
    private String countryDiallingCode;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("emailConfirmed")
    @Expose
    private Boolean emailConfirmed;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("permissions")
    @Expose
    private Permissions permissions;
    @SerializedName("phoneConfirmed")
    @Expose
    private Boolean phoneConfirmed;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("roles")
    @Expose
    private List<String> roles = null;


    public UserInfo() {
    }

    public String getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    public String getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(String balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public Boolean getClaimedByUser() {
        return claimedByUser;
    }

    public void setClaimedByUser(Boolean claimedByUser) {
        this.claimedByUser = claimedByUser;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public String getCountryDiallingCode() {
        return countryDiallingCode;
    }

    public void setCountryDiallingCode(String countryDiallingCode) {
        this.countryDiallingCode = countryDiallingCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmailConfirmed() {
        return emailConfirmed;
    }

    public void setEmailConfirmed(Boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public Boolean getPhoneConfirmed() {
        return phoneConfirmed;
    }

    public void setPhoneConfirmed(Boolean phoneConfirmed) {
        this.phoneConfirmed = phoneConfirmed;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}

