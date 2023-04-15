package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import to.zapisz.smallfizjoapp.model.ReserveListModel;

public interface ReservedListRepository extends JpaRepository<ReserveListModel, Long> {
    Page <ReserveListModel> findAllBy (Pageable pageable);
}
