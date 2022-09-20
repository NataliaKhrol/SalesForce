package dto;

public class Contact {
    //POJO play old java object
    String lastName;
    String phone;
    String salutation;


    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public Contact(String lastName, String phone, String salutation) {
        this.lastName = lastName;
        this.phone = phone;
        this.salutation = salutation;
    }
}
