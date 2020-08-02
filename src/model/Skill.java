package model;
public class Skill{
	
	Long skillld;
	String skillName ;
	public Skill(Long skillld, String skillName) {
		super();
		this.skillld = skillld;
		this.skillName = skillName;
	}
	public Skill() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getSkillld() {
		return skillld;
	}
	public void setSkillld(Long skillld) {
		this.skillld = skillld;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	
	
}
