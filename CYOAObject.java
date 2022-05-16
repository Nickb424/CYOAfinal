
public class CYOAObject {
	private String name;
	
	public CYOAObject(String n) {
		name = n;	
	}
	public String beginning() {
		// TODO Auto-generated method stub
		return name + ", you are the player choosing the fate of the hero in this story what do you choose?"
				+ " 1(The Hero), 2(The Villian, 3(Anti Hero, or 4(New Jack Of Blades)";
	}
	public String decisionChoice1() {
		// TODO Auto-generated method stub
		return name + ", you choose the life of a good hero. Do you denie the status or accept being the hero? 1(yes), 2(no)";
	}
	public String finalChoice1() {
		// TODO Auto-generated method stub
		return name + ", after you are brought to the Guild you pursue a life of complete good and big renown. You vanquish all the evil that plagues the world of Mystic Earth. "
				+ "You ultimately settle down after defeating all your enemies by getting married and retiring off on the world you have set free.";
	}
	public String otherChoice1() {
		// TODO Auto-generated method stub
		return name + ", ultimatly the story of the true Hero is never told and he gets lost within his possible potential(Hero Story Failed)";
	}
	public String decisionChoice2() {
		// TODO Auto-generated method stub
		return "You choose the life of a villian. Do you want to pursue villanous status or rethink your choice? 1(yesy), 2(no)";
	}
	public String finalchoice2() {
		// TODO Auto-generated method stub
		return "After being brought to the guild you start to use your will powers for evil instead of good. You start to get jealous of every other apprentice and start siding with the enemy of evil and attack and consume the life of those you have dearly loved."
				+ " Jack Of Blades sees the potential to spread his power across all lands and you accept and pursue tyranny and evil.";
	}
	public String otherChoice2() {
		// TODO Auto-generated method stub
		return "You rethink the villanous pursuit of the hero and maybe try another route";
	}
	public String decisionChoice3() {
		// TODO Auto-generated method stub
		return "You choose the life of a anti hero. Do you embrace the nomad life or do you rethink your choices 1(yes), 2(no).";
	}
	public String finalChoice2() {
		// TODO Auto-generated method stub
		return "When you are brought to the guild you start seeing the corruption in the guild, but you don’t see the good in siding with the pure evil doers."
				+ " After gaining all the powers you need and all the training at the guild you then self vanish and disappear going rogue helping those in need and fighting evil while making your character as silent to the world than making yourself known and not accepting forced guild spread oif their power to.";
	}
	public String otherChoice3() {
		// TODO Auto-generated method stub
		return "You decide not to pursue the nomad life and decide to rethink the hero's fate";
	}
	public String decisionChoice4() {
		// TODO Auto-generated method stub
		return "You choose the fate of the hero becoming the new Jack Of Blades or do you think the hero should have another fate? 1(yes), 2(no)";
	}
	public String finalchoice4() {
		// TODO Auto-generated method stub
		return "After pursuing the life of good and then reaching the point to throw away the sword of Eons or to vanquish your sister. The livelihood of Jack lives within the blade and then as you stare at its piercing point you get whispered incantations and are automatically corrupted and then the soul of Jack Of Blades harnesses your body and so forth destroys the rest of the family you had left leaving the world to fight the pure evil corruption.";
	}
	public String otherchoices4() {
		// TODO Auto-generated method stub
		return "You decide the hero should not be the evil ruler of these pure lands";
	}
}

