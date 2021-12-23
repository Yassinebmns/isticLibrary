<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>ISTIC Library</title>
		<meta name="author" content="Mohamed Adem Ben Moussa">
		<meta name="author" content="Mohamed Mehdi Charni">
		<meta name="author" content="Yassine Ben Mansour">
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="Website for ISTIC Library Management">
		<meta name="keywords" content="ISTIC Library, ISITC, Library">
		<link rel="shortcut icon" type="image/png" href="images/icon.png">
		<link rel="stylesheet" type="text/css" href="css/uikit/uikit.min.css">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<script type="text/javascript" src="js/jquery/jquery.min.js"></script>
	</head>
	<body>
	
		<div id="preloader">
			<div id="status">
				&nbsp;
			</div>
		</div>
	
		<nav class="uk-navbar-container uk-navbar-transparent" uk-navbar>
		    <div class="uk-navbar-left">
		        <a class="uk-navbar-item uk-logo" href="index.jsp"><img alt="ISTIC Library Logo" src="images/logo-light.png" width="200px" height="100px;"></a>
		    </div>
		    <div class="uk-navbar-right" style="margin-right: 25px;">
		    	<ul class="uk-navbar-nav">
		            <li>
		                <a href="index.jsp" class="active">
		                    <span class="uk-icon uk-margin-small-right" uk-icon="icon: home; ratio: 1.5"></span>
		                    <b>Home</b>
		                </a>
		            </li>
		            <li>
		                <a href="search.html">
		                    <span class="uk-icon uk-margin-small-right" uk-icon="icon: search; ratio: 1.5"></span>
		                    <b>Search</b>
		                </a>
		            </li>
		            <li>
		                <button class="uk-button" style="background-color: rgb(237, 28, 36); color: rgb(255, 255, 255) !important; border-radius: .25rem; height: 40px; margin-top: 19px; padding-right: 17px;" uk-toggle="target: #signin">
		                    <b>Admin</b>
		                    <span class="uk-icon" uk-icon="icon: link; ratio: 1.5"></span>
		                </button>
		            </li>
		        </ul>
		    </div>
		</nav>
		
		<section>
		<div id="home" class="uk-flex uk-flex-center">
			<div class="uk-card uk-card-default uk-width-5-6">
			    <div class="uk-card-header">
			        <div class="uk-grid-small uk-flex-middle" uk-grid>
			            <div class="uk-width-auto">
			                <img class="uk-border-circle" width="100" height="100" src="images/icon.png">
			            </div>
			            <div class="uk-width-expand uk-text-center">
			                <h3 style="font-size: 40px; font-weight: bold;" class="uk-card-title uk-margin-remove-bottom">Welcome to <span style="color: #ED1C24; border-top: 2px solid #ED1C24; border-bottom: 2px solid #ED1C24;">ISTIC Library</span></h3>
			            </div>
			        </div>
			    </div>
			    <div uk-filter="target: .js-filter" class="uk-card-body uk-padding-remove-bottom" style="overflow-y: scroll; height: 75vh; scrollbar-width: none;">
			        <div class="uk-section uk-section-default uk-padding-remove-top">
					        <h3>Browse by Category</h3>	
							<div class="uk-position-relative uk-visible-toggle" tabindex="-1" uk-slider>

							    <ul class="uk-slider-items uk-child-width-1-6 uk-text-center">
							        <li uk-filter-control=".general">
							            <a href="#"><img src="images/category/general.jpg" style="border-radius: 0.25rem; width: 100px; height: 150px;"></a>
							        </li>
							        <li uk-filter-control=".psychology">
							            <a href="#"><img src="images/category/psychology.jpg" style="border-radius: 0.25rem; width: 100px; height: 150px;"></a>
							        </li>
							        <li uk-filter-control=".religion">
							            <a href="#"><img src="images/category/religion.jpg" style="border-radius: 0.25rem; width: 100px; height: 150px;"></a>
							        </li>
							        <li uk-filter-control=".social">
							            <a href="#"><img src="images/category/social.jpg" style="border-radius: 0.25rem; width: 100px; height: 150px;"></a>
							        </li>
							        <li uk-filter-control=".languages">
							            <a href="#"><img src="images/category/languages.jpg" style="border-radius: 0.25rem; width: 100px; height: 150px;"></a>
							        </li>
							        <li uk-filter-control=".science">
							            <a href="#"><img src="images/category/science.jpg" style="border-radius: 0.25rem; width: 100px; height: 150px;"></a>
							        </li>
							        <li uk-filter-control=".technology">
							            <a href="#"><img src="images/category/technology.jpg" style="border-radius: 0.25rem; width: 100px; height: 150px;"></a>
							        </li>
							        <li uk-filter-control=".art">
							            <a href="#"><img src="images/category/art.jpg" style="border-radius: 0.25rem; width: 100px; height: 150px;"></a>
							        </li>
							        <li uk-filter-control=".literature">
							            <a href="#"><img src="images/category/literature.jpg"  style="border-radius: 0.25rem; width: 100px; height: 150px;"></a>
							        </li>
							        <li uk-filter-control=".history">
							            <a href="#"><img src="images/category/history.jpg"  style="border-radius: 0.25rem; width: 100px; height: 150px;"></a>
							        </li>
							    </ul>
							
							    <a class="uk-position-center-left" href="#" uk-slidenav-previous uk-slider-item="previous" style="color: #333;"></a>
							    <a class="uk-position-center-right" href="#" uk-slidenav-next uk-slider-item="next" style="color: #333;"></a>
							
							</div>
					</div>
					<script>
						function DisplayBook(id, title, author, type, image)
						{
							$("#book").html("<div uk-grid><div class='uk-width-1-3'><img id='"+id+"' src='images/books/"+image+"' style='border-radius: 0.25rem; width: 100px; height: 150px;'></div><div class='uk-width-2-3 uk-margin-small-top'><h3 class='uk-text-center'>"+title+"</h3><small>By <b>"+author+"</b></small></div><label for='date' class='uk-margin-remove-bottom'>Reserve Date :</label><div class='uk-text-center'><input id='date' name='date' type='date' class='uk-input' style='width: 480px;' required><input id='id' name='id' type='text' class='uk-input' style='width: 480px;' value='"+id+"' hidden></div></div>");
						}
					</script>
					<div class="uk-section uk-section-default uk-padding-remove-top">
					<h3>Books</h3>
					<center><a uk-filter-control=".all" href="#">Display all Books</a></center><br>
						<ul id="books" class="js-filter uk-child-width-1-6 uk-text-center" uk-grid>
					        <c:forEach items="${books}" var="B">
						        <li class="all ${B.type}">
						            <img src="images/books/${B.image}" style="border-radius: 0.25rem; width: 100px; height: 150px;">
						            <div class="uk-text-center uk-margin-small-top"><a href="#reserve" uk-toggle style="color: #ED1C24;" onclick="DisplayBook('${B.id}','${B.title}','${B.author}','${B.type}','${B.image}');">${B.title}</a></div>
						        </li>
					        </c:forEach>
					    </ul>
				    </div>
			    </div>
			    <div class="uk-card-footer uk-text-center" style="padding: 30px;">
			        <p style="color: #333; line-height: 20px; margin: 0;">
						Copyright &copy; 2020 All Rights Reserved By <a style="color: #ED1C24;" href="https://www.facebook.com/MedAdem.BenMoussa" target="_blank">Mohamed Adem Ben Moussa</a> & <a style="color: #ED1C24;" href="https://www.facebook.com/RenGodyr" target="_blank">Mohamed Mehdi Charni</a> & <a style="color: #ED1C24;" href="https://www.facebook.com/F5ociety" target="_blank">Yassine Ben Mansour</a>.
					</p>
			    </div>
			</div>
		</div>
		<br><br>
		</section>
		
		<!-- Admin Sign in Modal -->
		<div id="signin" class="uk-flex-top" uk-modal>
		    <div class="uk-modal-dialog uk-modal-body uk-margin-auto-vertical">

		        <button class="uk-modal-close-default" type="button" uk-close></button>
		
		        <div class="uk-modal-header uk-text-center">
		        		<span class="uk-margin-remove-bottom" uk-icon="icon: user; ratio: 3.5" style="color: #ED1C24; border: 4px solid #ED1C24; border-radius: 35%"></span>
			            <h2 class="uk-modal-title uk-margin-small-top" style="font-size: 30px; font-weight: bold; color: #ED1C24; letter-spacing: 4px; text-transform: uppercase;">Admin Login</h2>
			    </div>
			   	<form method="POST" action="login">
				    <div class="uk-modal-body">
							<label for="cin" class="uk-margin-medium-bottom">CIN :</label>
							<input id="cin" name="cin" class="uk-input uk-width-1-1" type="text" placeholder="Cin" pattern="[0-9]{8}" required><br><br>
							
							<label for="password" class="uk-margin-medium-bottom">Password :</label>
							<input id="password" name="password" class="uk-input uk-width-1-1" type="password" placeholder="Password" required>
						
				    </div>
				    <div class="uk-modal-footer uk-text-center">
				            <button class="uk-button uk-button-primary uk-width-1-1" type="submit" style="background-color: rgb(237, 28, 36); color: rgb(255, 255, 255) !important; border-radius: .25rem; height: 40px; text-transform: uppercase; letter-spacing: 2px;">LOGIN</button>
				    </div>
				</form>
			</div>
		</div>
		
		<!-- Reserve a Book -->
		<div id=reserve class="uk-flex-top" uk-modal>
		    <div class="uk-modal-dialog uk-modal-body uk-margin-auto-vertical">

		        <button class="uk-modal-close-default" type="button" uk-close></button>
		
		        <div class="uk-modal-header uk-text-center">
			            <h2 class="uk-modal-title uk-margin-small-top" style="font-size: 30px; font-weight: bold; color: #ED1C24; letter-spacing: 4px; text-transform: uppercase;">Reserve a Book</h2>
			    </div>
			   	<form method="POST" action="reserve">
				    <div id="book" class="uk-modal-body">
						
				    </div>
				    <div class="uk-modal-footer uk-text-center">
				            <button class="uk-button uk-button-primary uk-width-1-1" type="submit" style="background-color: rgb(237, 28, 36); color: rgb(255, 255, 255) !important; border-radius: .25rem; height: 40px; text-transform: uppercase; letter-spacing: 2px;">Reserve</button>
				    </div>
				</form>
			</div>
		</div>
	
		<script type="text/javascript" src="js/uikit/uikit.min.js"></script>
		<script type="text/javascript" src="js/uikit/uikit-icons.min.js"></script>
		<script type="text/javascript" src="js/script.js"></script>
	</body>
</html>