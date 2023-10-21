package Actor;
import java.util.*;

public class Actor {
	static final ArrayList<Actor> ACTOR_List = new ArrayList<>();
	public static ArrayList<Actor> getActorList() {
        return ACTOR_List;
    }
//	public static boolean isEquals(String actor_no) {
//		boolean equals = false;
//		Actor a = new Actor(actor_no);
//		if(Actor.getActorList().equals(a)) {
//			equals = true;
//		}else equals = false;
//		
//		return equals;
//	}
//	public static Actor getActor(String actor_no) {
//		
//		return 
//	}
	public static Actor findActorByNo(String actor_no) {
        for (Actor actor : ACTOR_List) {
            if (actor.getActor_no().equals(actor_no)) {
                return actor;
            }
        }
        return null;
    }
	
	
	
	String actor_no;
	ArrayList<String> act_pose = new ArrayList<>(); //포즈4개
	String age;
	String gender;
	String top; //상의
	String bottom; // 하의
	
	public String getActor_no() {
		return actor_no;
	}
	public void setActor_no(String actor_no) {
		this.actor_no = actor_no;
	}
	public ArrayList<String> getAct_pose() {
		return act_pose;
	}
	public void setAct_pose(ArrayList<String> act_pose) {
		this.act_pose = act_pose;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top = top;
	}
	public String getBottom() {
		return bottom;
	}
	public void setBottom(String bottom) {
		this.bottom = bottom;
	}
	
	public Actor(String actor_no){
		this.actor_no = actor_no;
		ACTOR_List.add(this);
	}
	
	public Actor(String actor_no,ArrayList<String> act_pose){
		this.actor_no = actor_no;
		this.act_pose = act_pose;
		ACTOR_List.add(this);
	}
	
}
