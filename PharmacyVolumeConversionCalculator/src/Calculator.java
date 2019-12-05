import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
	static float ccs;
	static float mls;
	static float tspn;
	static float tblspn;
	static float oz;
	static float pints;
	static float ltrs;
	static float gals;
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
		DecimalFormat df = new DecimalFormat("####0.00000");
		int uom = units;
		float value = (float)valueD;
		float toMLs = 0;
		
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
		
		else if (uom == 6) {
			toMLs = value/1000;
		}
		
		else if (uom == 7) {
			toMLs = value/3785;
		}
		
		else {
			
		}
		
		System.out.println(df.format(toMLs));
		ccs = toMLs;
		mls = toMLs;
		tspn = toMLs / 5;
		tblspn = toMLs / 15;
		oz = toMLs / 30;
		pints = toMLs / 480;
		ltrs = toMLs / 1000;
		gals= toMLs / 3785;
		strCCs = df.format(ccs);
		strMLs = df.format(mls);
		strTspn = df.format(tspn);
		strTblspn = df.format(tblspn);
		strOz = df.format(oz);
		strPints = df.format(pints);
		strLtrs = df.format(ltrs);
		strGals = df.format(gals);
	}

}
