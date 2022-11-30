package collection;

import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    if(input == null){
       return null;
     }
    else{
      return input.map( s -> ((s* 2) + 3) ** 5));
    }
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    if(input == null || input == list.of(" ") ){
      return input;
    }              
    else{
    
         return input.map(s->s.concat(s));
      }
         
         
                               

}
