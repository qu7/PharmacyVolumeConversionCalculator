import java.util.Scanner;

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

	public static void calculations(double valueD, int units) {
		//"CCs", "MLs", "Teaspoons", "Tablespoons", "Ounces", "Pints", "Liters", "Gallons"
		int uom = units;
		double value = valueD;
		double toMLs = 0;
		
		if (uom == 0) {
			toMLs = value;
		}
		
		else if (uom == 1) {
			toMLs = value;
		}
		
		else if (uom == 2) {
			toMLs = value/5;
		}
		
		else if (uom == 3) {
			toMLs = value/15;
		}
		
		else if (uom == 4) {
			toMLs = value/30;
		}
		
		else if (uom == 5) {
			toMLs = value/480;
		}
		
		else if (uom == 5) {
			toMLs = value/1000;
		}
		
		else {
			toMLs = value/3785;
		}
		
		ccs = toMLs;
		mls = toMLs;
		tspn = toMLs / 5;
		tblspn = toMLs / 15;
		oz = toMLs / 30;
		pints = toMLs / 480;
		ltrs = toMLs / 1000;
		gals= toMLs / 3785;
		strCCs = String.valueOf(ccs);
		strMLs = String.valueOf(mls);
		strTspn = String.valueOf(tspn);
		strTblspn = String.valueOf(tblspn);
		strOz = String.valueOf(oz);
		strPints = String.valueOf(pints);
		strLtrs = String.valueOf(ltrs);
		strGals = String.valueOf(gals);
	}

}
