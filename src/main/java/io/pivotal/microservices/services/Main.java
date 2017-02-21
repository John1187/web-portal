package io.pivotal.microservices.services;

import io.pivotal.microservices.services.web.WebServer;

/**
 * Allow the servers to be invoked from the command-line. The jar is built with
 * this as the <code>Main-Class</code> in the jar's <code>MANIFEST.MF</code>.
 * 
 * @author Paul Chapman
 */
public class Main {

	public static void main(String[] args) {
		
		WebServer.main(args);

//		String serverName = "NO-VALUE";
//
//		switch (args.length) {
//		case 2:
//			// Optionally set the HTTP port to listen on, overrides
//			// value in the <server-name>-server.yml file
//			System.setProperty("server.port", args[1]);
//			// Fall through into ..
//
//		case 1:
//			serverName = args[0].toLowerCase();
//			break;
//
//		default:
//			usage();
//			return;
//		}
//
//		if (serverName.equals("registration") || serverName.equals("reg")) {
//			RegistrationServer.main(args);
//		} else if (serverName.equals("accounts")) {
//			AccountsServer.main(args);
//		} else if (serverName.equals("web")) {
//			WebServer.main(args);
//		} else {
//			System.out.println("Unknown server type: " + serverName);
//			usage();
//		}
	}

}
