<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon"
	href="https://img.icons8.com/cotton/64/000000/banana.png" />
<meta charset="ISO-8859-1">
<title>Negozio</title>
<style>
.button {
	display: inline-block;
	padding: 12px 20px;
	font-size: 22px;
	cursor: pointer;
	text-align: center;
	text-decoration: underline;
	outline: none;
	color: #fff;
	background-color: #4CAF50;
	border: 1px;
	border-radius: 20px;
	box-shadow: 0 7px #999;
}

.button:hover {
	background-color: #3e8e41
}

.button:active {
	background-color: #3e8e41;
	box-shadow: 0 5px #666;
	transform: translateY(4px);
}



</style>
</head>
<body>
	<form action="SceltaAzione">
		<button class="button" value="1" name="name1">STAMPA STATO MAGAZZINO</button>
		<br><br>
		<button class="button" value="2" name="name2">AGGIUNGI PRODOTTO</button>
		<br><br>
		<button class="button" value="3" name="name3">VENDI PRODOTTO</button>
		<br><br>
		<button class="button" value="4" name="name4">STAMPA PRODOTTI VENDUTI</button>
		<br><br>
		<button class="button" value="5" name="name5">CODICI SCONTO</button>
		<br><br>
		
		




	</form>
	<br>


</body>
</html>