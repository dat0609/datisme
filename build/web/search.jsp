<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>The Collector - Search Page</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/business-frontpage.css" rel="stylesheet">

    </head>

    <body>

        <%@include file="menu.jsp" %>

        <!-- Header -->
        <header class="bg-primary py-5 mb-5"  style="background-image: url('images/br1.jfif') " >

            <div class="container h-100" >
                <div class="row h-100 align-items-center">
                    <div class="col-lg-12">

                        <h1 class="display-4 text-white mt-5 mb-2">Expand your knowledge</h1>
                        <p class="lead mb-5 text-white-50">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Non possimus ab labore provident mollitia. Id assumenda voluptate earum corporis facere quibusdam quisquam iste ipsa cumque unde nisi, totam quas ipsam.</p>
                    </div>
                </div>
            </div>
        </header>

        <!-- Page Content -->
        <div class="container">

            <div class="row">
                <div class="col-md-8 mb-5">
                    <h2>What We Do</h2>
                    <hr>
                    <p>Come alone, leave with a new lesson!</p>
                </div>
                <div class="col-md-4 mb-5">
                    <c:if test="${sessionScope.user != null}">
                        <h2>Welcome ${sessionScope.user.name}</h2>
                    </c:if>
                    <hr>
                    <p>Looking For Something!</p>

                    <form class="form-inline my-2 my-lg-0" action="search" method="post">
                        <input name="keyword" class="form-control mr-sm-2" value="${keyword}" type="search" placeholder="Search" aria-label="Search">
                        
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>                    
                    </form>

                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <c:forEach items="${listSearchProduct}" var="p">
                    <div class="col-md-4 mb-5">
                        <div class="card h-100">
                            <img class="card-img-top" src="images/${p.image}" width="200" height="300" alt="">
                            <div class="card-body">
                                <h4 class="card-title">${p.product_name}</h4>
                                <h5>${p.price} VND</h5>
                                <p class="card-text">${p.description}</p>
                            </div>
                            <div class="card-footer">
                                <a href="addToCart?productId=${p.product_id}" class="btn btn-primary">Add To Cart</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>

            <!-- /.row -->
            <nav aria-label="..." class="d-flex justify-content-center">
                <ul class="pagination pagination-lg">
                    <c:forEach begin="1" end="${totalPage}" var="i"> 
                        <c:choose>
                            <c:when test="${PageIndex == i}">
                                <li class="page-item active" aria-current="page">
                                    <span class="page-link">
                                        ${i}
                                        <span class="sr-only">(current)</span>
                                    </span>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="page-item"><a class="page-link" href="home?pageIndex=${i}">${i}</a></li>
                                </c:otherwise>
                            </c:choose>

                    </c:forEach>
                </ul>
            </nav>
        </div>
        <!-- /.container -->

        <!-- Footer -->
        <%@include file="footer.jsp" %>

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>

</html>
