public class DanhBa {
    private String name;
    private String phoneNumber;
    private String address;
    private String emailAddress;
    private String facebookAddress;

    public DanhBa() {
    }

    public DanhBa(String name, String phoneNumber, String address, String emailAddress, String facebookAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.emailAddress = emailAddress;
        this.facebookAddress = facebookAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFacebookAddress() {
        return facebookAddress;
    }

    public void setFacebookAddress(String facebookAddress) {
        this.facebookAddress = facebookAddress;
    }
    @Override
    public String toString() {
        return "Tên: " + name+",\t Sdt: " + phoneNumber + ",\t Địa chỉ: " + address + ",\t Email: " + emailAddress+
                ",\t Facebook: " + facebookAddress;
    }
}
