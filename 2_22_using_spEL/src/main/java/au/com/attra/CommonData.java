package au.com.attra;

import java.util.Properties;

public class CommonData {
	private Properties commonProperties;
	private String userOS;
	private String userRegion;
	private Double randomNumber;
	private String email;

	public CommonData() {
		super();
	}

	public Properties getCommonProperties() {
		return commonProperties;
	}

	public void setCommonProperties(Properties commonProperties) {
		this.commonProperties = commonProperties;
	}

	public String getUserOS() {
		return userOS;
	}

	public void setUserOS(String userOS) {
		this.userOS = userOS;
	}

	public String getUserRegion() {
		return userRegion;
	}

	public void setUserRegion(String userRegion) {
		this.userRegion = userRegion;
	}

	public Double getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(Double randomNumber) {
		this.randomNumber = randomNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
