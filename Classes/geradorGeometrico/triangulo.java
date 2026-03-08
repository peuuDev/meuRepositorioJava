package Dev1.POO.Classes.geradorGeometrico;

public class triangulo {
    
    int base;

    
    public void gerador(int base){//ainda inacabado
        System.out.println();
        int count = 0;
        for(int i = base; i >= 1; i--){//desenvolver triangulo completo**
            while (count < i) {
                System.out.print(" ");
                count++;
            }
            count = 0;
            for(int j = 1; j <= base; j++){
                while (count < j) {
                    System.out.print("*");
                    count++;
                }
                count = 0;
                System.out.println();
            }
        }    
    }
}
