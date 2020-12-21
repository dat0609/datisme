<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta http-equiv="X-UA-Compatible" content="ie=edge" />
        <title>Add Product - Dashboard </title>
        <link
            rel="stylesheet"
            href="https://fonts.googleapis.com/css?family=Roboto:400,700"
            />
        <!-- https://fonts.google.com/specimen/Roboto -->
        <link rel="stylesheet" href="css/fontawesome.min.css" />
        <!-- https://fontawesome.com/ -->
        <link href="vendor/jquery/jquery-ui.min.css" rel="stylesheet" type="text/css"/>
        <script src="vendor/jquery/jquery-ui.min.js" type="text/javascript"></script>
        <!-- http://api.jqueryui.com/datepicker/ -->
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <!-- https://getbootstrap.com/ -->
        <link rel="stylesheet" href="css/templatemo-style.css">
        <!--
            Product Admin CSS Template
            https://templatemo.com/tm-524-product-admin
        -->

    </head>


    <body>
        <div class="container">
            <div class="container tm-mt-big tm-mb-big">
                <div class="row">
                    <div class="col-xl-9 col-lg-8 col-md-12 col-sm-8 mx-auto">
                        <div class="tm-bg-primary-dark tm-block tm-block-h-auto">
                            <div class="row">
                                <div class="col-6">

                                    <h1 class="tm-block-title d-inline-block">Update Product</h1>
                                </div>
                            </div>
                            <div class="row tm-edit-product-row">
                                <form action="edit-product" class="tm-edit-product-form" method="post">
                                    <div class="col-xl-6 col-lg-6 col-md-12">


                                        <div class="form-group mb-3">
                                            <label
                                                for="name"
                                                >Product Name
                                            </label>
                                            <input
                                                id="name"
                                                name="name"
                                                type="text"
                                                value="${sessionScope.product.product_name}"
                                                class="form-control validate"
                                                required
                                                />
                                        </div>

                                        <div class="form-group mb-3">
                                            <label
                                                for="name"
                                                >Product Price
                                            </label>
                                            <input
                                                id="name"
                                                name="price"
                                                value="${sessionScope.product.price}"
                                                type="text"
                                                class="form-control validate"
                                                required
                                                />
                                        </div>

                                        <div class="form-group mb-3">
                                            <label

                                                for="description" 
                                                >Description</label>
                                            <textarea

                                                name="description"
                                                class="form-control validate"

                                                rows="3"
                                                required
                                                ></textarea>
                                        </div>
                                        <div class="row">
                                            <div class="form-group mb-3 col-xs-12 col-sm-6">
                                                <label
                                                    for="expire_date"
                                                    >Quantity
                                                </label>
                                                <input
                                                    value="${sessionScope.product.quantity}"
                                                    id="expire_date"
                                                    name="quantity"
                                                    type="number"
                                                    class="form-control validate"
                                                    data-large-mode="true"
                                                    />
                                            </div>
                                            <div class="form-group mb-3 col-xs-12 col-sm-6">
                                                <label
                                                    for="stock"
                                                    >Status
                                                </label>
                                                <input
                                                    value="${sessionScope.product.status}"
                                                    id="stock"
                                                    name="status"
                                                    type="text"
                                                    class="form-control validate"
                                                    required
                                                    />
                                            </div>
                                        </div>

                                    </div>
                                    <div class="col-xl-6 col-lg-6 col-md-12 mx-auto mb-4">
                                        <div class="tm-product-img-dummy mx-auto">
                                            <img class="card-img-top" src="images/${sessionScope.product.image}" width="5" height="250" alt="">
                                        </div>
                                        <div class="custom-file mt-3 mb-3">

                                            <input id="fileInput" type="file" name="file"  style="display:none;" />
                                            <input
                                                type="button"
                                                class="btn btn-primary btn-block mx-auto"
                                                value="UPLOAD PRODUCT IMAGE"
                                                onclick="document.getElementById('fileInput').click();"
                                                />
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <button type="submit" class="btn btn-primary btn-block text-uppercase">Update Product Now</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/jquery-3.3.1.min.js"></script>
        <!-- https://jquery.com/download/ -->
        <script src="jquery-ui-datepicker/jquery-ui.min.js"></script>
        <!-- https://jqueryui.com/download/ -->
        <script src="js/bootstrap.min.js"></script>
        <!-- https://getbootstrap.com/ -->
        <script>
                                                    $(function () {
                                                        $("#expire_date").datepicker();
                                                    });
        </script>

    </body>
</html>
