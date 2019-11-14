package org.jScript.Principal;

public class Utility {

	public void interprete(String cmlet) {
		if (!cmlet.isEmpty()) {			
			String[] comando = cmlet.split(" ");			
			if (comando[0].equalsIgnoreCase("Get-Host") && cmlet.length() >= 8 ) {
				getHost(cmlet);				
			} else if (comando[0].equalsIgnoreCase("Get-Command") && cmlet.length() >= 11 ) {
				getCommand(cmlet);
			} else if(comando[0].equalsIgnoreCase("Write-Host") && cmlet.length() >= 10 ) {
				writeHost(cmlet);
			} else {
				System.out.print("");
			}
		}
	}

	private void writeHost(String cmlet) {
		// TODO Auto-generated method stub
		if(cmlet.length() > 11) {
			String[] comando = cmlet.split(" ");
			if(comando.length > 0) {
				String str = cmlet.substring(11);
				if(str.charAt(0) == '"' && str.charAt(str.length()-1) == '"') {
					System.out.println(str.substring(1, str.length()-1));
				}else {
					System.out.println(str);
				}				
			}
		} else {
			System.out.print("");
		}
		
	}

	private void getCommand(String cmlet) {
		// TODO Auto-generated method stub
		System.out.println("Command      Version");
		System.out.println("-----------  -------");
		System.out.println(" Exit          1.0");
		System.out.println(" Get-Host      1.0");
		System.out.println(" Get-Command   1.0");
		System.out.println(" Write-Host    1.0");
	}

	private void getHost(String cmlet) {
		String version = "Version 1.0 --> 2019/11/13";
		System.out.println("   " + version);
	}

}
