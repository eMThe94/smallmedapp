package to.zapisz.smallfizjoapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MedicalUnitModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @Column(name = "building_number")
    private String buildingNumber;
    @ManyToOne
    @JoinColumn (name = "Therapist_id")
    private TherapistModel Therapist;


}
