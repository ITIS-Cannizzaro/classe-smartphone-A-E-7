
public class SmartPhone {
	// TODO Auto-generated method stub
	
			private String marca;
			private String modello;
			private int prezzodilancio;
			private double numpolici;
			private int ram;
			
			public SmartPhone(String marca,String modello,int prezzodilancio,double numpolici,int ram) {
				this.marca=marca;
				this.modello=modello;
				this.prezzodilancio=prezzodilancio;
				this.numpolici=numpolici;
				this.ram=ram;
				
			}
			public String getmarca() {
				return marca;
			}
			public String getmodello() {
				return modello;
			}
			public int getprezzodilancio() {
				return prezzodilancio;
			}
			public double getnumpolici() {
				return numpolici;
			}
			public int getram() {
				return ram;
			}
			
			 public SmartPhone() {
				 marca="Samsung";
				 modello="Galaxy S23 Ultra";
				 prezzodilancio=560;
				 numpolici=9.5;
				 ram=4;
				 
				 
				 
			 }
			 public String toString() {
					return marca +  " "+ " "+ modello + " " + " " + prezzodilancio + " " + " " + numpolici+ " " + " " +ram;
				}
			 public void ottieniFasciaDiPrezzo() {
				 if(prezzodilancio>500) {
					 System.out.println("Fascia alta");
					 
				 }
				 else if(prezzodilancio>=200&&prezzodilancio<=500) {
					 System.out.println("Fascia media");
					 
				 }
				 else if(prezzodilancio<200) {
					 System.out.println("Fascia bassa");
				 }
			 }
			 public void ottieniTipologiaSmartphone() {
				 if(numpolici<5) {
					 System.out.println("mini");
				 }
				 else if(numpolici>=5&&numpolici<=7) {
					 System.out.println("normal");
					 
				 }
				 else if(numpolici>7) {
					 System.out.println("max");
				 }
			 }
			 
			 
			 
}
