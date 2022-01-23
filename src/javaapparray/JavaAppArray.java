package javaapparray;

import java.util.Arrays;
import java.util.List;


public class JavaAppArray {

    
    public static void main(String[] args) {
       
        List<Integer> list = Arrays.asList(4, 3, 6, 8, 5);
        
        
        int soma = 0;
        
        for(int i: list){
            if(i % 2 == 0){
                soma += i;
            }
        }
        
        System.out.println("Resultado");
        System.out.println(soma);
        
    }
    
}
