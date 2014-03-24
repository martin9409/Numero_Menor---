import java.util.Scanner;
public class AgendaDeNumeros {

	static int mayor(int numero1, int numero2){
		// static int es la funcion 
    	  if (numero1<numero2){
    		  System.out.print("El numero menor es: ");
    		return numero1;
    		// aqui el creamos un if para que si el numero 1 es menor que el 2 mi retorne el numero menor 
    	  } else if (numero2<numero1) {
    		  System.out.print("El numero menor es: ");
    		  return numero2;
    		  // lo mismo es aqui retornamos o imprimimos el numero menor
    	  }else{
    		  System.out.print("Los numeros son Iguales");
    		  return 0;
    		  // retorna los numeros iguales
    	  }
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lol=new Scanner(System.in);
		System.out.print("------------------------------------------");
		System.out.print("\n ------------Numero Mayor----------------");
		System.out.print("\n");
		System.out.print("Ingrese Primer Numero                :");
		int numero1=lol.nextInt();
		System.out.print("\nIngrese Segundo Numero             :");
		int numero2=lol.nextInt();
		System.out.print(mayor(numero1,numero2));
		}
	
	

}
