
public class Aplicacao {
 public static void main(String[] args) {
	Retangulo r1 = new Retangulo();
	double area1 = r1.calculaArea();
	System.out.println(area1);
	
	Retangulo r2 = new Retangulo(5,3);
	double area2 = r2.calculaArea();
	System.out.println(area2);
	
	Retangulo r3 = new Retangulo('A');
	double area3 = r3.calculaArea();
	System.out.println(area3);
	
	
	Quadrado q = new Quadrado(6);	
	System.out.println(q.calcularArea());
	
}
}
