package kr.co.ictedu.board.model;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardVO {

	private int bid;
	private String bname;
	private String btitle;
	private String bcontent;
	// timestamp는 시 분 초 까지 표기, date는 년 월 일만 표기합니다.
	private Timestamp bdate;
	private int bhit;
	
	// 생성자 setter/getter, toString 생성시
	// ALT + SHIFT + S / 우클릭 source
	
	// 아무것도 안 받는 생성자
	public void BoardVO() {
		
	}
	// 모든 요소를 다 받는 생성자
	public BoardVO(int bid, String bname, String btitle, String bcontent, Timestamp bdate, int bhit) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bhit = bhit;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public Timestamp getBdate() {
		return bdate;
	}

	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}

	public int getBhit() {
		return bhit;
	}

	public void setBhit(int bhit) {
		this.bhit = bhit;
	}

	@Override
	public String toString() {
		return "BoardVO [bid=" + bid + ", bname=" + bname + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bdate="
				+ bdate + ", bhit=" + bhit + "]";
	}
	
	

}
