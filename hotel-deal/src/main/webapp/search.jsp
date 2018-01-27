<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Hotel Deal</title>
	    <script type="text/javascript" src="javascript/jquery-3.1.1.min.js"></script>
		<script type="text/javascript" src="javascript/jquery-ui.min.js"></script>
		<script type="text/javascript" src="javascript/hotel-deals.js"></script>
		
		<link type="text/css" rel="stylesheet" href="css/block.css">
		<link type="text/css" rel="stylesheet" href="css/font-awesome.min.css">
		<link type="text/css" rel="stylesheet" href="css/jquery-ui.min.css">
	</head>
	
	<body style="background-color: #f1eeee">
		<form id="form">
			<input type="hidden" name="pageNo" id="pageNo" value="1" />
			<input type="hidden" name="pageSize" id="pageSize" value="100" />
			
			<div id="searchWrapper">
				<div id="searchForm">
					<span class="my-row search-form-title">Search Hotels</span>
					
					<div id="goingToDiv">
						<span class="my-row search-form-label">Going to</span>
						<input type="text" class="search-form-input" name="destinationName" placeholder="Destination, hotel name, airport, landmark, or address"/>
					</div>
					
					<div id="dateDiv">
						<div id="checkInDiv" class="quarter-div">
							<span class="my-row search-form-label">Check-in</span>
							<input id="checkInDate" type="date" class="dateTxt" placeholder="DD/MM/YYYY" name="minTripStartDate">			
						</div>
						
						<div id="checkOutDiv" class="quarter-div">
							<span class="my-row search-form-label">Check-out</span>
							<input id="checkOutDate" type="date" class="dateTxt" placeholder="DD/MM/YYYY" name="maxTripStartDate">			
						</div>
					</div>
					
					<div id="searchBtnDiv" class="quarter-div">
						<input type="button" value="Search" id="searchBtn">
					</div>
				</div>
			</div>
		</form>
		
		<div title="Result" id="deals">
		</div>
	</body>
</html>
