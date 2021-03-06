package br.pucrio.dslmetrics.core.domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Class extends Entity {

	private Map<Version, List<Method>> methods = new HashMap<Version, List<Method>>();
	
	private Map<Version, List<Class>> classes = new HashMap<Version, List<Class>>();

	public Class(String name, String fullQualifiedName) {
		super(name,fullQualifiedName);
	}
	
	public List<Method> getMethods(Version version) {
		List<Method> list = methods.get(version);
		
		if(list == null)
			return Collections.emptyList();
		
		return Collections.unmodifiableList(list);
	}

	public List<Method> setMethods(Version version, List<Method> methods) {
		return this.methods.put(version, methods);
	}
	
	public Set<Method> getMethodsOfAllVersions() {
		return getEntitiesOfAllVersions(methods);
	}
	
	public List<Class> getClasses(Version version) {
		List<Class> list = classes.get(version);
		
		if (list == null) 
			return Collections.emptyList();
		
		return Collections.unmodifiableList(list);
	}
	
	public List<Class> setClasses(Version version, List<Class> classes) {
		return this.classes.put(version, classes);
	}
	
	public Set<Class> getClassesOfAllVersions() {
		return getEntitiesOfAllVersions(classes);
	}
	
}
