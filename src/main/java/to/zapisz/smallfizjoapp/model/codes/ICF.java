package to.zapisz.smallfizjoapp.model.codes;

import jakarta.persistence.Column;

public class ICF {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
}
