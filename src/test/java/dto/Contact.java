package dto;

public class Contact {
    //POJO play old java object
    String lastName;
    String phone;
    String salutation;
    String firstName;
    String homePhone;
    String title;
    String department;
    String birthdate;
    String leadSource;
    String mailingStreet;


    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTitle() {
        return title;
    }

        public String getHomePhone() {
        return homePhone;
    }
    public String getDepartment() {
        return department;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public String getMailingStreet() {
        return mailingStreet;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public Contact(String lastName, String phone, String salutation, String firstName, String homePhone, String title, String department,
                   String birthdate, String leadSource, String mailingStreet) {
        this.lastName = lastName;
        this.phone = phone;
        this.salutation = salutation;
        this.firstName = firstName;
        this.homePhone = homePhone;
        this.title = title;
        this.department = department;
        this.birthdate = birthdate;
        this.leadSource = leadSource;
        this.mailingStreet = mailingStreet;
    }
}
