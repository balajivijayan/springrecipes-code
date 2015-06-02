package au.com.attra;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class Cashier {
	private String fileName;
	private String path;
	private BufferedWriter writer;

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void openFile() {
		File targetDir = new File(path);

		if (!targetDir.exists()) {
			targetDir.mkdir();
		}

		File checkoutFile = new File(path, fileName + ".txt");
		if (!checkoutFile.exists()) {
			try {
				checkoutFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(checkoutFile)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void checkOut(ShoppingCart cart) {
		try {
			writer.write(new Date() + "\t" + cart.getItems() + "\r\n");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void closeFile() {
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
