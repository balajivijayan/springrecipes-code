package au.com.attra;

import java.util.ArrayList;
import java.util.List;

public class SequenceGenerator {
	private String prefix;
	private List<String> suffixes = new ArrayList<String>();
	private int initial;
	private int counter;

	public SequenceGenerator() {
		super();
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffixes(List<String> suffixes) {
		this.suffixes = suffixes;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getSequence() {
		StringBuilder sb = new StringBuilder();
		sb.append(prefix);
		sb.append(initial + counter++);

		for (String suffix : suffixes) {
			sb.append(suffix);
		}

		return sb.toString();
	}

}
