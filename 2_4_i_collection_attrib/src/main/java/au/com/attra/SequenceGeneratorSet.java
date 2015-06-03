package au.com.attra;

import java.util.Set;

public class SequenceGeneratorSet {
	private String prefix;
	private String initial;
	private Set<Object> suffixes;
	private int counter;

	public SequenceGeneratorSet() {
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

	public Set<Object> getSuffixes() {
		return suffixes;
	}

	public void setSuffixes(Set<Object> suffixes) {
		this.suffixes = suffixes;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public String getSequence() {
		StringBuffer sequence = new StringBuffer();
		sequence.append(prefix);
		sequence.append(initial + counter++);
		for(Object everySet : suffixes) {
			sequence.append(everySet);
		}
		return sequence.toString();
	}
}
