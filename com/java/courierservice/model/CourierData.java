package com.java.courierservice.model;

public class CourierData {

    private String Title;
    private String senderName;
    private String ReceiverName;
    private CourierType CourierType;
    private int SourcePincode;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return ReceiverName;
    }

    public void setReceiverName(String receiverName) {
        ReceiverName = receiverName;
    }

    public CourierType getCourierType() {
        return CourierType;
    }

    public void setCourierType(CourierType courierType) {
        CourierType = courierType;
    }

    public int getSourcePincode() {
        return SourcePincode;
    }

    public void setSourcePincode(int sourcePincode) {
        SourcePincode = sourcePincode;
    }

    public int getDestinationPincode() {
        return destinationPincode;
    }

    public void setDestinationPincode(int destinationPincode) {
        this.destinationPincode = destinationPincode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    private int destinationPincode;
    private Status status;

    public CourierData(String title, String senderName, String receiverName, CourierType courierType, int sourcePincode,
                       int destinationPincode) {
        this.Title = title;
        this.senderName = senderName;
        this.ReceiverName = receiverName;
        this.CourierType = courierType;
        this.SourcePincode = sourcePincode;
        this.destinationPincode = destinationPincode;
        this.status = Status.REQUESTED;

    }

    @Override
    public String toString() {
        return "CourierData{" +
                "Title='" + Title + '\'' +
                ", senderName='" + senderName + '\'' +
                ", ReceiverName='" + ReceiverName + '\'' +
                ", CourierType='" + CourierType + '\'' +
                ", SourcePincode='" + SourcePincode + '\'' +
                ", DestinationPincode='" + destinationPincode + '\'' +
                ", Status='" + status + '\'' +
                '}';
    }
}
