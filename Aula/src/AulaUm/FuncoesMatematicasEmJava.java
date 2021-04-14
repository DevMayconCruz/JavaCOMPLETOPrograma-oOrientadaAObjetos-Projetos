package AulaUm;

public class FuncoesMatematicasEmJava {
	
	public static void main(String[] args) {
		
	 double x = 3.0;
	 double y = 4.0;
	 double z = -5.0;
	 double A,B,C;
	 
	 A = Math.sqrt(x);
	 B = Math.sqrt(y);
	 C = Math.sqrt(25.0);
	 
	 System.out.println("A raiz quadrada de "+x+" = "+A);
	 System.out.println("A raiz quadrada de "+y+" = "+B);
	 System.out.println("A raiz quadrada de 25 = "+C);
	 
	 
	 A = Math.pow(x, y);
	 B = Math.pow(x, 2.0);
	 C = Math.pow(5.0, 2.0);
	 
	 System.out.println(x+" elevado a "+y+" é = "+A);
	 System.out.printf(x+" elevado ao quadrado é  = %.0f%n",B);
	 System.out.println("5.0 elavado ao quadrado é = "+C);
	 
	 A = Math.abs(y);
	 B = Math.abs(z);
	 System.out.println("O valor absoluto de "+y+" = "+A);
	 System.out.println("O valor absoluto de "+z+" = "+B);
	 
	 double a=25;
	 double b=50;
	 double c=10;
	 double delta;
	 double x1=0;
	 double x2=0;
	 delta = Math.pow(b,2.0) - 4 *a*c; 
	 x1 = (-b + Math.sqrt(delta)) / (2.0*a);
	 x2 = (-b - Math.sqrt(delta)) / (2.0*a);
	 
	 System.out.println("x1 = "+x1);
	 System.out.println("x2 = "+x2);
	
	}
	
	
	

}
