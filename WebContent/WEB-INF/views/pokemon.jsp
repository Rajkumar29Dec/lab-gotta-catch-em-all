<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GOTTA CATCH' EM ALL</title>
<link rel="stylesheet" href="style.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<form action="/lap-java-gotta_catchem_all/pokemon" method="post" id="myForm">
		<div class="mainframe">
			<h1 class="heading">GOTTA CATCH' EM ALL </h1>
			<div class="cardposition">
				<div class="card1">
					<button class="card1Image" name="card1" id = "show1" onclick = "myfunction1()"></button>					
           			
				</div>
				<div class="card2">
					<button class="card2Image" name="card2" onclick = "myfunction2()"></button>
					
				</div>
				<div class="card3">
					<button class="card3Image" name="card3" onclick = "myfunction3()"></button>
					
           		</div>
				
				<div class="card4">
					<button class="card4Image" name="card4" onclick = "myfunction4()"></button>
					
				</div>
				<div class="card5">
					<button class="card5Image" name="card5" onclick = "myfunction5()"></button>
					
				</div>
				</div>
				
				<div class = "popup1" id = "popup1">
					<div class="card1centered" id = "bm"> ${message1}</div>
           			<div class="card1centered1" id = "bc"> ${character1}</div>
           			<div class="card1centered2" id = "bt"> ${type1}</div>
           			<div class="card1centered3" id = "be"> ${evolution1}</div>
           			<div class="card1centered4" id = "bb"> ${baseExp1}</div>
    				<img src="./assets/Card 2.png" >  
    				<a href="javascript:void(0)" id = "close1" class="closebtn" onclick="closeForm5()">&times;</a>
           			<!-- <img  class = "image1" src = "assets/Card 2.png" id = "img1" alt="Show/Hide Image" style="display:none" > -->           			
           		</div>
           		<div class = "popup2" id = "popup2">
					<div class="card2centered" id = "cm"> ${message2}</div>
           			<div class="card2centered1" id = "cc"> ${character2}</div>
           			<div class="card2centered2" id = "ct"> ${type2}</div>
           			<div class="card2centered3" id = "ce"> ${evolution2}</div>
           			<div class="card2centered4" id = "cb"> ${baseExp2}</div>
           			<a href="javascript:void(0)" id = "close2"class="closebtn" onclick="closeForm5()">&times;</a>
           			<img src="./assets/Card 3.png" >
   				</div>   				
   				<div class = "popup3" id = "popup3">
					<div class="card3centered" id = "dm"> ${message3}</div>
           			<div class="card3centered1" id = "dc"> ${character3}</div>
           			<div class="card3centered2" id = "dt"> ${type3}</div>
           			<div class="card3centered3" id = "de"> ${evolution3}</div>
           			<div class="card3centered4" id = "db"> ${baseExp3}</div>
           			<a href="javascript:void(0)" id = "close3"class="closebtn" onclick="closeForm5()">&times;</a>
           			<img src="./assets/Card 5.png" >
				</div>
				<div class = "popup4" id = "popup4">
					<div class="card4centered" id = "mm"> ${message4}</div>
           			<div class="card4centered1" id = "mc"> ${character4}</div>
           			<div class="card4centered2" id = "mt"> ${type4}</div>
           			<div class="card4centered3" id = "me"> ${evolution4}</div>
           			<div class="card4centered4" id = "mb"> ${baseExp4}</div>
           			<a href="javascript:void(0)" id = "close4"class="closebtn" onclick="closeForm5()">&times;</a>
           			<img src = "./assets/Card 4.png">
           		</div>
           		<div class = "popup5" id = "popup5">
					<div class="card5centered" id = "pm"> ${message5}</div>
           			<div class="card5centered1" id = "pc"> ${character5}</div>
           			<div class="card5centered2" id = "pt"> ${type5}</div>
           			<div class="card5centered3" id = "pe"> ${evolution5}</div>
           			<div class="card5centered4" id = "pb"> ${baseExp5}</div>
           			<a href="javascript:void(0)" id = "close5" class="closebtn" onclick="closeForm5()">&times;</a>
           			<img src = "./assets/Card 1.png" >
           		</div>
			
		</div>
		<div class = "footers">Made with <img src = "./assets/prograd-heart.svg"> by ProGrad</div>
	</form>
</body>
<script type="text/javascript" src="./script/script.js"></script>
</html>