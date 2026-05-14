package 習熟度試験2;

public class Skill {
	private String skillName;

	public Skill(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillName() {
		return skillName;
	}
	static void pullTrigger() {
		System.out.println(skillName + "を発動します");
	}

}
