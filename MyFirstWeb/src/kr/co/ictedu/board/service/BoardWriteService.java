package kr.co.ictedu.board.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

// 구현클래스이기 때문에 implements를 합니다.
public class BoardWriteService implements IBoardService {

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 세션 쓰는법
		HttpSession session = null;
		session = request.getSession();
		String idSession = (String)session.getAttribute("i_s");
		
		if(idSession == null) {
			try {
				String ui = "/users/user_login.jsp";
				RequestDispatcher dp = request.getRequestDispatcher(ui);
				dp.forward(request, response);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
				
		// getParameter로 폼에서 쏜 데이터를 들고오게 해 주세요.
		try {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String bWriter = request.getParameter("writer");
		String bTitle = request.getParameter("title");
		String bContent = request.getParameter("content");
		// DAO 생성
		BoardDAO dao = BoardDAO.getInstance();
		// VO 생성
		BoardVO board = new BoardVO();
		
		board.setBname(bWriter);
		board.setBtitle(bTitle);
		board.setBcontent(bContent);
		int resultCode = dao.write(board);
		if(resultCode == 1) {
			System.out.println("DB에 글이 잘 입력되었습니다.");
		} else if(resultCode == 0) {
			System.out.println("에러 발생으로 글이 입력되지 않았습니다.");
		}
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
