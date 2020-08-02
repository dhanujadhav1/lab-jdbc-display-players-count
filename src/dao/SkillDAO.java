package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

import model.Skill;
import utility.ConnectionManager;
public class SkillDAO{
	
	public TreeMap<Skill,Integer> skillCount() throws SQLException, ClassNotFoundException, IOException {
		TreeMap<Skill,Integer> tm= new TreeMap<Skill,Integer>();
		List<String> list = new ArrayList<>();
		Skill skill= new Skill();
		ConnectionManager cm =new ConnectionManager();
		Connection con=cm.getConnection();
		Statement st=con.createStatement();
		String sql ="SELECT distinct sname FROM tabu ";
		ResultSet rs=st.executeQuery(sql);
		int i=1;
	while(rs.next())
	{
		list.add(rs.getString(i));
		i++; 
	}
	
	List<String> distinctList = (List<String>)list.stream().distinct().collect(Collectors.toList());
	Iterator<String> itr = distinctList.iterator();
	int count=0;
	long id=1;
	while(itr.hasNext())
	{
		count=Collections.frequency(list, itr.next());
		skill.setSkillld(id);
		skill.setSkillName(itr.next());
		tm.put(skill, count);
	}
		return tm;
		
	}
}
