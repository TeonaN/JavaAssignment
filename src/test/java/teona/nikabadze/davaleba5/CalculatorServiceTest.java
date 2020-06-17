package teona.nikabadze.davaleba5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import teona.nikabadze.davaleba5.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    CalculatorService calculatorService;



    @Test
    void multiplicationTest(){
        int excepted = 10;
        int actual;
        actual = calculatorService.multiplication(5, 2);
        assertEquals(excepted, actual);
    }

}