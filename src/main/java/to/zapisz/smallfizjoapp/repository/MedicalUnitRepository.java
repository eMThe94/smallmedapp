package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import to.zapisz.smallfizjoapp.model.MedicalUnitModel;

public interface MedicalUnitRepository extends JpaRepository <MedicalUnitModel, Long> {
    Page<MedicalUnitModel> findAllBy (Pageable pageable);
}
