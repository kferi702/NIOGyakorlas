package demo;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
	static RandomAccessFile f;
	static ArrayList<Adat> adatok = new ArrayList<>();

	static int N;

	static void beolvNIO() {
		Path file = Paths.get("demo/data/betu.txt");
		try {
			InputStream in = Files.newInputStream(file);
		
		    BufferedReader reader =
		      new BufferedReader(new InputStreamReader(in));
		    String line = reader.readLine();
		    while (line != null) {
		    	adatok.add(new Adat(line));
		        line=reader.readLine();
		    }
		    N=adatok.size();
		} catch (IOException x) {
		    System.err.println("Hiba a bolvasásnál");
		}
		System.out.println("Fájl beolvasása sikeresen megtörtént");
	}
	static void beolv(String f_neve) {
		
try {
	f= new RandomAccessFile(f_neve, "r");
	String sor= f.readLine();
    while (sor!=null) {
    	adatok.add(new Adat(sor));
    	sor=f.readLine();
    }
    f.close();
    N=adatok.size();
} catch (IOException e) {
	System.out.println("Hiba a beolvasásnál");
}
System.out.println("fájl beolvasása sikeresen megtörtént");
}
	static void kiir() {
		for (int i = 0; i < N; i++) {
			System.out.print(adatok.get(i).getEgy()+" ");		
			System.out.print(adatok.get(i).getKetto()+" ");
			System.out.print(adatok.get(i).getHarom()+"\n");
		}
	}
	public static void main(String[] args) {
		//beolv("demo/data/betu.txt");
		beolvNIO();
		kiir();

	}
}
