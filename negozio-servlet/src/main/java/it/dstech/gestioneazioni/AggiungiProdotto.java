package it.dstech.gestioneazioni;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.gestioneprodotti.Prodotto;

public class AggiungiProdotto extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome= req.getParameter("name");
		String descrizione= req.getParameter("descrizione");
		long qta= Long.parseLong(req.getParameter("quantita"));
		double prezzo= Double.parseDouble(req.getParameter("prezzo"));
		Prodotto p= new Prodotto(nome, descrizione, qta, prezzo);
		req.getRequestDispatcher("AggiungiProdotto.java").forward(req, resp);
		
		
	
		
	}

}
