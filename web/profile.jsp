
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="css/profile.css" rel="stylesheet" type="text/css"/>
<link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>
<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js'></script>
<link href='https://cdnjs.cloudflare.com/ajax/libs/MaterialDesign-Webfont/3.6.95/css/materialdesignicons.css'>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<title>Profile</title>

<div class="page-content page-container" id="page-content">
    <div class="padding">
        <div class="row container d-flex justify-content-center">
            <div class="col-xl-6 col-md-12">
                <div class="card user-card-full">
                    <div class="row m-l-0 m-r-0">
                        
                        <form action="profile" method="post">
                            <div class="col-sm-4 bg-c-lite-green user-profile">
                                <div class="card-block text-center text-white">

                                    <div class="m-b-25"> <img src="https://img.icons8.com/bubbles/100/000000/user.png" class="img-radius" alt="User-Profile-Image"> </div>
                                    <h3 class="f-w-600">${user.name}
                                    <a  href="home">Home</a></h3>
                                    <p>Web Designer</p> <i class=" mdi mdi-square-edit-outline feather icon-edit m-t-10 f-16"></i>
                                </div>
                            </div>
                            <div class="col-sm-8">
                                <div class="card-block">
                                    <h2 class="m-b-20 p-b-5 b-b-default f-w-600">Information</h2>
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <p class="m-b-10 f-w-600">User ID</p>
                                            <h6 class="text-muted f-w-400"> 
                                                ${user.userId}</h6>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="m-b-10 f-w-600">Address</p>
                                            <h6 > <input type="text" name="address" value="${user.address}" /></h6>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="m-b-10 f-w-600">Email</p>
                                            <h6 > <input type="text" name="email" value="${user.email}" /></h6>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="m-b-10 f-w-600">Role</p>
                                            <h6>${user.roleId}</h6>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="m-b-10 f-w-600">Create Date</p>
                                            <h6 class="text-muted f-w-400">${user.create_date}</h6>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="m-b-10 f-w-600">Active Code</p>
                                            <h6 class="text-muted f-w-400">${user.active_code}</h6>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="m-b-10 f-w-600">Phone</p>
                                            <h6 > <input type="text" name="phone" value="${user.phone}" /></h6>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="m-b-10 f-w-600">Password</p>
                                            <h6 > <input type="password" name="pass" value="${user.password}" /></h6>
                                        </div>
                                        <div class="col-sm-6">
                                            <p class="m-b-10 f-w-600">Status</p>
                                            <h6 class="text-muted f-w-400">${user.status}</h6>
                                        </div>
                                    </div>

                                </div>                          
                            </div>
                                        <input type="submit" value="Save" />
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>