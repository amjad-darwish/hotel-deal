<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.hotel.deal.dto.criteria.DealResultDTO" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<c:choose>
	<c:when test="${empty hotels}">
		<span id="errorMsg">No Data Found</span>	
	</c:when>
	<c:otherwise>
		<c:forEach items="${hotels}" var="hotel">
		 	<div class="block">
		 		<div class="hImage">
					<img src="${hotel.hotelImageUrl}" alt="Smiley face" id="img1">
				</div>
				
				<div class="hInfo">
					<div id="hNameAndRank" class="my-row">
						<a id="hName" href=""><c:out value="${hotel.hotelName}"></c:out></a>
						
						<fmt:parseNumber var="rating" type="number" value="${hotel.hotelRating}" />
						
						<c:forEach begin="1" end="5" var="count">
		 					<c:choose>
			 					<c:when test="${count le rating}">
			 						<i class="fa fa-star star-color" aria-hidden="true"></i>
			 					</c:when>
			 					<c:when test="${count-0.5 eq rating}">
			 						<i class="fa fa-star-half star-color" aria-hidden="true"></i>
			 					</c:when>
		 					</c:choose>
		 				</c:forEach>
					</div>
		
					<span class="my-row" id="hLocation"><c:out value="${hotel.destinationName}"></c:out></span>
					<span class="my-row" id="hLocation"><c:out value="${hotel.destinationName}"></c:out></span>
				</div>
				
				<div class="hPrice">
					<span class="my-row">${hotel.hotelRating}</span>
					
					<div><a href="" class="my-row" >(142 reviews)</a></div>
					
					<div id="price" class="my-row">
						<fmt:formatNumber currencyCode="${hotel.currency}" value="${hotel.averagePricePerNight}" var="oldAmount" type="currency" />
						<fmt:formatNumber currencyCode="${hotel.currency}" value="${hotel.averagePricePerNight}" var="newAmount" type="currency" />
						
						<span id="oldPrice">${oldAmount}</span>
						<span id="newPrice">${newAmount}</span>
					</div>
					
					<span class="my-row">Avg/night</span>
					<span class="my-row">sale</span>
				</div>
			</div>
		</c:forEach>
	</c:otherwise>
</c:choose>