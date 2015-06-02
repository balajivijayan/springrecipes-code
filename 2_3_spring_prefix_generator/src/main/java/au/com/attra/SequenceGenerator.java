package au.com.attra;

public class SequenceGenerator {
	private PrefixGenerator prefixGenerator;
	private String suffix;
	private int initial;
	private int counter;

	public SequenceGenerator() {
	}

	public SequenceGenerator(PrefixGenerator prefix, String suffix, int initial) {
		this.prefixGenerator = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}

	public void setPrefixGenerator(PrefixGenerator prefix) {
		this.prefixGenerator = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public synchronized String getSequence() {
		StringBuffer sequence = new StringBuffer();
		sequence.append(prefixGenerator.getPrefix());
		sequence.append(initial + counter++ );
		sequence.append(suffix);
		return sequence.toString();
	}

}
