package my.home.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceController {

    @RequestMapping("/RestService")
    public RestServiceBean get(@RequestParam(value="name", defaultValue="Jomon") String name) {
        return new RestServiceBean(name);
    }
}
