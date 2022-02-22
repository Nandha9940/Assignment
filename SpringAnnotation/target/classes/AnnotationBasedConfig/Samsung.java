package AnnotationBasedConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
@Qualifier("snapdragon")
	MobileProcess process;

	public MobileProcess getProcess() {
		return process;
	}

	public void setProcess(MobileProcess process) {
		this.process = process;
	}

	public void main() {
		System.out.println("Samsung");
		process.main1();
	}

}
