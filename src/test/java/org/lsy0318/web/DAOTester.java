package org.lsy0318.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lsy0318.domain.BoardVO;
import com.lsy0318.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class DAOTester {
	
	@Inject
	BoardDAO dao;

	@Test
	public void test() throws Exception {
		
		BoardVO vo = new BoardVO();
		vo.setBno(1);

		System.out.println(dao.read("readBoard", 1).toString());

	}

}
