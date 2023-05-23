	import java.util.Scanner;
public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				// TODO Auto-generated method stub
		SmartPhone smartPhone=new SmartPhone("iphone","XS",700,10.5,8);
				
				
				System.out.println("----------SmartPhone1---------------|");
				System.out.println(smartPhone.getmarca());
				System.out.println(smartPhone.getmodello());
				System.out.println(smartPhone.getprezzodilancio());
				System.out.println(smartPhone.getnumpolici());
				System.out.println(smartPhone.getram());
				System.out.println("|-----------------------------------|");
				smartPhone.ottieniFasciaDiPrezzo();
				System.out.println("|-----------------------------------|");
			    smartPhone.ottieniTipologiaSmartphone();
			    System.out.println("|----------Smartphone2--------------|");
				SmartPhone Smartphone2=new SmartPhone();
				System.out.println(Smartphone2.toString());
				System.out.println("|-----------------------------------|");
				
				Scanner scanner1=new Scanner(System.in);
				System.out.println("inserici la marca");
				String Domanda1=scanner1.nextLine();
				
				System.out.println("inserire modello");
				String Domanda2=scanner1.nextLine();
				
				System.out.println("inserire prezzo di lancio");
				int Domanda3=scanner1.nextInt();
				
				System.out.println("inserire numpolici");
				double Domanda4=scanner1.nextDouble();
				
				System.out.println("inserire ram");
				int Domanda5=scanner1.nextInt();
				
				 System.out.println("|----------Smartphone3--------------|");
					System.out.println(Domanda1);
					System.out.println(Domanda2);
					System.out.println(Domanda3);
					System.out.println(Domanda4);
					System.out.println(Domanda5);
					System.out.println("|-----------------------------------|");
				
			}
			
	}

