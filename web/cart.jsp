<%-- 
    Document   : home
    Created on : Oct 22, 2020, 4:15:23 PM
    Author     : liemn
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Shopping Cart</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/shop-homepage.css" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

    </head>

    <body>

        <!-- Navigation -->
        <%@include file="menu.jsp" %>

        <!--container-->
        <div class="container" style="margin-top: 7rem;margin-bottom: 7rem">
            <c:choose>
                <c:when test="${listCart == null || listCart.size() == 0}">
                    Shopping Cart Empty
                    <a href="home" class="btn btn-primary">Back home</a>
                </c:when>
                <c:otherwise>
                    <div class="mt-3">
                        <h4>Shopping Cart</h4>
                        <form id="formQuantity" action="sync-cart" method="get">
                            <table class="w-100 table table-striped mt-3">
                                <thead>
                                    <tr><th>STT</th>
                                        <th>Image</th>
                                        <th>Name of Product</th>
                                        <th>Price</th>
                                        <th>Quantity</th>
                                        <th>Total Price</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${requestScope.listCart}" var="c" varStatus="counter">
                                        <tr>
                                            
                                            <td>${counter.count}</td>
                                            <td>
                                                <img src="images/${c.productImg}" style="width: 100px">
                                            </td>
                                            <td>${c.productName}</td>
                                            <td>
                                                <fmt:formatNumber type="number" value="${c.productPrice}"/>
                                            </td>
                                            <td>
                                                <input type="number" min="1" max="${c.productQuantity}" value="${c.quantity}" name="quantity${counter.count - 1}" class="pl-1" style="width: 60px"/>
                                            </td>
                                            <td>
                                                <fmt:formatNumber type="number" value="${c.quantity * c.productPrice}"/>
                                            </td>
                                            <td>
                                                <a href="delete-cart?productId=${c.productId}" class="btn btn-danger"><i class="fas fa-trash"></i></a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>

                            </table>
                            <hr/>
                            <div class="text-right">
                                <h4>Total:<fmt:formatNumber type="number" value="${requestScope.totalPrice}"/></h4>
                            </div>
                            <hr/>
                            <div class="text-right">                                

                                <button type="submit" class="btn btn-info ml-2"><i class="fas fa-sync-alt mr-2"></i>Update Cart</button>
                                <a href="checkout" class="btn btn-success ml-2">Continue
                                    <i class="fas fa-arrow-right ml-2"></i>
                                </a>
                            </div>
                        </form>
                    </div>
                </c:otherwise>
            </c:choose>

        </div>
        <!-- /.container -->

        <!-- Footer -->
        <%@include file="footer.jsp" %>

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>

</html>

