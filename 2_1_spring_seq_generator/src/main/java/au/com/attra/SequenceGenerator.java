package au.com.attra;

public class SequenceGenerator {
	private String prefix;
	private String suffix;
	private int initial;
	private int counter;

	public SequenceGenerator() {
	}

	public SequenceGenerator(String prefix, String suffix, int initial) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}
	
	public SequenceGenerator(String prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	public SequenceGenerator(String prefix, int initial) {
		super();
		this.prefix = prefix;
		this.initial = initial;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public synchronized String getSequence() {
		StringBuffer sequence = new StringBuffer();
		sequence.append(prefix);
		sequence.append(initial + counter++ );
		sequence.append(suffix);
		return sequence.toString();
	}

}
