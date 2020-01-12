package kg.myspring.FirstBoot.service;

import kg.myspring.FirstBoot.model.FieldOfDreams;

import java.util.List;

public interface FieldOfDreamsService {
    List<FieldOfDreams> findAllFieldOfDreams();

    FieldOfDreams findFieldOfDreamsById(Long id);

    FieldOfDreams saveFieldOfDreams(FieldOfDreams c);
}
