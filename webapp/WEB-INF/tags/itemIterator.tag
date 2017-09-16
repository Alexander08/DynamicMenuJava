<%@ attribute name="listItem" type="java.util.ArrayList" required="true"%>

<%@ taglib tagdir="/WEB-INF/tags/" prefix="menu"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach var="menuItem" items="${listItem}">

	<c:choose>
		<c:when test="${not menuItem.getHasChildren()}">
			<li>
				<a href="${pageContext.request.contextPath}/${menuItem.getItemURI()}">${menuItem.getItemName()}</a>
			</li>
		</c:when>
		
		<c:otherwise>
			<li class="dropdown">
				<a class="dropdown-toggle" data-toggle="dropdown" href="#">${menuItem.getItemName()}<span class="caret"></span></a>

				<ul class="dropdown-menu">
					<menu:itemIterator listItem="${menuItem.getPageChildren()}" />
				</ul>
			</li>
		</c:otherwise>

	</c:choose>
</c:forEach>
