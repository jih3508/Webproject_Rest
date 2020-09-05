package egov.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egov.service.BoardService;
import egov.service.BoardVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl 
					                    implements BoardService {

	@Resource(name = "boardDAO")
	private BoardDAO boardDAO;
	
	@Override
	public String insertBoard(BoardVO vo) throws Exception {
		return boardDAO.insertBoad(vo);
	}

	@Override
	public List<?> selectBoardList(BoardVO vo) throws Exception {
		return boardDAO.selectBoardList(vo);
	}

	@Override
	public BoardVO selectBoardDetail(BoardVO vo) throws Exception {
		return boardDAO.selectBoardDetail(vo);
	}

	@Override
	public int updateBoard(BoardVO vo) throws Exception {
		return boardDAO.updateBoard(vo);
	}

	@Override
	public int deleteBoard(BoardVO vo) throws Exception {
		return boardDAO.deleteBoard(vo);
	}

	@Override
	public String insertReBoard(BoardVO vo) throws Exception {
		return boardDAO.insertReBoard(vo);
	}

	@Override
	public List<?> selectReBoardList(BoardVO vo) throws Exception {
		return boardDAO.selectReBoardList(vo);
	}

	@Override
	public int selectReBoardFid() throws Exception {
		return boardDAO.selectReBoardFid();
	}

	@Override
	public BoardVO selectReBoardDetail(BoardVO vo) throws Exception {
		return boardDAO.selectReBoardDetail(vo);
	}

	@Override
	public String insertReBoardReply(BoardVO vo) throws Exception {
		return boardDAO.insertReBoardReply(vo);
	}

	@Override
	public String selectReBoardThread(BoardVO vo) throws Exception {
		return boardDAO.selectReBoardThread(vo);
	}

	@Override
	public int selectReBoardTotal(BoardVO vo) throws Exception {
		return boardDAO.selectReBoardTotal(vo);
	}

	
}





