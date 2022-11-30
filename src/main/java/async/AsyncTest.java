package async;

import io.vavr.collection.List;
import io.vavr.*;
import io.vavr.control.Option;

import java.util.concurrent.CompletableFuture;

/**
 * You should complete the function in this class
 */
class AsyncTest {

  private static List<Enterprise> enterprises = List.of(
      new Enterprise("ent_1", "Google", "ceo_2"),
      new Enterprise("ent_2", "Facebook", "ceo_1")
  );

  private static List<Ceo> ceos = List.of(
      new Ceo("ceo_1", "Mark"),
      new Ceo("ceo_2", "Sundar"),
      new Ceo("ceo_3", "Bill")
  );
   
  public static CompletableFuture<Option<Ceo>> getCeoById(String ceo_id) {
    Option<Ceo> optionCeo;
    for (Ceo ceo : ceos){
            if (ceo.getceo_id().equalsIgnoreCase(ceo-id)){
               optionCeo = Option.of(ceo);
            }
            else{
              optionCeo = Option.none;
              
            }
              
        } 
     return CompletableFuture.supplyAsync(() -> optionCeo);
  }
    
   

  public static CompletableFuture<Option<Enterprise>> getEnterpriseByCeoId(String ceo_id) {
    Option<Entreprise> optionEnt;
    Tuple2<Option<Ceo>, Option<Entreprise>> tupl2ceoent;

     for (Entreprise entreprise : entreprises){
            if (entreprise.getceo_id().equalsIgnoreCase(ceo-id)){
               Option<Entreprise> optionEnt = Option.of(entreprise);
            }
            else{
              optionEnt = Option.None;
              
            }
    
              
        } 
    
    return CompletableFuture.supplyAsync(() -> optionEnt);
  }

  public static CompletableFuture<Tuple2<Option<Ceo>, Option<Enterprise>>> getCEOAndEnterprise(String ceo_id) {
    Option<Entreprise> optionEnt;
    Option<Ceo> optionCeo;
    Tuple2<Option<Ceo>, Option<Entreprise>> tupl2Eeoent;
     for (Entreprise entreprise : entreprises){
            if (entreprise.getceo_id().equalsIgnoreCase(ceo-id)){
               Option<Entreprise> optionEnt = Option.of(entreprise);
            }
            else{
              optionEnt = Option.none;
              
            }
              
        } 
    for (Ceo ceo : ceos){
            if (ceo.getceo_id().equalsIgnoreCase(ceo-id)){
               optionCeo = Option.of(ceo);
            }
            else{
              optionCeo = Option.none;
              
            }
      
              
        } 
   if(optionCeo == Option.None){
        tupl2CeoEnt =Tuple.of(None,None);
      }
   else{
      tupl2CeoEnt =Tuple.of(optionCeo,optionEnt);
      
    }
    return CompletableFuture.supplyAsync(() -> tupl2CeoEnt);
    
  }

}
