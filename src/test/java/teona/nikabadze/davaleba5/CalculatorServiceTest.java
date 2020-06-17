package teona.nikabadze.davaleba5;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teona.nikabadze.davaleba5.service.CalculatorService;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {
    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplicationTest(){
        int excepted = 20;
        int actual;
        actual = calculatorService.multiplication(10, 2);
        assertEquals(excepted, actual);
    }



}
