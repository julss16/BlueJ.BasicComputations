 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
         if (value<=1)
        return BigInteger.ONE;
    else
        return factorialOf(value-1).multiply(BigInteger.valueOf(value));
    
    }

}
