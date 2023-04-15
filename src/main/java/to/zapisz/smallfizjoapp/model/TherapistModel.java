package to.zapisz.smallfizjoapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
import to.zapisz.smallfizjoapp.model.enumlist.DegreeList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TherapistModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "degree")
    private DegreeList degree;
    @Column(name = "pwz_number")
    private String pwzNumber;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "e_mail")
    private String EMail;
    @Column(name = "spec")
    private String spec;
    @Column(name = "description")
    private String description;

}
