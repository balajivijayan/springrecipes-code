package au.com.attra;

import java.util.Map;

public class SequenceGeneratorMap {
	private String prefix;
	private String initial;
	private int counter;
	private Map<Object, Object> suffixes;

	public SequenceGeneratorMap() {
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

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Map<Object, Object> getSuffixes() {
		return suffixes;
	}

	public void setSuffixes(Map<Object, Object> suffixes) {
		this.suffixes = suffixes;
	}

	public String getSequence() {
		StringBuffer sequence = new StringBuffer();
		sequence.append(initial);
		sequence.append(initial + counter++);
		for (@SuppressWarnings("rawtypes") Map.Entry entry : suffixes.entrySet()) {
			sequence.append("-");
			sequence.append(entry.getKey());
			sequence.append("@");
			sequence.append(entry.getValue());
		}

		return sequence.toString();
	}
}
