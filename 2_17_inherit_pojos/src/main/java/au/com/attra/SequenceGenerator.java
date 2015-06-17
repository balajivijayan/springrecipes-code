package au.com.attra;

public class SequenceGenerator {
	private String prefix;
	private String suffix;
	private int initial;
	private int counter;

	public SequenceGenerator() {
		super();
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public int getInitial() {
		return initial;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getSequence() {
		StringBuilder sb = new StringBuilder();
		sb.append(prefix);
		sb.append(initial + counter++);
		sb.append(suffix);
		return sb.toString();
	}

}
