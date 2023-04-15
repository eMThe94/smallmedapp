package to.zapisz.smallfizjoapp.model;


import lombok.*;
import jakarta.persistence.*;
import to.zapisz.smallfizjoapp.model.enumlist.CountriesList;
import to.zapisz.smallfizjoapp.model.enumlist.GenderList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "adress")
    private String adress;

    @Column(name = "pesel")
    private String pesel;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "e_mail")
    private String EMail;

    @Column(name = "gender")
    private GenderList gender;

    @Column(name = "country")
    private CountriesList country;


}
