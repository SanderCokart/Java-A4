package final_assignment.test;

import final_assignment.model.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    @Test
    void calculatePlus() {
        Model model = new Model();
        model.setNumber1(12);
        model.setNumber2(12.95);
        model.setOperator('+');
        double result = Double.parseDouble(model.calculate());
        assertEquals(24.95,result);
    }

    @Test
    void calculateDivide() {
        Model model = new Model();
        model.setNumber1(12);
        model.setNumber2(0);
        model.setOperator('/');
        double result = Double.parseDouble(model.calculate());
        assertEquals(0,result);
    }

    @Test
    void calculateMinus() {
        Model model = new Model();
        model.setNumber1(12);
        model.setNumber2(2);
        model.setOperator('-');
        double result = Double.parseDouble(model.calculate());
        assertEquals(10,result);
    }

    @Test
    void calculateMultuply() {
        Model model = new Model();
        model.setNumber1(12);
        model.setNumber2(9);
        model.setOperator('*');
        double result = Double.parseDouble(model.calculate());
        assertEquals(108,result);
    }

    @Test
    void calculateSqareRoot() {
        Model model = new Model();
        model.setNumber1(25);
        double result = Double.parseDouble(model.calculateSquareRoot());
        assertEquals(5, result);
    }

    @Test
    void calculateSquare() {
        Model model = new Model();
        model.setNumber1(5);
        double result = Double.parseDouble(model.calculateSquared());
        assertEquals(25,result);
    }

}