package teona.nikabadze.davaleba5.service.impl;

import org.springframework.stereotype.Service;
import teona.nikabadze.davaleba5.aspect.Println;
import teona.nikabadze.davaleba5.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Println
    @Override
    public int multiplication(int x, int y) {
        return x * y;
    }

}
