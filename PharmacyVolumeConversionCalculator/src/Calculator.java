import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.*;

public class Calculator {
	static double ccs;
	static double mls;
	static double tspn;
	static double tblspn;
	static double oz;
	static double pints;
	static double ltrs;
	static double gals;
	static String strCCs;
	static String strMLs;
	static String strTspn;
	static String strTblspn;
	static String strOz;
	static String strPints;
	static String strLtrs;
	static String strGals;

	public static void calculations(double valueD, double units) {
		//"CCs", "MLs", "Teaspoons", "Tablespoons", "Ounces", "Pints", "Liters", "Gallons"
		double uom = units;
		double value = valueD;
		double toMLs = 0;

		DecimalFormat df = new DecimalFormat("#.###");

		
		if (uom == 0) {
			toMLs = value;
		}
		
		else if (uom == 1) {
			toMLs = value;
		}
		
		else if (uom == 2) {
			toMLs = value*5;
		}
		
		else if (uom == 3) {
			toMLs = value*15;
		}
		
		else if (uom == 4) {
			toMLs = value*30;
		}
		
		else if (uom == 5) {
			toMLs = value*480;
		}
		
		else if (uom == 6) {
			toMLs = value*1000;
		}
		
		else if (uom == 7) {
			toMLs = value*3785;
		}
		
		else {
			
		}
		
		System.out.println(df.format(toMLs));
		ccs = (float) toMLs;
		mls = toMLs;
		tspn = toMLs / 5;
		tblspn = toMLs / 15;
		oz = toMLs / 30;
		pints = toMLs / 480;
		ltrs = toMLs / 1000;
		gals= toMLs / 3785;
		strCCs = String.valueOf(df.format(ccs));
		strMLs = String.valueOf(df.format(mls));
		strTspn = String.valueOf(df.format(tspn));
		strTblspn = String.valueOf(df.format(tblspn));
		strOz = String.valueOf(df.format(oz));
		strPints = String.valueOf(df.format(pints));
		strLtrs = String.valueOf(df.format(ltrs));
		strGals = String.valueOf(df.format(gals));

	}

}
