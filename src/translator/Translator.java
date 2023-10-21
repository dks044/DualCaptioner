package translator;

import java.util.HashMap;
import java.util.*;

public class Translator {
	//캠
	static final String[] CAM_KR = {"정면 모습","좌측 정면 모습","우측 후면 모습","후면 모습","좌측 후면 모습","우측 정면 모습"};
	static final String[] CAM_ENG = {"on front view","on left front view","on right back view","on back view",
			"on left back view","on right front view"};
	//TODO:: 성별은 알아서 코드안에
	
	
	// 포즈
	static HashMap<String,String> pose_kr_map = new HashMap<String, String>();
	static HashMap<String,String> pose_eng_map = new HashMap<String, String>();

	//의상
    static HashMap<String, String> clothes_map = new HashMap<>();
    //연령대
    static HashMap<String, String> age_map = new HashMap<>();
    
    
    
    
    static {  // static 초기화 블록 시작
    	 pose_kr_map.put("P01", "바로 선 자세");
         pose_kr_map.put("P02", "머리 위로 팔 뻗은 자세");
         pose_kr_map.put("P03", "주먹 맞댄 선 자세");
         pose_kr_map.put("P04", "팔 굽힌 선 자세");
         pose_kr_map.put("P05", "아래 팔 올린 선 자세");
         pose_kr_map.put("P06", "양팔 뻗은 선 자세");
         pose_kr_map.put("P07", "바로 앉은 자세");
         pose_kr_map.put("P08", "응용 앉은 자세");
         pose_kr_map.put("P09", "양팔 T자 선 자세");
         pose_kr_map.put("P10", "양팔 A자 선 자세");
         
         pose_eng_map.put("P01", "Standing_straight");
         pose_eng_map.put("P02", "inverting_both_arms_at_90_degree_at_shoulder_level");
         pose_eng_map.put("P03", "facing_both_fists_together");
         pose_eng_map.put("P04", "folding_right_arm");
         pose_eng_map.put("P05", "raising_up_right_forearm");
         pose_eng_map.put("P06", "stratching_both_arms_forward");
         pose_eng_map.put("P07", "sitting_straight");
         pose_eng_map.put("P08", "sitting_applied");
         pose_eng_map.put("P09", "posing_T_posture_with_both_arms");
         pose_eng_map.put("P10", "posing_A_posture_with_both_arms");
    	
    	
        clothes_map.put("맨투맨", "sweatshirts");
        clothes_map.put("셔츠", "shirts");
        clothes_map.put("니트", "knit");
        clothes_map.put("반팔 면 티셔츠", "short-sleeve T-shirt");
        clothes_map.put("반팔 카라티셔츠", "collar-tshirt");
        clothes_map.put("반팔셔츠", "short-sleeve-shirt");
        clothes_map.put("면바지", "cotton-pants");
        clothes_map.put("청바지", "jeans");
        clothes_map.put("운동복/산악바지", "hiking-pants");
        clothes_map.put("면 반바지", "cotton-shorts");
        clothes_map.put("나일론 바지", "nylon-trousers");
        clothes_map.put("통바지", "wide-pants");
        clothes_map.put("치마", "skirt");
        
        age_map.put("10대 미만", "An under 10s");
        age_map.put("10대미만", "An under 10s");
        age_map.put("10대", "An teenager");
        age_map.put("20대", "An 20s");
        age_map.put("30대", "An 30s");
        age_map.put("40대", "An 40s");
        age_map.put("50대", "An 50s");
        age_map.put("60대", "An 60s");
        age_map.put("70대", "An 70s");
        age_map.put("80대", "An 80s");
        
        
    }  
	




	public static HashMap<String, String> getPose_kr_map() {
		return pose_kr_map;
	}




	public static void setPose_kr_map(HashMap<String, String> pose_kr_map) {
		Translator.pose_kr_map = pose_kr_map;
	}




	public static HashMap<String, String> getPose_eng_map() {
		return pose_eng_map;
	}




	public static void setPose_eng_map(HashMap<String, String> pose_eng_map) {
		Translator.pose_eng_map = pose_eng_map;
	}




	public static HashMap<String, String> getClothes_map() {
		return clothes_map;
	}




	public static void setClothes_map(HashMap<String, String> clothes_map) {
		Translator.clothes_map = clothes_map;
	}




	public static HashMap<String, String> getAge_map() {
		return age_map;
	}




	public static void setAge_map(HashMap<String, String> age_map) {
		Translator.age_map = age_map;
	}




	public static String[] getCamKr() {
		return CAM_KR;
	}




	public static String[] getCamEng() {
		return CAM_ENG;
	}
	
}
