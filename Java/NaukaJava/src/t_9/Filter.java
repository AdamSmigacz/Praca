package t_9;

class WaveForm{
	
	private static long counter;
	private final long id = counter++;
	public String toString(){
		return "WaveForm " + id;
	}
}

public class Filter {
	public String name(){
		return getClass().getSimpleName();
		}
	public WaveForm process(WaveForm input){
		return input;}
}

class HighPass extends Filter{
	double cutoff;
	public HighPass(double cutoff){
		this.cutoff = cutoff;
	}
	public WaveForm process(WaveForm input){
		return input;
	}
	
}

class LowPass extends Filter{
	double cutoff;
	public LowPass(double cutoff){
		this.cutoff = cutoff;
	}
	public WaveForm process(WaveForm input){
		return input;
	}
	
}

class BandPass extends Filter{
	double lowCutoff, highCutoff;
	public BandPass(double lowCut,  double highCut){
		lowCutoff = lowCut;
		highCutoff = highCut;
	}
	public WaveForm process(WaveForm input){
		return input;
	}
}




