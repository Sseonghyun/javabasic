package kr.co.ictedu.board.service;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;
//IBoardService 구현하기.
public class BoardUpdateService implements IBoardService {
// 오버라이딩된 메서드 내부 작성하기
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 1. 파라미터 6개 받아오기
		String strbid = request.getParameter("id");
		int bid = Integer.parseInt(strbid);
		String btitle = request.getParameter("title");
		String bcontent = request.getParameter("content");
		String tmbdate = request.getParameter("date");
		Timestamp bdate = Timestamp.valueOf(tmbdate);
		String strbhit = request.getParameter("hit");
		int bhit = Integer.parseInt(strbhit);
		String bname = request.getParameter("name");
		
		// 2. VO생성해서 세터로 저장하기
		BoardVO board = new BoardVO();
		board.setBid(bid);
		board.setBtitle(btitle);
		board.setBcontent(bcontent);
		board.setBdate(bdate);
		board.setBhit(bhit);
		board.setBname(bname);
		
		// 3. DAO 생성 및 update로직 호출 (update로직은 직접작성해주세요)
		BoardDAO dao = BoardDAO.getInstance();
		dao.updateBoard(board);
		
	}
}
