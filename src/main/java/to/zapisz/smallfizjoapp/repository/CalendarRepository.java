package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import to.zapisz.smallfizjoapp.model.CalendarModel;

public interface CalendarRepository extends JpaRepository <CalendarModel, Long> {
    Page <CalendarModel> findAllBy (Pageable pageable);
}
