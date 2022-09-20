import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class O3 {
	public static void main(String[]args) {
	
	String nTxt= showInputDialog("Oppgi positivtall");
	int n = parseInt(nTxt);
	
int i, fact=1;
String feil = "Ugyldig tall";

//om n er negativt: 
if (n<=0) {
showMessageDialog(null, feil); 
}
else {

for (i=1; i<n; i++) {
fact = fact*i;
}
String yes = "Fakultet av ";
String no = " er ";
showMessageDialog(null, yes + n + no + fact);
} 
} 
} 
