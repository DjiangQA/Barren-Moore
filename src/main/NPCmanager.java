package main;

import java.util.ArrayList;

public class NPCmanager {
	
	ArrayList<NPCs> NPCList = new ArrayList<NPCs>();
	
	Enemynpcs e1 = new Enemynpcs("E1", 10, 1, 1, 1, true,true, 1, 1);
	
	public void addNPC(Enemynpcs I) {
		NPCList.add(I);
	}
	
	public String getName(){
		for (NPCs I : NPCList) {
			return I.name;

		}
		return null;
	}
	
	

}