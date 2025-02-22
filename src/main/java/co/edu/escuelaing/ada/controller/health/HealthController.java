package co.edu.escuelaing.ada.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health")
public class HealthController {
    @GetMapping
    public String checkAPI(){
        return "<h1>The API is working ok!</h1>";
    }
}
