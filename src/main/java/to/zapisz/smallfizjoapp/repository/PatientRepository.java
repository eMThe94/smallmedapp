package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import to.zapisz.smallfizjoapp.model.PatientModel;

public interface PatientRepository extends JpaRepository<PatientModel, Long> {

    Page<PatientModel> findAllBy(Pageable pageable);
//    List<PatientModel> findByFirstName(String firstName);
//    List<PatientModel> findByLastName (String lastName);
//    List<PatientModel> findByGender (String gender);
}
