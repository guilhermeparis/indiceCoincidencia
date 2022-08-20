import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class indiceCoincidencia {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Type file name: ");
		
		File fi = new File("C:\\Users\\Guilherme\\eclipse-workspace\\IndiceCoincidencia\\src\\texts\\" + sc.next());
		
		FileReader fr = new FileReader(fi);
		
		BufferedReader br = new BufferedReader(fr);
		
		int controle = 0;
		int total;
		
		int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0, l=0, m=0, n=0, o=0, p=0, q=0, r=0, s=0, t=0, u=0, v=0, w=0, x=0, y=0, z=0;
		
		while((controle = br.read()) != -1) {
			char character = (char) controle;
			switch (character) {
			case 'a':
				a++;
				break;
			case 'b':
				b++;
				break;
			case 'c':
				c++;
				break;
			case 'd':
				d++;
				break;			
			case 'e':
				e++;
				break;
			case 'f':
				f++;
				break;
			case 'g':
				g++;
				break;
			case 'h':
				h++;
				break;
			case 'i':
				i++;
				break;
			case 'j':
				j++;
				break;
			case 'k':
				k++;
				break;
			case 'l':
				l++;
				break;
			case 'm':
				m++;
				break;
			case 'n':
				n++;
				break;
			case 'o':
				o++;
				break;
			case 'p':
				p++;
				break;
			case 'q':
				q++;
				break;
			case 'r':
				r++;
				break;
			case 's':
				s++;
				break;
			case 't':
				t++;
				break;
			case 'u':
				u++;
				break;
			case 'v':
				v++;
				break;
			case 'w':
				w++;
				break;
			case 'x':
				x++;
				break;
			case 'y':
				y++;
				break;
			case 'z':
				z++;
			}
		}
		System.out.println("Total de A no texto: " + a);
	}
}