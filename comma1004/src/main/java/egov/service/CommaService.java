package egov.service;



public interface CommaService {
	public String insertMember(CommaVO vo) throws Exception;
	public int selectMemberIdcheck(CommaVO vo) throws Exception;
	public CommaVO selectMemberIdPwdCheck(CommaVO vo) throws Exception;
	public CommaVO selectMyinform(CommaVO vo) throws Exception;
	public int updateMember(CommaVO vo) throws Exception;

}
