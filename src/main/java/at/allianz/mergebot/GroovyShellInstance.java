package at.allianz.mergebot;

import groovy.lang.GroovyShell;
import groovy.lang.Singleton;

@Singleton (lazy=true)
class GroovyShellInstance extends GroovyShell{
	private static GroovyShellInstance groovyShell = new GroovyShellInstance();
	
	private GroovyShellInstance() {
		super();
	}
	
	public static GroovyShellInstance getInstance(){
		return groovyShell;
	}
}
