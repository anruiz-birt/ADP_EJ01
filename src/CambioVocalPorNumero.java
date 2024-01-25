import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CambioVocalPorNumero {

	public static void main(String[] args) {
		File inputFile = new File("ficheros" + File.separator + "ejemplo");
		File outputFile = new File("ficheros" + File.separator + "ejemplo_output.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
          	String linea;  
          	System.out.println("Este es el fichero con las vocales cambiadas por números:");
		    while ((linea = br.readLine()) != null) {		    	
		    	linea = linea.replace('a', '1');
		    	linea = linea.replace('e', '2');
		    	linea = linea.replace('i', '3');
		    	linea = linea.replace('o', '4');
		    	linea = linea.replace('u', '5');
		    	bw.write(linea);
		    	bw.newLine();
		    	System.out.println(linea);
		    }
		    bw.close();
		    br.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
