package egov.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egov.service.CommaService;
import egov.service.CommaVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("commaService")
public class CommaServiceImpl extends EgovAbstractServiceImpl implements CommaService{
	
	@Resource(name = "commaDAO")
	private CommaDAO commaDAO;

	@Override
	public String insertMember(CommaVO vo) throws Exception {
		// TODO Auto-generated method stub
		return commaDAO.insertMember(vo);
	}

	@Override
	public int selectMemberIdcheck(CommaVO vo) throws Exception {
		// TODO Auto-generated method stub
		return commaDAO.selectMemberIdcheck(vo);
	}

	@Override
	public CommaVO selectMemberIdPwdCheck(CommaVO vo) throws Exception {
		// TODO Auto-generated method stub
		return commaDAO.selectMemberIdPwdCheck(vo);
	}

	@Override
	public CommaVO selectMyinform(CommaVO vo) throws Exception {
		// TODO Auto-generated method stub
		return commaDAO.selectMyinform(vo);
	}

	@Override
	public int updateMember(CommaVO vo) throws Exception {
		// TODO Auto-generated method stub
		return commaDAO.updateMember(vo);
	}

}


	



