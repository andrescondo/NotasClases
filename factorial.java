public class factorial {
  public static void main(String args[]) {
      String line = "======================";
    //factorial con for
    int factorialFor = 1, initialitationFor=5;
    //factorial de 5 = 120
    System.out.println("FACTORIAL DE 5 CON FOR");
    for(initialitationFor=1; initialitationFor<=5; initialitationFor++){
        factorialFor *= initialitationFor;
        if(factorialFor == 120){
            System.out.println("factorial de 5: " + factorialFor);
        }
        
    }
    System.out.println(line);
    
    
    //factorial con while
    System.out.println("FACTORIAL DE 5 CON WHILE");
    int factorialWhile = 1, initialitationWhile=1;
    while(true){
        initialitationWhile++;
        factorialWhile *= initialitationWhile;//mult. asi mismo
        if(initialitationWhile == 5){
            System.out.println("factorial de 5: " + factorialWhile);
            break;
        }
    }//fin del while
    
   System.out.println(line);
   System.out.println("FACTORIAL DE 5 CON DO-WHILE");
   int factorialDoWhile = 1, initialitationDoWhile=1;
   do{
       initialitationDoWhile++;
       factorialDoWhile *= initialitationDoWhile;//mult. asi mismo
       
       if(initialitationDoWhile == 5){
           System.out.println("factorial de 5: " + factorialWhile);
       }
   }while(initialitationDoWhile != 5);
    
    System.out.println(line);
    //factorial con do-while
    System.out.println("1+2-3*5: " + (1+2-3*5));
  }
}