import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class indiceCoincidencia {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite o nome do arquivo: ");
		
		File fi = new File("C:\\Users\\Guilherme\\eclipse-workspace\\IndiceCoincidencia\\src\\texts\\" + sc.next());
		
		FileReader fr = new FileReader(fi);
		
		BufferedReader br = new BufferedReader(fr);
		
		int controle = 0;
		
		double indice, total, soma, divisor;
		
		double a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0, l=0, m=0, n=0, o=0, p=0, q=0, r=0, s=0, t=0, u=0, v=0, w=0, x=0, y=0, z=0;
		
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
		//Calcula o total de caracteres no texto
		total = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z;
		
		System.out.printf("Caracteres no texto: %, .0f\n", total);
		
		//Calcula o divisor do somatório
		divisor = total * (total-1);
			
		//Calcula Fi * (Fi-1) para cada caractere
		System.out.printf("A: %,.0f\n", a);
		a = a*(a-1);
		System.out.printf("B: %,.0f\n", b);
		b = b*(b-1);
		System.out.printf("C: %,.0f\n", c);
		c = c*(c-1);
		System.out.printf("D: %,.0f\n", d);
		d = d*(d-1);
		System.out.printf("E: %,.0f\n", e);
		e = e*(e-1);
		System.out.printf("F: %,.0f\n", f);
		f = f*(f-1);
		System.out.printf("G: %,.0f\n", g);
		g = g*(g-1);
		System.out.printf("H: %,.0f\n", h);
		h = h*(h-1);
		System.out.printf("I: %,.0f\n", i);
		i = i*(i-1);
		System.out.printf("J: %,.0f\n", j);
		j = j*(j-1);
		System.out.printf("K: %,.0f\n", k);
		k = k*(k-1);
		System.out.printf("L: %,.0f\n", l);
		l = l*(l-1);
		System.out.printf("M: %,.0f\n", m);
		m = m*(m-1);
		System.out.printf("N: %,.0f\n", n);
		n = n*(n-1);
		System.out.printf("O: %,.0f\n", o);
		o = o*(o-1);
		System.out.printf("P: %,.0f\n", p);
		p = p*(p-1);
		System.out.printf("Q: %,.0f\n", q);
		q = q*(q-1);
		System.out.printf("R: %,.0f\n", r);
		r = r*(r-1);
		System.out.printf("S: %,.0f\n", s);
		s = s*(s-1);
		System.out.printf("T: %,.0f\n", t);
		t = t*(t-1);
		System.out.printf("U: %,.0f\n", u);
		u = u*(u-1);
		System.out.printf("V: %,.0f\n", v);
		v = v*(v-1);
		System.out.printf("W: %,.0f\n", w);
		w = w*(w-1);
		System.out.printf("X: %,.0f\n", x);
		x = x*(x-1);
		System.out.printf("Y: %,.0f\n", y);
		y = y*(y-1);
		System.out.printf("Z: %,.0f\n", z);
		z = z*(z-1);
				
		//Realiza a soma de Fi*(Fi-1) para cada caractere
		soma = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z;
		
		//Calcula o Índice de Coincidência
		indice = soma / divisor;
		
		System.out.printf("Índice de Coincidência: %, .3f \n", indice);	
		
		//Normaliza o índice (Índice * Tamanho do alfabeto)
		indice = indice * 26;
		
		System.out.printf("Indice Normalizado: %, .3f\n", indice);
	}
}