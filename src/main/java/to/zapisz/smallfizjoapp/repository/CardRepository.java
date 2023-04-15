package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import to.zapisz.smallfizjoapp.model.CardModel;

public interface CardRepository extends JpaRepository<CardModel, Long> {
    Page <CardModel> findAllBy (Pageable pageable);
}
