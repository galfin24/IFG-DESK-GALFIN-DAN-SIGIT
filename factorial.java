import java.util.Scanner;
class factorial{
	public static void main(String[] args){
	long limit;
	long faktorial=1;
	
		Scanner scn = new Scanner(System.in);
		System.out.print("Masukan Bilangan Faktorial : ");
		limit=scn.nextInt();
				for (int i=1; i <= limit; i++){
				faktorial=1;
					for (int faktor=2; faktor <=i; faktor++)
					faktorial *= faktor;
		System.out.println (i + "	"+ faktorial);
		}
	}
}