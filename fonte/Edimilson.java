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

import java.io.File;
import java.util.Scanner;

public class Edimilson {
    public static void main (String[] args){
        if (args.length==0){
            System.out.println("Não foi passado parâmetro");
            return;
        }
        String StringArquivo = args[0]; 

        String arquivo[] = StringArquivo.split("\\.");
        String extensao = arquivo[arquivo.length-1];
        if (!extensao.equals("ed")){
            System.out.println("EXTENSÃO INVÁLIDA");
            return;
        }
        String vetLinha[] =  new String[2000];
        int contLinha=0;
        
        try { 
            File file = new File(StringArquivo); 
            Scanner entrada = new Scanner(file);
            
            while(entrada.hasNextLine()){ 
                vetLinha[contLinha]= entrada.nextLine();
                contLinha++;
            }
            entrada.close();
            
        } catch (Exception erro){
            System.out.println("Não foi possível abrir o arquivo");
        }
        ExecutaADor edimilson = new ExecutaADor(vetLinha, contLinha);
        edimilson.Processar();
    }
}