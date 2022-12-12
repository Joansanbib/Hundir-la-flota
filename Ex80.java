import java.util.Arrays;
import java.util.Scanner;
public class Ex80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner (System.in);
		String []tauler=new String [40];
		char []tauler_resultat=new char [40];
		int cont=0, random=0, valor1=0, cont1=0, tirades=0;
		
		for (cont=0; 40>cont; cont++) {
			tauler[cont]="*";
		}
		for (cont=0; 40>cont; cont++) {
			tauler_resultat[cont]='*';
		}
		
		cont=0;
		while (cont!=5) {
			//vaixell de 2;
			random=(int)(Math.random()*38+0);
			tauler[random]="V1";
			tauler[random+1]="V2";
			cont=1;
			//vaixell de 2
			random=(int)(Math.random()*38+0);
			while (tauler[random]!="*" || tauler[random+1]!="*"|| (tauler[random-1]!="*"&& tauler[random+2]!="*" && (random-1!=-1 || random+2!=40))) {
				random=(int)(Math.random()*38+0);
			}
			tauler[random]="V3";
			tauler[random+1]="V4";
			cont=2;
			//vaixell de 3
			random=(int)(Math.random()*37+0);
			while (tauler[random]!="*" || tauler[random+1]!="*"|| tauler[random+2]!="*" || (tauler[random-1]!="*"&& tauler[random+3]!="*" && (random-1!=-1 || random+3!=40))) {
				random=(int)(Math.random()*37+0);
			}
			tauler[random]="V5";
			tauler[random+1]="V6";
			tauler[random+2]="V7";
			cont=3;
			//vaixell de 3
			random=(int)(Math.random()*37+0);
			while (tauler[random]!="*" || tauler[random+1]!="*"|| tauler[random+2]!="*" || (tauler[random-1]!="*"&& tauler[random+3]!="*" && (random-1!=-1 || random+3!=40))) {
				random=(int)(Math.random()*37+0);
			}
			tauler[random]="V8";
			tauler[random+1]="V9";
			tauler[random+2]="V10";
			cont=4;
			//vaixell de 4
			random=(int)(Math.random()*36+0);
			while (tauler[random]!="*" || tauler[random+1]!="*"|| tauler[random+2]!="*" || tauler[random+3]!="*"|| (tauler[random-1]!="*"&& tauler[random+4]!="*" && (random-1!=-1 || random+4!=40))) {
				random=(int)(Math.random()*36+0);
			}
			tauler[random]="V11";
			tauler[random+1]="V12";
			tauler[random+2]="V13";
			tauler[random+3]="V14";
			cont=5;
		}
		System.out.println("Introdueix un valor per atacar (0-39)");
		
		
		while (valor1!=40 && valor1>=0) {
			valor1=e.nextInt();

			while (tauler_resultat[valor1]=='T'||tauler_resultat[valor1]=='A'||tauler_resultat[valor1]=='X') {
				valor1=e.nextInt();
				
			}
			if (tauler[valor1]=="V1" || tauler[valor1]=="V2"|| tauler[valor1]=="V3"|| tauler[valor1]=="V4"|| tauler[valor1]=="V5"|| tauler[valor1]=="V6"|| tauler[valor1]=="V7"|| tauler[valor1]=="V8"|| tauler[valor1]=="V9"|| tauler[valor1]=="V10"|| tauler[valor1]=="V11"|| tauler[valor1]=="V12"|| tauler[valor1]=="V13"|| tauler[valor1]=="V14") {
				System.out.println("¡¡Tocat!!");
				tauler_resultat[valor1]='T';
			}
			
			if (tauler[valor1]=="V1"||tauler[valor1]=="V2"||tauler[valor1]=="V3"||tauler[valor1]=="V4") {
				System.out.println("Has tocat un vaixell de 2!!");
				
			}
			else if (tauler[valor1]=="V5"||tauler[valor1]=="V6"||tauler[valor1]=="V7"||tauler[valor1]=="V8"||tauler[valor1]=="V9"||tauler[valor1]=="V10") {
				System.out.println("Has tocat un vaixell de 3!!");
			}
			else if (tauler[valor1]=="V11"||tauler[valor1]=="V12"||tauler[valor1]=="V13"||tauler[valor1]=="V14") {
				System.out.println("Has tocat un vaixell de 4!!");
			}
			else {
			if (tauler[valor1]!="V1" || tauler[valor1]!="V2"|| tauler[valor1]!="V3"|| tauler[valor1]!="V4"|| tauler[valor1]!="V5"|| tauler[valor1]!="V6"|| tauler[valor1]!="V7"|| tauler[valor1]!="V8"|| tauler[valor1]!="V9"|| tauler[valor1]!="V10"|| tauler[valor1]!="V11"|| tauler[valor1]!="V12"|| tauler[valor1]!="V13"|| tauler[valor1]!="V14") {
				System.out.println("¡¡Aigua!!");
				tauler_resultat[valor1]='A';
			}
			}
			for (cont=0; 39>cont; cont++) {
				if (tauler_resultat[cont]=='T' && tauler_resultat[cont+1]=='T' && (tauler[cont]=="V1"||tauler[cont]=="V2"||tauler[cont]=="V3"||tauler[cont]=="V4")) {
					System.out.println("¡¡Enfonsat!!");
					tauler_resultat[cont]='X';
					cont1=cont1+1;
					tauler_resultat[cont+1]='X';
					cont1=cont1+1;
				}
				if (tauler_resultat[cont]=='T' && tauler_resultat[cont+1]=='T' && tauler_resultat[cont+2]=='T' && (tauler[cont]=="V5"||tauler[cont]=="V6"||tauler[cont]=="V7"||tauler[cont]=="V8"||tauler[cont]=="V9"||tauler[cont]=="V10")) {
					System.out.println("¡¡Enfonsat!!");
					tauler_resultat[cont]='X';
					cont1=cont1+1;
					tauler_resultat[cont+1]='X';
					cont1=cont1+1;
					tauler_resultat[cont+2]='X';
					cont1=cont1+1;
				}
				if (tauler_resultat[cont]=='T' && tauler_resultat[cont+1]=='T' && tauler_resultat[cont+2]=='T' && tauler_resultat[cont+3]=='T'&& (tauler[cont]=="V11"||tauler[cont]=="V12"||tauler[cont]=="V13"||tauler[cont]=="V14")) {
					System.out.println("¡¡Enfonsat!!");
					tauler_resultat[cont]='X';
					cont1=cont1+1;
					tauler_resultat[cont+1]='X';
					cont1=cont1+1;
					tauler_resultat[cont+2]='X';
					cont1=cont1+1;
					tauler_resultat[cont+3]='X';
					cont1=cont1+1;
				}
				
			}
			tirades++;
			if (cont1==14) {
				System.out.println("Has completat el joc. Has fet un total de "+tirades+" tirades");
				System.out.println(Arrays.toString(tauler_resultat));
				break;
			}
			System.out.println(Arrays.toString(tauler_resultat));
			
			
		
			
			
			
				
		}
		if (valor1==40 || valor1<0) {
			System.out.println("Error");
		}
	
	}
}
