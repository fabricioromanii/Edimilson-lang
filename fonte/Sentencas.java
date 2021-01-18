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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Sentencas {

    static public boolean Enumero(String valor){
        String numero = valor;
        boolean eNum = true;
        eNum = numero.matches("-?\\d+(\\.\\d+)?");
        if (eNum){
            return true;
        }else{
            return false;
        }
    } 

    static private boolean Eoperacao(String valor){
        if (valor.equals("+")){
            return true;
        }else if(valor.equals("-")){
            return true;
        }else if(valor.equals("/")){
            return true;
        }else if(valor.equals("*")){
            return true;
        }else if(valor.equals("%")){
            return true;
        }else return false;
    }

    static public double ProcessaExpressao (String expressao, Map<String, Double> variaveis) {

        String elementos[] = expressao.split(" ");
        ArrayList<String> listaElementos = new ArrayList( Arrays.asList( elementos ) );

        if(listaElementos.size() == 1)
            return Double.parseDouble(listaElementos.get(0));

        for(int i=0;i<listaElementos.size(); i++){
            String elemento = listaElementos.get(i);
            if (!Enumero(elemento) && !Eoperacao(elemento)){
                if (variaveis.containsKey(elemento)){
                    Double valor = variaveis.get(elemento);
                    String valorString = Double.toString(valor);
                    listaElementos.set(i,valorString);
                }else{
                    System.out.println("A variável não existe!");
                    return 0;
                }
            }
        }

        for(int n=0; n<listaElementos.size(); n++){
            String elemento = listaElementos.get(n);
            if (elemento.equals("*") || elemento.equals("/")){
                double result;
                double valor1 = Double.parseDouble(listaElementos.get(n-1));
                double valor2 = Double.parseDouble(listaElementos.get(n+1));
                if (elemento.equals("/")){
                    result= valor1/valor2;
                }else{
                    result=valor1*valor2;
                }
                
                listaElementos.remove(n-1);
                listaElementos.remove(n-1);
                String valorRe = Double.toString(result);
                
                listaElementos.set(n-1,valorRe);
                n=0;
            }
        }

        for(int n=0; n<listaElementos.size(); n++){
            String elemento = listaElementos.get(n);
            if (elemento.equals("+") || elemento.equals("-")){
                double result;
                double valor1 = Double.parseDouble(listaElementos.get(n-1));
                double valor2 = Double.parseDouble(listaElementos.get(n+1));
                if (elemento.equals("+")){
                    result= valor1+valor2;
                }else{
                    result=valor1-valor2;
                }
                listaElementos.remove(n-1);
                listaElementos.remove(n-1);
                String valorRe = Double.toString(result);
                listaElementos.set(n-1,valorRe);
                n=0;
            }
        }

        for (int t = 0; t < listaElementos.size(); t++) { 
            String elemento = listaElementos.get(t); 
            if (elemento.equals("%")) { 
                double result = 0; double valor1 = Double.parseDouble(listaElementos.get(t - 1)); 
                double valor2 = Double.parseDouble(listaElementos.get(t + 1)); 
                if (elemento.equals("%")) {
                    result = valor1 % valor2; 
                } 
                listaElementos.remove(t - 1);
                listaElementos.remove(t - 1); 
                String Resp = Double.toString(result);
                listaElementos.set(t - 1, Resp);
                t = 0;
                
            } 
        }
        
    
        if (listaElementos.size() != 1){
            System.out.println("Ocorreu um erro inesperado :/");
            return 0;
        }
        
        else {
            double primElemento = Double.parseDouble(listaElementos.get(0));
            return primElemento;
        }

    }
}
