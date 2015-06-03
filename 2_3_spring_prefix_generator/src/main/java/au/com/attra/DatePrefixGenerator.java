package au.com.attra;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrefixGenerator implements PrefixGenerator {
	private DateFormat pattern;

	public void setPattern(String pattern) {
		this.pattern = new SimpleDateFormat(pattern);
	}

	@Override
	public String getPrefix() {
		return pattern.format(new Date());
	}

}
