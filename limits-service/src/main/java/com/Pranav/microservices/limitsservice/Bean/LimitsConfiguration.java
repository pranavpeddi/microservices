package com.Pranav.microservices.limitsservice.Bean;

public class LimitsConfiguration {
	
	int minimum;
	int maximum;
 
 protected LimitsConfiguration()
 {
	 
 }
 
 public LimitsConfiguration(int maximum,int minimum)
 {
	 super();
	 this.maximum=maximum;
	 this.minimum=minimum;
 }

public int getMinimum() {
	return minimum;
}

public void setMinimum(int minimum) {
	this.minimum = minimum;
}

public int getMaximum() {
	return maximum;
}

public void setMaximum(int maximum) {
	this.maximum = maximum;
}


 
 
}
