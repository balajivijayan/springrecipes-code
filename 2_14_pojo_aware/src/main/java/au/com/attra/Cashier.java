package au.com.attra;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

import org.springframework.beans.factory.BeanNameAware;

public class Cashier implements BeanNameAware {
	private String beanName;
	private String path;
	private BufferedWriter writer;

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void openFile() throws IOException {
		File targetDir = new File(path);
		if (!targetDir.exists()) {
			targetDir.mkdir();
		}
		File checkOutFile = new File(path, beanName + ".txt");
		if (!checkOutFile.exists()) {
			checkOutFile.createNewFile();
		}
		writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(checkOutFile)));

	}

	public void checkOutFile(ShoppingCart cart) {
		try {
			writer.write(new Date() + "\t" + cart.toString() + "\r\n");
			writer.flush();
		} catch (IOException e) {
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
