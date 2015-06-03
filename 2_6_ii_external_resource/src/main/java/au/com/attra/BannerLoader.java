package au.com.attra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.Resource;

public class BannerLoader {
	private Resource banner;

	public void setBanner(Resource banner) {
		this.banner = banner;
	}

	public void showBanner() {
		try {
			InputStream in = banner.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
