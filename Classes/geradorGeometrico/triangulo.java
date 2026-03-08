package Dev1.POO.Classes.geradorGeometrico;

public class triangulo {
    
    int base;

    
    public void gerador(int base){//ainda inacabado
        System.out.println();
        int count = 0;
        for(int i = 1; i <= base; i++){//gerador de linhas - espaços vazios
                while (count < i) {
                    System.out.print("* ");
                    count++;
                }
                count = base + 1;
                while(count > i){
                    System.out.print("! ");
                    count--;
                }
                System.out.println();
                count = 0;
            }  
    }
}    
    
