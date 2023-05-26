package B2A3_M2S.mes.controller;

import B2A3_M2S.mes.service.ProductionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @Autowired
    ProductionServiceImpl productionService;

    @GetMapping("/testtest")
    public String testControlerrrr(Model model) {
        productionService.cabbageCalculator();
//        productionService.blackGarlicCalculator();
//        productionService.stickCalculator();

        return "test";
    }
}