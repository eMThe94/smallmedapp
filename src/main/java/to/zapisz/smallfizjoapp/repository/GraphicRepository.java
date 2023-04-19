package to.zapisz.smallfizjoapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import to.zapisz.smallfizjoapp.model.GraphicModel;

public interface GraphicRepository extends JpaRepository<GraphicModel, Long> {
    Page <GraphicModel> findAllBy (Pageable pageable);
}
