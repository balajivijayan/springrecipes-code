package au.com.attra;

import java.util.List;

public class SequenceGeneratorList {

	private String prefix;
	private List<Object> suffixes;
	private int initial;
	private int counter;

	public SequenceGeneratorList() {
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffixes(List<Object> suffixes) {
		this.suffixes = suffixes;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public synchronized String getSequence() {
		StringBuffer sequence = new StringBuffer();
		sequence.append(prefix);
		sequence.append(initial + counter++);
		for (Object suffix : suffixes) {
			sequence.append(suffix);
		}
		return sequence.toString();
	}

}
