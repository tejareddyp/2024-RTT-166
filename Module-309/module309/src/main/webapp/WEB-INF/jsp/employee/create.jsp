<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../include/header.jsp"/>

<section class="bg-light-2 pt-5 pb-5">
    <div class="container">
        <div class="row">
            <h1 class="m-0 text-center">Create Employee</h1>
        </div>
    </div>
</section>

<section class="bg-light1 pt-5 pb-5">
    <div class="container">
        <form action="/employee/createEmployee">
            <div class="mb-3 row justify-content-center" >
                <label for="firstName" class="col-sm-2 col-form-label">First Name</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="firstName" name="firstName" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <label for="lastName" class="col-sm-2 col-form-label">Last Name</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="lastName" name="lastName" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <label for="email" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="email" class="form-control" id="email" name="email" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <label for="jobTitle" class="col-sm-2 col-form-label">Job Title</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="jobTitle" name="jobTitle" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <label for="reportsTo" class="col-sm-2 col-form-label">Reports To</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="reportsTo" name="reportsTo" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <div class="col-sm-12 col-lg-8">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>

