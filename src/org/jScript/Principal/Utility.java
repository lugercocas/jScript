package org.jScript.Principal;

public class Utility {

	public void interprete(String cmlet) {
		if (!cmlet.isEmpty()) {			
			//System.out.println(cmlet.length());
			if (cmlet.substring(0, 8).equalsIgnoreCase("Get-Host") && cmlet.length() >= 8 ) {
				getHost(cmlet);				
			}
		}
	}

	private void getHost(String cmlet) {
		String version = "Version 1.0 --> 2019/11/13";
		System.out.println("   " + version);
	}
	
	

}
