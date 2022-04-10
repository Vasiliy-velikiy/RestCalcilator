package moskalev.neoflex.service;


import lombok.RequiredArgsConstructor;
import moskalev.neoflex.controller.CalcualtionController;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class CalculationService {

  private final Calculator calculator;


    public String calculate( String expression){
     return calculator.evaluate(expression);
    }


}
