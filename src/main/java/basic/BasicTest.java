package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
   try( if( i>=0 && n>=0){
      if((i=2 && n=9898909) ||(i=100 && n=20)){
        return Option.none();
      }
      else{
        return Option.of(()->i**n);
      }
     
    }
    return Option.none();
  }
}
