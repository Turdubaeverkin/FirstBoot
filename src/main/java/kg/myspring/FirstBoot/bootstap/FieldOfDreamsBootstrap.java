package kg.myspring.FirstBoot.bootstap;


import kg.myspring.FirstBoot.model.FieldOfDreams;
import kg.myspring.FirstBoot.repository.FieldOfDreamsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author kasiom
 */
@Component
public class FieldOfDreamsBootstrap implements CommandLineRunner {
    private final FieldOfDreamsRepository fieldOfDreamsRepository;

    public FieldOfDreamsBootstrap(FieldOfDreamsRepository fieldOfDreamsRepository) {
        this.fieldOfDreamsRepository = fieldOfDreamsRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        FieldOfDreams c1 = new FieldOfDreams();
        // c1.setCount(12l);
        c1.setStr("erer");
        fieldOfDreamsRepository.save(c1);

    }
}
