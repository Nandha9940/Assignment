package AnnotationBasedConfig;

import org.springframework.stereotype.Component;

@Component
/*@primary annototion -->or we use qualifier*/
public class Snapdragon implements MobileProcess{
public void main1() {
	System.out.println("Snapdragon");
}
}
