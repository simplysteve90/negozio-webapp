package it.dstech.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerScelta extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name1 = req.getParameter("name1");
		String name2 = req.getParameter("name2");
		String name3 = req.getParameter("name3");
		String name4 = req.getParameter("name4");
		String name5 = req.getParameter("name5");
		System.out.println(name1);
		System.out.println(name2);
		if (name1 != null) {
			req.getRequestDispatcher("StampaMagazzino.jsp").forward(req, resp);
		}else if(name2 !=null) {
			req.getRequestDispatcher("AggiungiProdotto.jsp").forward(req, resp);
		}else if(name3 !=null) {
			req.getRequestDispatcher("VendiProdotto.jsp").forward(req, resp); }
		else if(name4 !=null) {
			req.getRequestDispatcher("ProdottiVenduti.jsp").forward(req, resp); }
		else if(name5 !=null) {
			req.getRequestDispatcher("Bonus.jsp").forward(req, resp); }
	}

}
