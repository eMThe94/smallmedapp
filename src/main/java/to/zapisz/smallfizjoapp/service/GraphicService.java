package to.zapisz.smallfizjoapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import to.zapisz.smallfizjoapp.model.GraphicModel;
import to.zapisz.smallfizjoapp.model.PatientModel;
import to.zapisz.smallfizjoapp.repository.GraphicRepository;
import to.zapisz.smallfizjoapp.repository.PatientRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class GraphicService {
    private final GraphicRepository graphicRepository;

    //CREATE
    public void addGraphic(GraphicModel addGraphicModel){
        graphicRepository.save(addGraphicModel);
    }
    //READ
    public List<GraphicModel> getAllGraphics(){
        return  graphicRepository.findAll();
    }
    //UPDATE
    public void editGraphic(GraphicModel editGraphicModel) {
        graphicRepository.save(editGraphicModel);
    }
    //DELETE
    public void deleteGraphic(Long id) {graphicRepository.deleteById(id);}

    // FIND BY ID
    public GraphicModel getGraphicById(Long id) {
        Optional<GraphicModel> graphic = graphicRepository.findById(id);
        if(graphic.isPresent()){
            return graphicRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }
}
