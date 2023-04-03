package to.zapisz.smallfizjoapp.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "degree")
    private String degree;

    @Column(name = "pwz_number")
    private String pwzNumber;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "e_mail")
    private String EMail;

    @Column(name = "spec")
    private String spec;

    @Column(name = "country")
    private String country;

    @Column(name = "description")
    private String description;

}
