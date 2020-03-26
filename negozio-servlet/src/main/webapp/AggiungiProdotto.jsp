<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aggiungi</title>
</head>
<body>
	
<h1>Aggiungi prodotto</h1>
<form action="AggiungiProdotto" method="post">
  <label for="nomeProdotto">Dimmi il nome del prodotto</label>
  <input type="text" id="nomeProdotto" name="nomeProdotto"><br><br>
  <label for="quantita">Inserisci la quantità</label >
  <input type="number" id="quantita" name="quantita"><br><br>
  <label for="prezzo">Inserisci il prezzo</label>
  <input type="text" id="prezzo" name="prezzo"><br><br>
  <label for="descrizione">Dammi una descrizione del prodotto</label>
  <input type="text" id="descrizione" name="descrizione"><br><br>
  <input type="submit" style="width:120px; height:45px;" value="AggiungiProdotto">
  </form><br><br>
  
<form action="HomePage.jsp">
  <input type="submit" value="Torna Indietro">
  </form>

</body>
</html>