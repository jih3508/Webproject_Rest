package egov.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;


import egov.service.CommaService;
import egov.service.CommaVO;




@Controller
public class CommaController {
	@Resource(name = "commaService")
	private CommaService commaService;
	
	
	/** MappingJackson2JsonView */
	@Resource(name = "jsonView")
	protected MappingJackson2JsonView jsonView;
	

		/*my section*/
	/*==================================================================================================*/
	@RequestMapping(value="Mypage_Modify.do")
	   public String Mypage() {
		
	      return "comma/Mypage_Modify";
	   }

	@RequestMapping(value="Login.do")
	   public String Login() {
		
	      return "comma/Login";
	   }
	/*로그인확인*/
	   @RequestMapping("/loginConf.do")
	   @ResponseBody public Map<String,Object> loginCertification(
	         CommaVO vo,
	         HttpServletRequest request) throws Exception {
	         String result = "";
	         int cnt = 0;
	         HashMap<String, Object> map = new HashMap<String, Object>();      
	         System.out.println("컨트롤1");
	         cnt = commaService.selectMemberIdPwdCheck(vo);
	         System.out.println("컨트롤2");
	         if(cnt > 0) {
	         /* 인증 세션 생성 */
	         map.put("userId", vo.getId());
	         map.put("userPwd", vo.getPwd());
	         map.put("userPwd", vo.getName());
	         request.getSession().setAttribute("loginCertification", map); //세션 변수 생성
	         result = "ok";
	         } else  {
	         result = "11";
	         }
	         System.out.println("컨트롤3");
	         map.put("result", result);
	         System.out.println(result);
	         return map;
	         }
	         /*로그아웃*/
	   @RequestMapping(value = "/logOut.do")
	   @ResponseBody public Map<String, Object> logOutAction(
	                              CommaVO vo,
	                              HttpServletRequest request
	                              ) throws Exception {
	      HashMap<String, Object> map = new HashMap<String, Object>();
	      request.getSession().setAttribute("loginCertification", null);
	      map.put("result","ok");
	      return map;
	   }
	/*id 중복확인*/
	@RequestMapping(value="/idcheck.do")
	@ResponseBody
	public Map<String,Object> selectMemberIdcheck (
			HttpServletResponse response,
			CommaVO vo) throws Exception {
		System.out.println("컨트롤 1");
		Map<String, Object> map = new HashMap<String, Object>();
		
		String result = "";
		
		 
		/* 저장 */
		int cnt = commaService.selectMemberIdcheck(vo);
		System.out.println("컨트롤 2");

		map.put("count", cnt);

		return map;
	}
	/*회원저장*/
	@RequestMapping(value="/memberSave.do")
	@ResponseBody
	public Map<String,Object> insertMember (
			HttpServletResponse response,
			CommaVO vo) throws Exception {
		System.out.println("컨트롤 1");
		Map<String, Object> map = new HashMap<String, Object>();
		
		String result = "";
		
		 System.out.println(vo.getId()+" "+ vo.getPwd()+" "+vo.getEmail()+" "+vo.getBirthDay()+" "+vo.getName());
		
		 vo.setBirthDay("2018-05-05");
		 
		/* 저장 */
		result = commaService.insertMember(vo);
		 System.out.println("컨트롤 2");
		if(result==null)  result = "ok";
		map.put("result", result);
		 System.out.println("컨트롤3");
		return map;
	}	
	
	
	@RequestMapping(value="memberSign.do")
	   public String memberSign() {
		
	      return "comma/memberSign";
	   }
	@RequestMapping(value="MainPage.do")
	   public String MainPage() {
		
	      return "comma/MainPage";
	   }
		/*지역*/
	/*==================================================================================================*/

	@RequestMapping(value="/Daegu.do")
	public String Daegu() {
		return "area/Daegu";
	}
	
	@RequestMapping(value="/Busan.do")
	public String Busan() {
		return "area/Busan";
	}
	
	@RequestMapping(value="/Incheon.do")
	public String Incheon() {
		return "area/Incheon";
	}
	
	@RequestMapping(value="/Seoul.do")
	public String Seoul() {
		return "area/Seoul";
	}
	
	@RequestMapping(value="/Gwangju.do")
	public String Gwangju() {
		return "area/Gwangju";
	}
	
	@RequestMapping(value="/Daejeon.do")
	public String Daejeon() {
		return "area/Daejeon";
	}
	
	@RequestMapping(value="/Ulsan.do")
	public String Ulsan() {
		return "area/Ulsan";
	}
	
	/*축제*/
	/*============================================================================================= */
	@RequestMapping(value="/Winterfestival.do")
	public String Winterfestival() {
		return "festival/Winterfestival";
	}
	
	@RequestMapping(value="/Fallfestival.do")
	public String Fallfestival() {
		return "festival/Fallfestival";
	}
	
	@RequestMapping(value="/Summerfestival.do")
	public String Summerfestival() {
		return "festival/Summerfestival";
	}
	
	@RequestMapping(value="/Springfestival.do")
	public String Springfestival() {
		return "festival/Springfestival";
	}
	
	/*커뮤니티*/
	/*==================================================================================================*/

	@RequestMapping(value="/BoardWrite.do")
	public String BoardWrite() {
		return "community/BoardWrite";
	}
	@RequestMapping(value="/BoardModify.do")
	public String BoardModify() {
		return "community/BoardModify";
	}
	
	@RequestMapping(value="/NoticeList.do")
	public String NoticeList() {
		return "community/NoticeList";
	}
	@RequestMapping(value="/Review.do")
	public String Review() {
		return "community/Review";
	}
	@RequestMapping(value="/Event.do")
	public String Event() {
		return "community/Event";
	}
	@RequestMapping(value="/QA.do")
	public String QA() {
		return "community/QA";
	}
	
	//주변ㅇ
	/*==================================================================================================*/

	@RequestMapping(value="/DaumGps.do")
	public String Dgps() {
		return "Gps/DaumGps";
	}
	
}



