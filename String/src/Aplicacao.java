
public class Aplicacao {

	public static void main(String[] args) {
		
	   /*criando referencia do objeto no heap
	    *vc criou objeto string no heap e atribuiu a referencia deste objeto à variável s1
	    *String no java não é tipo de dados primitivo
	    *portanto para lidar com String tem que se ter bastante cuidado  
	    * */
		
		
		/* opcao 1 */
       String s1 = new String("abc");
         
       
       /* opcao 2 
        * Neste caso s2 e s3 apontam pra mesma string criada na memória
        * diferente do que ocorre com s1
        * 
        * 
        * */
       String s2 = "abc";
       String s3 = "abc";
       
       /*Ocorre false pois temos 2 objetos diferentes na memoria
        * 
        * */
       System.out.println(s1==s2); 
       
       
       /*
        * Aqui ocorre true pois os dois objetos são criados no pool de string
        * ou seja, s2 e s3 foram construidas da mesma forma
        * sem a utilização da chave new
        * 
        * o java trabalha do pool de string para ecomizar memoria,
        * hipotese: 10.000 string "abc" são sempre referencia no pool  
        * */
       System.out.println(s2==s3);
       
       
       /*
        * Neste caso para compara string é mais seguro utilizar o método equals
        * que compara o conteúdo do objeto 
        *  
        * */
       System.out.println(s1.equals(s2));
       
       s2="abcd";
       
       
       System.out.println(s2);
       System.out.println(s3);
       
       /*Transformando para maiúsculo*/
       s2 = s2.toUpperCase();
       System.out.println(s2);
       
       
       /*Concatenando string*/
       s2 = s2.concat(s3);
       System.out.println(s2);
       
       s2 = s2 + s3;
       System.out.println(s2);
       
       
       
       
       
       
	}

}
