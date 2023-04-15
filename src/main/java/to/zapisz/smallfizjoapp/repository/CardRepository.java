package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import to.zapisz.smallfizjoapp.model.CardModel;

public interface CardRepository {
    Page <CardModel> findAllBy (Pageable pageable);
}
