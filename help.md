## Guia para devs

## ARQUIVOS JAR (pág.95 da apostila de JAVA)

Para criar um arquivo JAR, proceda da seguinte forma:

1. Crie um arquivo chamado manifest.txt com o seguinte conteúdo:
Main-Class: MyApp

2. Pressione ENTER depois de digitar a linha acima, ou seu arquivo pode não funcionar
corretamente. Salve-o na pasta onde estão as classes do seu aplicativo.

3. Execute a ferramenta jar para criar um arquivo JAR que contenha suas classes, mais o
arquivo manifext.txt:
$ jar -cmvf manifest.txt MyApp.jar *.class
PROGRAMAÇÃO I 96

Se as classes de seu aplicativo estão organizadas em pacotes, inclua também os nomes
dos mesmos:
$ jar -cmvf manifest.txt MyApp.jar *.class pack1 pack2

4. Para executar um arquivo JAR:
$ java -jar MyApp.jar