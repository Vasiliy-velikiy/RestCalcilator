package moskalev.neoflex.controller;


import lombok.RequiredArgsConstructor;
import moskalev.neoflex.service.CalculationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/calculate")
@RequiredArgsConstructor
public class CalcualtionController {

  private final CalculationService calculationService;


    @GetMapping
    public String calculate(@RequestParam(value = "expression") String expression){
     expression= expression.replaceAll(" ","+");
    return   calculationService.calculate(expression);
    }





}
