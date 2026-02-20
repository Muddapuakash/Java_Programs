package com.java.opps.package2;
/
import com.java.opps.package1.Parent;
public class DifferentPackageChild extends Parent {
	
	public static void main(String[] args) {
		DifferentPackageChild dpc = new DifferentPackageChild();
		System.out.println(dpc.var);
		
	}
           
	
}
