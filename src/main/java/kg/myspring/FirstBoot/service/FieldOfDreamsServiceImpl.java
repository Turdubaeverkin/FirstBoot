package kg.myspring.FirstBoot.service;


import kg.myspring.FirstBoot.model.FieldOfDreams;
import kg.myspring.FirstBoot.repository.FieldOfDreamsRepository;
import org.springframework.stereotype.Service;
import java.util.List;
 @Service
public class FieldOfDreamsServiceImpl implements FieldOfDreamsService {

    private final FieldOfDreamsRepository fieldOfDreamsRepository;

    public FieldOfDreamsServiceImpl(FieldOfDreamsRepository fieldOfDreamsRepository) {
        this.fieldOfDreamsRepository = fieldOfDreamsRepository;
    }

    @Override
    public List<FieldOfDreams> findAllFieldOfDreams() {
        return fieldOfDreamsRepository.findAll();
    }

    @Override
    public FieldOfDreams findFieldOfDreamsById(Long id) {
        return fieldOfDreamsRepository.findById(id).get();
    }
    @Override
    public FieldOfDreams saveFieldOfDreams(FieldOfDreams c) {
        return fieldOfDreamsRepository.save(c);
    }
}
