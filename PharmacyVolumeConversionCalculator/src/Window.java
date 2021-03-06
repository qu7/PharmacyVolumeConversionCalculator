import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Window extends JFrame {
	private JTextField txtStartValue;
	public Window() {
		String unitOfMeasurement[] = {"CCs", "MLs", "Teaspoons", "Tablespoons", "Ounces", "Pints", "Liters", "Gallons"};
		
		getContentPane().setLayout(null);
		
		txtStartValue = new JTextField();
		txtStartValue.setBounds(10, 67, 86, 20);
		getContentPane().add(txtStartValue);
		txtStartValue.setColumns(10);

		final JComboBox cmboUnitsOfMeasurement = new JComboBox(unitOfMeasurement);
		cmboUnitsOfMeasurement.setBounds(106, 67, 139, 20);
		getContentPane().add(cmboUnitsOfMeasurement);
		
		JLabel lblIsEqualTo = new JLabel("is equal to: ");
		lblIsEqualTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIsEqualTo.setBounds(43, 97, 76, 14);
		getContentPane().add(lblIsEqualTo);
		
		final JLabel lblCCs = new JLabel("ccs");
		lblCCs.setBounds(10, 122, 109, 14);
		getContentPane().add(lblCCs);
		
		final JLabel lblMLs = new JLabel("mls");
		lblMLs.setBounds(129, 122, 109, 14);
		getContentPane().add(lblMLs);
		
		final JLabel lblTblspn = new JLabel("tblspns");
		lblTblspn.setBounds(129, 147, 109, 14);
		getContentPane().add(lblTblspn);
		
		final JLabel lblTspn = new JLabel("tspns");
		lblTspn.setBounds(10, 147, 109, 14);
		getContentPane().add(lblTspn);
		
		final JLabel lblGal = new JLabel("gals");
		lblGal.setBounds(129, 197, 109, 14);
		getContentPane().add(lblGal);
		
		final JLabel lblPt = new JLabel("pts");
		lblPt.setBounds(129, 172, 109, 14);
		getContentPane().add(lblPt);
		
		final JLabel lblOz = new JLabel("ozs");
		lblOz.setBounds(10, 172, 109, 14);
		getContentPane().add(lblOz);
		
		JLabel lblTitle = new JLabel("Pharmacy Volume Conversion Calculator");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitle.setBounds(10, 11, 302, 20);
		getContentPane().add(lblTitle);
		
		final JLabel lblLtrs = new JLabel("ltrs");
		lblLtrs.setBounds(10, 197, 109, 14);
		getContentPane().add(lblLtrs);
		
		final JLabel lblEnterValue = new JLabel("Enter the amount to convert:");
		lblEnterValue.setBounds(10, 42, 235, 14);
		getContentPane().add(lblEnterValue);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final String value = txtStartValue.getText();
				try{
					final double valueD = Float.parseFloat(value);
					final double units = cmboUnitsOfMeasurement.getSelectedIndex();
					Calculator.calculations(valueD, units);
					lblCCs.setText(Calculator.strCCs + " CCs");
					lblMLs.setText(Calculator.strMLs + " MLs");
					lblTspn.setText(Calculator.strTspn + " TSPNs");
					lblTblspn.setText(Calculator.strTblspn + " TBLSPNs");
					lblOz.setText(Calculator.strOz + " Oz");
					lblPt.setText(Calculator.strPints + " Pints");
					lblLtrs.setText(Calculator.strLtrs + " Liters");
					lblGal.setText(Calculator.strGals + " Gallons");
					lblEnterValue.setText("Enter the amount to convert:");
					lblEnterValue.setForeground(Color.black);

				}catch (NumberFormatException ex) {
					lblEnterValue.setText("Error! Enter a valid amount!");
					lblEnterValue.setForeground(Color.red);
				}
			}
		});
		btnConvert.setForeground(new Color(47, 79, 79));
		btnConvert.setBounds(255, 66, 71, 23);
		getContentPane().add(btnConvert);
	}
	
	public static void main(String args[]) {
		Window window = new Window();
		window.setTitle("Pharmacy Volume Conversion Calculator");
		window.setSize(new Dimension(450, 300));
		window.setVisible(true);
	}
}
