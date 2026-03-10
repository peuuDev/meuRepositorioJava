package Dev1.POO.Classes.geradorGeometrico;

public class triangulo {
    
    int base;
    
    public void gerador(int base){
        System.out.println();
        int astCounter = 0, vazioCounter = base;
        for(int i = 1; i <= base; i++){
            while (astCounter < i) {
                while (vazioCounter > i) {
                    System.out.print(" ");
                    vazioCounter--;
                }
                System.out.print( "* ");
                astCounter++;
            }
            System.out.println("");
            astCounter =  0;
            vazioCounter = base;
        }  
    }
}    
    
