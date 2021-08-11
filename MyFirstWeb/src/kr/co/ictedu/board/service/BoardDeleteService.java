package kr.co.ictedu.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;

// IBoardService 인터페이스 구현
public class BoardDeleteService implements IBoardService {
// execute 메서드 오버라이딩
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// bid 파라미터 (board_detail.jsp 페이지에서 post방식으로 날려준) 받기
		String bid = request.getParameter("bid");
		// DAO 생성
		BoardDAO dao = BoardDAO.getInstance();
		// DELETE로직에 bid 넣어서 실행
		dao.deleteBoard(bid);
				
}

}