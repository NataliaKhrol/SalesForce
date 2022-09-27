package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
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

}