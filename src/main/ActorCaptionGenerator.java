package main;
import java.util.*;

import Actor.Actor;

public class ActorCaptionGenerator {

	public static void main(String[] args) {
		
		//==========엑터 객체 데이터 생성(시작)=====================================================
		ArrayList<Actor> actor_list = new ArrayList<>();
		//====================================================================================
		//데이터 넣는곳 (엑터번호랑 포즈번호만)
		String data_input = "0001	P01\r\n"
				+ "0001	P02\r\n"
				+ "0001	P03\r\n"
				+ "0001	P04\r\n"
				+ "0002	P01\r\n"
				+ "0002	P02\r\n"
				+ "0002	P03\r\n"
				+ "0002	P04\r\n"
				+ "0003	P01\r\n"
				+ "0003	P02\r\n"
				+ "0003	P03\r\n"
				+ "0003	P04\r\n"
				+ "0004	P01\r\n"
				+ "0004	P02\r\n"
				+ "0004	P03\r\n"
				+ "0004	P04";
		
		String[] data_input_arr = data_input.split("\r\n");
		
		for(int i=0;i<data_input_arr.length;i++) {
			String[] data_input_temp = data_input_arr[i].split("\t"); // 탭 문자로 분리
            Actor tempActor = Actor.findActorByNo(data_input_temp[0]);
            if(tempActor == null) {
                Actor newActor = new Actor(data_input_temp[0]);
                newActor.getAct_pose().add(data_input_temp[1]);
                actor_list.add(newActor);
            } else {
                tempActor.getAct_pose().add(data_input_temp[1]);
            }
        }
		
		//====================================================================================
		//데이터 넣는곳2 (엑터번호, 의상들)
		String data_input2="0001	10대 미만	 남자	 셔츠	 면바지\r\n"
				+ "0002	10대 미만	 남자	 셔츠	 면바지\r\n"
				+ "0003	10대	 남자	 맨투맨	 운동복 바지/산악바지\r\n"
				+ "0004	10대	 남자	 맨투맨	 운동복 바지/산악바지";
		data_input2 = data_input2.replaceAll("\\s+(미만)", "$1");  //'미만' 글자 앞에 공백 없애기
		data_input2 = data_input2.replaceAll("\\s+(바지)", "$1");  //'바지' 글자 앞에 공백 없애기
		
		String[] data_input_arr2 = data_input2.split("\r\n");
		
		for(int i=0;i<data_input_arr2.length;i++) {
			String[] data_input_temp2 = data_input_arr2[i].split("\t"); // 탭 문자로 분리
			Actor tempActor2 = Actor.findActorByNo(data_input_temp2[0]);
			tempActor2.setAge(data_input_temp2[1]);
			tempActor2.setGender(data_input_temp2[2]);
			tempActor2.setTop(data_input_temp2[3]);
			tempActor2.setBottom(data_input_temp2[4]);
		}
		//==========엑터 객체 데이터 생성(끝)=====================================================
		
		
		
		
		
		
	}

}
