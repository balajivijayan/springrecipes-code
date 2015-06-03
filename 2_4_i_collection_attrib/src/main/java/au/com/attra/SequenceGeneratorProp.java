package au.com.attra;

import java.util.Map.Entry;
import java.util.Properties;

public class SequenceGeneratorProp {
	private String prefix;
	private String initial;
	private int counter;
	private Properties suffixes;

	public SequenceGeneratorProp() {
		super();
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public int getCount() {
		return counter;
	}

	public void setCount(int counter) {
		this.counter = counter;
	}

	public Properties getSuffixes() {
		return suffixes;
	}

	public void setSuffixes(Properties suffixes) {
		this.suffixes = suffixes;
	}
	
	public String getSequence() {
		StringBuffer sequence = new StringBuffer();
		sequence.append(prefix);
		sequence.append(initial + counter++);
		
		for(Entry<Object, Object> entry : suffixes.entrySet()) {
			sequence.append("-");
			sequence.append(entry.getKey());
			sequence.append("@");
			sequence.append(entry.getValue());
		}
		
		return sequence.toString();
	}
}
