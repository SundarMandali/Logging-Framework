package logging_framework;

public class InfoLogProcessor extends LogProcessor {

	InfoLogProcessor(LogProcessor logProcessor){
		super(logProcessor);
	}
	
	void log(int loglevel,String message){
		if(loglevel==LogProcessor.INFO) {
			System.out.println("Info log: "+message);
		}else {
			super.log(loglevel,message);
		}
	}
}
