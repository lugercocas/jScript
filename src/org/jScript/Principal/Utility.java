package org.jScript.Principal;

public class Utility {

	public void interprete(String cmlet) {
		if (!cmlet.isEmpty()) {			
			String[] comando = cmlet.split(" ");			
			if (comando[0].equalsIgnoreCase("Get-Host") && cmlet.length() >= 8 ) {
				getHost(cmlet);				
			} else if (comando[0].equalsIgnoreCase("Get-Command") && cmlet.length() >= 11 ) {
				getCommand(cmlet);
			} else {
				System.out.print("");
			}
		}
	}

	private void getCommand(String cmlet) {
		// TODO Auto-generated method stub
		System.out.println("Command      Version");
		System.out.println("-----------  -------");
		System.out.println(" Exit          1.0");
		System.out.println(" Get-Host      1.0");
		System.out.println(" Get-Command   1.0");
	}

	private void getHost(String cmlet) {
		String version = "Version 1.0 --> 2019/11/13";
		System.out.println("   " + version);
	}
	
	

}
