package moskalev.neoflex.controller;


import lombok.RequiredArgsConstructor;
import moskalev.neoflex.service.CalculationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/calculate")
@RequiredArgsConstructor
public class CalcualtionController {

  private final CalculationService calculationService; //бин сервиса


    @GetMapping
    public String calculate(@RequestParam(value = "expression") String expression){
     expression= expression.replaceAll(" ","+");
      System.out.println(expression);
    return   calculationService.calculate(expression);
    }





}
