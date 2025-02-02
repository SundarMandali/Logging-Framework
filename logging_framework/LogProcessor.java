package logging_framework;

public abstract class LogProcessor {
	public static final int INFO=1;
	public static final int DEBUG=2;
	public static final int ERROR=3;
	
	LogProcessor nextLogProcessor;
	
	LogProcessor(LogProcessor logProcessor){
		this.nextLogProcessor=logProcessor;
	}
	
	void log(int loglevel,String message){
		if(nextLogProcessor!=null) {
			nextLogProcessor.log(loglevel, message);
		}
	}
	
	
}
