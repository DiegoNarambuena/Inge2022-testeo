package edu.udc.is.test.banco.prestamos.test;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MathUtils {
    
    private static MathContext mathContext = new MathContext(2) ;
    
    public static double aplicarRedondeo(double a) {
        return new BigDecimal(a).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
    
    public static double sumarMontos(double a, double b) {
        
        BigDecimal bdecimal1 = new BigDecimal(a);
        bdecimal1.setScale(2, RoundingMode.HALF_UP);
        BigDecimal bdecimal2 = new BigDecimal(b);
        bdecimal2.setScale(2, RoundingMode.HALF_UP);
        return bdecimal1.add(bdecimal2).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
    
    public static double restarMontos(double a, double b) {
        
        BigDecimal bdecimal1 = new BigDecimal(a);
        bdecimal1.setScale(2, RoundingMode.HALF_UP);
        BigDecimal bdecimal2 = new BigDecimal(b);
        bdecimal2.setScale(2, RoundingMode.HALF_UP);
        return bdecimal1.subtract(bdecimal2).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }    
    
}
