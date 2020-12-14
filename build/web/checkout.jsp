<%-- 
    Document   : home
    Created on : Oct 22, 2020, 4:15:23 PM
    Author     : ThinkPro
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

        <title>Shipping Page</title>

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
        <div class="container" style="margin-top: 5rem">
            <div class="row">
                <div class="col-md-8" style="border: 1px solid #ced4da;border-radius: 5px !important">
                    <h4 class="mt-3">List of Product</h4>
                    <table class="w-100 table table-striped mt-3">   
                        <tr>
                            <th>STT</th>
                            <th>Image</th>
                            <th>Name of Product</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total Price</th>
                        </tr>
                            <tr>
                                <td>1</td>
                                <td>
                                    <img src="images/1.jpg" style="width: 100px">
                                </td>
                                <td>Product Name</td>
                                <td>
                                    <fmt:formatNumber type="currency" value="50"/>
                                </td>
                                <td>
                                    <input type="number" min="1" max="20" value="1" class="pl-1" style="width: 60px"/>
                                </td>
                                <td>
                                    <fmt:formatNumber type="currency" value="100"/>
                                </td>
                                <td>
                                    <a href="#" class="btn btn-danger"><i class="fas fa-trash"></i></a>
                                </td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>
                                    <img src="images/1.jpg" style="width: 100px">
                                </td>
                                <td>Product Name</td>
                                <td>
                                    <fmt:formatNumber type="currency" value="50"/>
                                </td>
                                <td>
                                    <input type="number" min="1" max="20" value="1" class="pl-1" style="width: 60px"/>
                                </td>
                                <td>
                                    <fmt:formatNumber type="currency" value="100"/>
                                </td>
                                <td>
                                    <a href="#" class="btn btn-danger"><i class="fas fa-trash"></i></a>
                                </td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>
                                    <img src="images/1.jpg" style="width: 100px">
                                </td>
                                <td>Product Name</td>
                                <td>
                                    <fmt:formatNumber type="currency" value="50"/>
                                </td>
                                <td>
                                    <input type="number" min="1" max="20" value="1" class="pl-1" style="width: 60px"/>
                                </td>
                                <td>
                                    <fmt:formatNumber type="currency" value="100"/>
                                </td>
                                <td>
                                    <a href="#" class="btn btn-danger"><i class="fas fa-trash"></i></a>
                                </td>
                            </tr>
                    </table>
                    <hr/>
                    <div class="text-right">
                        <h4>Total price:<fmt:formatNumber type="currency" value="100"/></h4>
                    </div>
                </div>
                <div class="col-md-4 pl-5" style="border: 1px solid #ced4da;border-radius: 5px !important;">
                    <h3 class="mt-3" style="color: orange">Infomation of Customer</h3>
                    <div class="card mt-3">
                        <div class="card-body">
                            <form action="checkout" method="post">
                                <div class="form-group">
                                    <label for="name">Full Name</label>
                                    <input type="text" name="name" class="form-control" placeholder="Enter name" required>
                                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                </div>
                                <div class="form-group">
                                    <label for="sdt">Phone number</label>
                                    <input type="number" name="mobile" class="form-control" placeholder="enter phone number" required>
                                </div>
                                <div class="form-group">
                                    <label for="address">Address</label>
                                    <textarea class="form-control" rows="3" name="address" required></textarea>
                                </div><div class="form-group">
                                    <label for="address">Note</label>
                                    <textarea class="form-control" rows="3" name="note"></textarea>
                                </div>

                                <button type="submit" class="btn btn-success w-100">Accept</button>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <!-- /.container
        -->

        <!-- Footer -->
        <%@include file="footer.jsp" %>

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>

</html>

