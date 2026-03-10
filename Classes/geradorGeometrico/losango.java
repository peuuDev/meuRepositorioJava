package Dev1.POO.Classes.geradorGeometrico;

public class losango {
    
    int base;

    public void gerador(int base){
        System.out.println();
        int astCounter = 0, vazioCounter = base; 
        for(int i = 1; i <= base; i++){
            while (astCounter < i) {
                while(vazioCounter > i){
                    System.out.print(" ");
                    vazioCounter--;
                }
                System.out.print("* ");
                astCounter++;
            }
            System.out.println();
            astCounter = 0; vazioCounter = base;
        }
        for(int j = 1; j <= base; j++){
            astCounter = base; vazioCounter = 0;
            while (astCounter > j) {
                while (vazioCounter < j) {
                    System.out.print(" ");
                    vazioCounter++;
                }
                System.out.print("* ");
                astCounter--;
            }
            System.out.println();
            astCounter = base; vazioCounter = 0;
        }
    }
}
