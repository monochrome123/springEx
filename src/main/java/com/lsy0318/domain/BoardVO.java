package com.lsy0318.domain;

import java.util.Date;

public class BoardVO {

	private Integer bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date moddate;
	private Integer cnt_view;
	private Integer cnt_up;
	private Integer cnt_down;

	public Integer getBno() {
		return bno;
	}

	public void setBno(Integer bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getModdate() {
		return moddate;
	}

	public void setModdate(Date moddate) {
		this.moddate = moddate;
	}

	public Integer getCnt_view() {
		return cnt_view;
	}

	public void setCnt_view(Integer cnt_view) {
		this.cnt_view = cnt_view;
	}

	public Integer getCnt_up() {
		return cnt_up;
	}

	public void setCnt_up(Integer cnt_up) {
		this.cnt_up = cnt_up;
	}

	public Integer getCnt_down() {
		return cnt_down;
	}

	public void setCnt_down(Integer cnt_down) {
		this.cnt_down = cnt_down;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", moddate=" + moddate + ", cnt_view=" + cnt_view + ", cnt_up=" + cnt_up + ", cnt_down="
				+ cnt_down + "]";
	}

}
