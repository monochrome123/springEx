package com.lsy0318.web;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lsy0318.persistence.TimeDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Inject
	private TimeDAO dao;

	@GetMapping("/getTime")
	public String home(Model model) {
		logger.info("Welcome home!");

		model.addAttribute("serverTime", dao.getTime());

		return "home";
	}
	
	@GetMapping("/")
	public String index(HttpServletRequest request) {
		logger.debug("###INDEX PAGE###");

		String rtnPage = "index";
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		if (ipAddress == null) {
			ipAddress = request.getRemoteAddr();
		}

		logger.info(ipAddress + " : " + rtnPage);

		return rtnPage;
	}

}
