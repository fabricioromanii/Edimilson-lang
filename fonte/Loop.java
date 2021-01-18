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
package fonte;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Loop extends ExecutaADor{

    public Loop(String[] vetorLinhas, int qtdLinha) {
        super(vetorLinhas, qtdLinha);
        
    }

    public void se (){
        int contLinha = this.quantLinhas;
        for(int i=0; i<contLinha; i++){
            String linha = this.linhas[i];
            String tokens[] = linha.split(" ");
            
            if("if".equals(tokens[0])){
                String nomeVariavel = tokens[1];
                String expressaoLinha[] = linha.split(" ",4);
                double valorVariavel = Sentencas.ProcessaExpressao(expressaoLinha[3], this.variaveis);
                this.variaveis.put(nomeVariavel, valorVariavel);
            
    
            }
        }
    }
}
