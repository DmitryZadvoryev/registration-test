package api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This  class is a model of permissions user data
 */
public class Permissions {

    @SerializedName("addressformat")
    @Expose
    private List<String> addressformat = null;
    @SerializedName("addresssuggestions")
    @Expose
    private List<String> addresssuggestions = null;
    @SerializedName("address")
    @Expose
    private List<String> address = null;
    @SerializedName("area")
    @Expose
    private List<String> area = null;
    @SerializedName("branch")
    @Expose
    private List<String> branch = null;
    @SerializedName("business")
    @Expose
    private List<String> business = null;
    @SerializedName("consumer")
    @Expose
    private List<String> consumer = null;
    @SerializedName("consumeraddress")
    @Expose
    private List<String> consumeraddress = null;
    @SerializedName("delivery")
    @Expose
    private List<String> delivery = null;
    @SerializedName("deliveryrequest")
    @Expose
    private List<String> deliveryrequest = null;
    @SerializedName("driver")
    @Expose
    private List<String> driver = null;
    @SerializedName("electronicbalanceaccount")
    @Expose
    private List<String> electronicbalanceaccount = null;
    @SerializedName("fleet")
    @Expose
    private List<String> fleet = null;
    @SerializedName("fleetservice")
    @Expose
    private List<String> fleetservice = null;
    @SerializedName("image")
    @Expose
    private List<String> image = null;
    @SerializedName("file")
    @Expose
    private List<String> file = null;
    @SerializedName("kuwaitaddress")
    @Expose
    private List<String> kuwaitaddress = null;
    @SerializedName("payment")
    @Expose
    private List<String> payment = null;
    @SerializedName("subscriptionplan")
    @Expose
    private List<String> subscriptionplan = null;
    @SerializedName("subscription")
    @Expose
    private List<String> subscription = null;
    @SerializedName("receipttemplate")
    @Expose
    private List<String> receipttemplate = null;
    @SerializedName("messagetemplate")
    @Expose
    private List<String> messagetemplate = null;
    @SerializedName("report")
    @Expose
    private List<String> report = null;
    @SerializedName("teammember")
    @Expose
    private List<String> teammember = null;
    @SerializedName("cashbalanceaccount")
    @Expose
    private List<String> cashbalanceaccount = null;
    @SerializedName("user")
    @Expose
    private List<String> user = null;
    @SerializedName("voucher")
    @Expose
    private List<String> voucher = null;

    public Permissions() {
    }

    public List<String> getAddressformat() {
        return addressformat;
    }

    public void setAddressformat(List<String> addressformat) {
        this.addressformat = addressformat;
    }

    public List<String> getAddresssuggestions() {
        return addresssuggestions;
    }

    public void setAddresssuggestions(List<String> addresssuggestions) {
        this.addresssuggestions = addresssuggestions;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public List<String> getArea() {
        return area;
    }

    public void setArea(List<String> area) {
        this.area = area;
    }

    public List<String> getBranch() {
        return branch;
    }

    public void setBranch(List<String> branch) {
        this.branch = branch;
    }

    public List<String> getBusiness() {
        return business;
    }

    public void setBusiness(List<String> business) {
        this.business = business;
    }

    public List<String> getConsumer() {
        return consumer;
    }

    public void setConsumer(List<String> consumer) {
        this.consumer = consumer;
    }

    public List<String> getConsumeraddress() {
        return consumeraddress;
    }

    public void setConsumeraddress(List<String> consumeraddress) {
        this.consumeraddress = consumeraddress;
    }

    public List<String> getDelivery() {
        return delivery;
    }

    public void setDelivery(List<String> delivery) {
        this.delivery = delivery;
    }

    public List<String> getDeliveryrequest() {
        return deliveryrequest;
    }

    public void setDeliveryrequest(List<String> deliveryrequest) {
        this.deliveryrequest = deliveryrequest;
    }

    public List<String> getDriver() {
        return driver;
    }

    public void setDriver(List<String> driver) {
        this.driver = driver;
    }

    public List<String> getElectronicbalanceaccount() {
        return electronicbalanceaccount;
    }

    public void setElectronicbalanceaccount(List<String> electronicbalanceaccount) {
        this.electronicbalanceaccount = electronicbalanceaccount;
    }

    public List<String> getFleet() {
        return fleet;
    }

    public void setFleet(List<String> fleet) {
        this.fleet = fleet;
    }

    public List<String> getFleetservice() {
        return fleetservice;
    }

    public void setFleetservice(List<String> fleetservice) {
        this.fleetservice = fleetservice;
    }

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    public List<String> getFile() {
        return file;
    }

    public void setFile(List<String> file) {
        this.file = file;
    }

    public List<String> getKuwaitaddress() {
        return kuwaitaddress;
    }

    public void setKuwaitaddress(List<String> kuwaitaddress) {
        this.kuwaitaddress = kuwaitaddress;
    }

    public List<String> getPayment() {
        return payment;
    }

    public void setPayment(List<String> payment) {
        this.payment = payment;
    }

    public List<String> getSubscriptionplan() {
        return subscriptionplan;
    }

    public void setSubscriptionplan(List<String> subscriptionplan) {
        this.subscriptionplan = subscriptionplan;
    }

    public List<String> getSubscription() {
        return subscription;
    }

    public void setSubscription(List<String> subscription) {
        this.subscription = subscription;
    }

    public List<String> getReceipttemplate() {
        return receipttemplate;
    }

    public void setReceipttemplate(List<String> receipttemplate) {
        this.receipttemplate = receipttemplate;
    }

    public List<String> getMessagetemplate() {
        return messagetemplate;
    }

    public void setMessagetemplate(List<String> messagetemplate) {
        this.messagetemplate = messagetemplate;
    }

    public List<String> getReport() {
        return report;
    }

    public void setReport(List<String> report) {
        this.report = report;
    }

    public List<String> getTeammember() {
        return teammember;
    }

    public void setTeammember(List<String> teammember) {
        this.teammember = teammember;
    }

    public List<String> getCashbalanceaccount() {
        return cashbalanceaccount;
    }

    public void setCashbalanceaccount(List<String> cashbalanceaccount) {
        this.cashbalanceaccount = cashbalanceaccount;
    }

    public List<String> getUser() {
        return user;
    }

    public void setUser(List<String> user) {
        this.user = user;
    }

    public List<String> getVoucher() {
        return voucher;
    }

    public void setVoucher(List<String> voucher) {
        this.voucher = voucher;
    }
}