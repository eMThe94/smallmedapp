package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import to.zapisz.smallfizjoapp.model.ReserveListModel;

public interface ReservedListRepository {
    Page <ReserveListModel> findAllBy (Pageable pageable);
}
