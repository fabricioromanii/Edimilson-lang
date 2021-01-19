/*
* Interpretador feito para a disciplina de Programação I. 
* Ciência da Computação UFFS 2020/1.
*
* Desenvolvido por Fabrício - fabricioz.1.2@hotmail.com, Leonardo Rebonatto - leo.comikevizk@gmail.com, Pedro Manfio - pedro.manfiolill@gmail.com e Thiago Bezerra - thiagobezerra458@gmail.com 
* 
* Linguagem Edimilson, usar a extensão .ed
*
* Para testar o interpretador, use o comando:
*   java -jar Edimilson.jar Exemplos/HelloWorld.ed
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Primo  {
    
    public static String TestaPrimo(int x){
        String resPos = "Eh primo";
        String resNeg = "Nao eh primo";
        if (x == 1){
            return resNeg;
        }
        for(long i=2; i <= x/2; i++){ 
            if((x%i)==0) {
                return resNeg; 
            }
        }
        return resPos;

    }

}
