package com.lsy0318.persistence;

import org.springframework.stereotype.Repository;

import com.lsy0318.domain.BoardVO;
import com.lsy0318.util.AbstractDAO;

@Repository
public class BoardDAO extends AbstractDAO<BoardVO, Integer> {

	public BoardDAO() {
		this.NAME = "com.lsy0318.mapper.BoardMapper";
	}

}
