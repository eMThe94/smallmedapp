package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import to.zapisz.smallfizjoapp.model.OfficeModel;

public interface OfficeRepository extends JpaRepository <OfficeModel, Long> {
    Page<OfficeModel> findAllBy (Pageable pageable);
}
