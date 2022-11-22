package Book;

public class CategorizeKDC {
		 //분류 카테고리명
	static String[][] categoryName =
		{
			{//000 총류
				"총류",							//000
				"총류_도서학, 서지학",				//010
				"총류_문헌정보학",					//020
				"총류_백과사전",					//030
				"총류_일반 논문집",					//040
				"총류_일반 연속간행물",				//050
				"총류_일반 학회, 단체, 협회, 기관",		//060
				"총류_신문, 언론, 저널리즘",			//070
				"총류_일반 전집, 총서",				//080
				"총류_X" },						//090
			
			{//100 철학
				"철학",
				"철학_형이상학",
				"철학_X",
				"철학_철학의 체계",
				"철학_경학",
				"철학_아시아(동양) 철학, 사상",
				"철학_서양철학",
				"철학_논리학",
				"철학_심리학",
				"철학_윤리학, 도덕철학" },
			
			{//200 종교
				"종교",
				"종교_비교종교학",
				"종교_불교",
				"종교_기독교",
				"종교_도교",
				"종교_천도교",
				"종교_신도",
				"종교_바라문교, 인도교",
				"종교_회교(이슬람교)",
				"종교_기타 제종교" },

			{//300 사회과학
				"사회과학",
				"사회과학_통계학",
				"사회과학_경제학",
				"사회과학_사회학, 사회문제",
				"사회과학_정치학",
				"사회과학_행정학",
				"사회과학_법학",
				"사회과학_교육학",
				"사회과학_풍속, 민속학",
				"사회과학_국방, 군사학" },
			
			{//400 순수과학
				"순수과학",
				"순수과학_수학",
				"순수과학_물리학",
				"순수과학_화학",
				"순수과학_천문학",
				"순수과학_지학",
				"순수과학_광물학",
				"순수과학_생물과학",
				"순수과학_식물학",
				"순수과학_동물학" },

			{//500 기술과학
				"기술과학",
				"기술과학_의학",
				"기술과학_농업, 농학",
				"기술과학_공학, 공업일반",
				"기술과학_건축공학",
				"기술과학_기계공학",
				"기술과학_전기공학, 전자공학",
				"기술과학_화학공학",
				"기술과학_제조업",
				"기술과학_가정학 및 가정생활" },

			{//600 예술
				"예술",
				"예술_건축술",
				"예술_조각",
				"예술_공예, 장식미술",
				"예술_서예",
				"예술_회화, 도화",
				"예술_사진술",
				"예술_음악",
				"예술_연극",
				"예술_오락, 운동" },

			{//700 언어
				"언어",
				"언어_한국어",
				"언어_중국어",
				"언어_일본어",
				"언어_영어",
				"언어_독일어",
				"언어_프랑스어",
				"언어_스페인어",
				"언어_이탈리아어",
				"언어_기타 제어" },

			{//800 문학
				"문학",
				"문학_한국문학",
				"문학_중국문학",
				"문학_일본문학",
				"문학_영미문학",
				"문학_독일문학",
				"문학_프랑스문학",
				"문학_스페인문학",
				"문학_이탈리아문학",
				"문학_기타 제문학" },
			
			{//900 역사
				"역사",
				"역사_아시아(아세아)",
				"역사_유럽(구라파)",
				"역사_아프리카",
				"역사_북아메리카(북미)",
				"역사_남아메리카(남미)",
				"역사_오세아니아(대양주)",
				"역사_양극지방",
				"역사_지리",
				"역사_전기" }
				
		};//String[][] categoryName 끝 지점
		
	
	//KDC코드로 분류명 찾아내 리턴
	public static String getCategoryname(String kdc) {
		String category = categoryName[kdc.charAt(0)][kdc.charAt(1)];
		return category;
	}

	//분류명으로 KDC코드 찾아내 리턴
	public static String getKDCCode(String category) {
		String code = null;		//리턴할 KDC코드 문자열
		boolean isFind = false;	//찾았는지 체크하는 boolean변수
		
		for(int i=0; i<categoryName.length; i++) {
			for(int j=0; i<categoryName[i].length; j++) {
				if(category.equals(categoryName[i][j]) == true) {
					code = "" + i + j + "0";
					isFind = true;
					break;
				}
			}
			if(isFind) { break; }
		}
		
		return code;
	}
	
}

