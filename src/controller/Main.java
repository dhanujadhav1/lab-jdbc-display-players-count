package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map.Entry;
import java.util.TreeMap;

import dao.SkillDAO;
import model.Skill;

public class Main{
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		SkillDAO skilldao = new SkillDAO ();
		TreeMap<Skill,Integer>tm=skilldao.skillCount();
		 for(Entry<Skill, Integer> m:tm.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
		
	}
	
	
}
