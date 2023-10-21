package main;
import java.util.*;

import Actor.Actor;
import translator.Translator;

public class ActorCaptionGenerator {

	public static void main(String[] args) {
		Translator t = new Translator();
		
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
				+ "0004	P04\r\n"
				+ "0005	P01\r\n"
				+ "0005	P02\r\n"
				+ "0005	P03\r\n"
				+ "0005	P04";
		
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
				+ "0004	10대	 남자	 맨투맨	 운동복 바지/산악바지\r\n"
				+ "0005	10대	 남자	 니트	 청바지";
		
		data_input2 = data_input2.replaceAll("\\s+(미만)", "$1");  //'미만' 글자 앞에 공백 없애기
		data_input2 = data_input2.replaceAll("\\s+(바지)", "$1");  //'바지' 글자 앞에 공백 없애기
		
		//TODO:: 테스트중 (셔츠 면바지, 셔츠면바지 구분관련) 
		data_input2 = data_input2.replaceAll("(?<=\\p{IsHangul})\\s+(면)", "$1");
		data_input2 = data_input2.replaceAll("셔츠면", "셔츠 면");

		
		data_input2 = data_input2.replaceAll("\\s+(티)", "$1");  //'티' 글자 앞에 공백 없애기
		data_input2 = data_input2.replaceAll("\\s+(카)", "$1");  //'카' 글자 앞에 공백 없애기
		
		// '셔츠'와 '면바지' 사이의 공백을 탭으로 변환
		data_input2 = data_input2.replaceAll("(셔츠)\\s+(면바지)", "$1\t$2");

		
		String[] data_input_arr2 = data_input2.split("\r\n");
		
		for(int i=0;i<data_input_arr2.length;i++) {
			int index =0;
			String[] data_input_temp2 = data_input_arr2[i].split("\t"); // 탭 문자로 분리
			
			Actor tempActor2 = Actor.findActorByNo(data_input_temp2[0]);
			tempActor2.setAge(data_input_temp2[1]);
			tempActor2.setGender(data_input_temp2[2]);
			
			if(data_input_temp2[3].equals("반팔면티셔츠")) data_input_temp2[3] = "반팔 면 티셔츠";
			if(data_input_temp2[3].equals("반팔카라티셔츠")) data_input_temp2[3] = "반팔 카라티셔츠";
			tempActor2.setTop(data_input_temp2[3]);
			
			if(data_input_temp2[4].equals("나일론바지")) data_input_temp2[4] = "나일론 바지";
			if(data_input_temp2[4].equals("운동복바지/산악바지")) data_input_temp2[4] = "운동복/산악바지";
			tempActor2.setBottom(data_input_temp2[4]);
		}
		//==========엑터 객체 데이터 생성(끝)=====================================================
		StringBuilder k = new StringBuilder();
		StringBuilder e = new StringBuilder();
		
		
		//한글캡션
		for(Actor a : actor_list) {
			for(int i=0;i<a.getAct_pose().size();i++) {
				for(int j=0;j<t.getCamKr().length;j++) {
					//k.append(a.getActor_no()+" ");//테스트
					k.append("흰색 배경에서 ");
					if(a.getAge().contains("미만"))k.append("10대 미만");
					else k.append(a.getAge()+" ");
					k.append(a.getGender()+"가 ");
					k.append(a.getTop()+"와 ");
					k.append(a.getBottom()+"를 입고 ");
					k.append(t.getPose_kr_map().get(a.getAct_pose().get(i))+"를 취하고 있는 ");
					String[] camKR = t.getCamKr();
					k.append(camKR[j]);
					System.out.println(k.toString());
					k.setLength(0);
				}
			}
		}
		System.out.println("==========================================================================================");
		System.out.println("==========================================================================================");
		System.out.println("==========================================================================================");
		System.out.println("==========================================================================================");
		//영어캡션
		for(Actor a : actor_list) {
			
		}
		
		
		
		
		
	}

}
