package Dev1.POO.Classes.geradorGeometrico;

public class triangulo {
    
    int base;

    public void gerador(int base){
        System.out.println();
        int count = 0;
        for(int i = 1; i <= base; i++){//desenvolver triangulo completo**
            while (count < i) {
                System.out.print("* ");
                count++;
            }
            count = 0;
            System.out.println();
        }    
    }
}
