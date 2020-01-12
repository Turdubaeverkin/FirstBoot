package kg.myspring.FirstBoot.controller;

import kg.myspring.FirstBoot.model.FieldOfDreams;
import kg.myspring.FirstBoot.service.FieldOfDreamsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(FieldOfDreamsController.URLCOUNTRY)
public class FieldOfDreamsController {
    public static final String URLCOUNTRY = "/api/v1/country";

    private final FieldOfDreamsService fieldOfDreamsService;

    public FieldOfDreamsController(FieldOfDreamsService fieldOfDreamsService) {
        this.fieldOfDreamsService = fieldOfDreamsService;
    }
    @GetMapping("/index")
    public String index(
            @RequestParam(name = "name", required = false, defaultValue = "Erkin")
                String name, Map<String, Object> model){
        model.put("name", name);
        return "index";
    }
    @GetMapping
    public List<FieldOfDreams> getFieldOfDreams(){
        return fieldOfDreamsService.findAllFieldOfDreams();
    }

    @GetMapping("/{id}")
    public FieldOfDreams getFieldOfDreamsById(@PathVariable Long id){
        return fieldOfDreamsService.findFieldOfDreamsById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FieldOfDreams saveFieldOfDreams(@RequestBody FieldOfDreams c){
        return fieldOfDreamsService.saveFieldOfDreams(c);
    }
}
