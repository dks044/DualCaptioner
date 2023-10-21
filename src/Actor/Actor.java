package Actor;
import java.util.*;

public class Actor {
	int actor_no;
	ArrayList<Integer> act_pose = new ArrayList<>(); //포즈4개
	int age;
	String gender;
	String top; //상의
	String bottom; // 하의
	
	public int getActor_no() {
		return actor_no;
	}
	public void setActor_no(int actor_no) {
		this.actor_no = actor_no;
	}
	public ArrayList<Integer> getAct_pose() {
		return act_pose;
	}
	public void setAct_pose(ArrayList<Integer> act_pose) {
		this.act_pose = act_pose;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
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
	
	
}
