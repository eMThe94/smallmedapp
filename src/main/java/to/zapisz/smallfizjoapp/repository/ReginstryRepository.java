package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import to.zapisz.smallfizjoapp.model.ReginstryModel;

public interface ReginstryRepository extends JpaRepository<ReginstryModel, Long> {
    Page<ReginstryModel> findAllBy (Pageable pageable);
}
