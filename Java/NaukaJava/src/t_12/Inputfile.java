package t_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Inputfile {

	private BufferedReader in;
	public Inputfile(String filename) throws Exception{
		try {
			in = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println("Nie mo¿na otworzyc pliku: " + filename);
			System.out.println(e);
			throw e;
		} catch (Exception e) {
			try {
				in.close();
			} catch (IOException e2) {
				System.out.println("Wywolanie in.close nieskuteczne");
			}
			throw e;
		}finally{
			
		}
	}
	
	public String getLine(){
		String s;
		try {
			s = in.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Wywolanie readLine() nieskuteczne");
		}
		return s;
	}
	
	public void readFile(){
		String s;
		while( (s = getLine()) != null){
			System.out.println(s);
		}
	}
	
	public void dispose(){
		try {			
			in.close();
			System.out.println("Wywolanie dispose() skuteczne");
		} catch (IOException e) {
			throw new RuntimeException("Wywolanie in.close nieskuteczne");
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		try {
            File file = new File("e:/plik_testowy_as.txt");
            if(file.createNewFile())
                System.out.println("File creation successfull");
            else
                System.out.println("Error while creating File, file already exists in specified path");
        }
        catch(IOException io) {
            io.printStackTrace();
        }
		Inputfile ob = new Inputfile("e:/plik_testowy_as.txt");
		ob.readFile();
		ob.dispose();
    }	
}
411
// zaraz po utworzeniu obiektu wymagajacego porzadkowania zacznij blok "try finally"

