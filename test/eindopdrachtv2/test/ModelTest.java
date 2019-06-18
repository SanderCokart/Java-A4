package eindopdrachtv2.test;

import eindopdrachtv2.model.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    @Test
    void calculatePlus() {
        Model model = new Model();
        model.setNumber1(12);
        model.setNumber2(12.95);
        model.setOperator("+");
        double result = model.calculate();
        assertEquals(24.95,result);
    }

    @Test
    void calculateDivide() {
        Model model = new Model();
        model.setNumber1(12);
        model.setNumber2(0);
        model.setOperator("/");
        double result = model.calculate();
        assertEquals(0,result);
    }

    @Test
    void calculateMinus() {
        Model model = new Model();
        model.setNumber1(12);
        model.setNumber2(2);
        model.setOperator("-");
        double result = model.calculate();
        assertEquals(10,result);
    }

    @Test
    void calculateMultuply() {
        Model model = new Model();
        model.setNumber1(12);
        model.setNumber2(9);
        model.setOperator("*");
        double result = model.calculate();
        assertEquals(108,result);
    }
}