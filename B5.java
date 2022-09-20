import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;                                        

public class B5 {
	public static void main(String[] args)  {
		
		
	
	for (int elev = 1; elev <= 10; elev++) {
	
	String poengtxt = showInputDialog("oppgi karakter: ");
	int poeng = parseInt(poengtxt);
	String karakter = " ";


	
				if (100 >= poeng && 89 < poeng); {
					karakter = "karakter A"; 
				 
				}
				    if  (89 >= poeng && 79  < poeng) {
					karakter = "karakter B";
				
				}
				   else if (79 >= poeng && 59 < poeng) {
					karakter = "karakter C";
				   } 
					else if (59 >= poeng && 49 < poeng ) {
					karakter = "karakter D";
					}	
					else if (49 >= poeng && 39 < poeng) {
					karakter = "karakter E";
					}
					else if (39 >= poeng && 0 < poeng) {
					karakter = "karakter F";
						}
					else { 
						karakter = "Ugyldig poengsum"; 
					}
				    poengtxt = showInputDialog("Feil, prøv igjen.");
				    poeng = parseInt(poengtxt);
				
				showMessageDialog(null,karakter);
				
			}
      }


	}
