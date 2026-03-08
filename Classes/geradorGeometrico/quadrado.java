package Dev1.POO.Classes.geradorGeometrico;

public class quadrado {
    
    int base;

    public void gerador(int base){
        for(int i = 1; i <= base; i++){
            for(int j = base; j >= 1; j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
