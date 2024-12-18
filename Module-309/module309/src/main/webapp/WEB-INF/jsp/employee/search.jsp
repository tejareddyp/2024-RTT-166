<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../include/header.jsp"/>

<html>
<head>
    <title>Title</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>

    <link href="/pub/css/global.css" rel="stylesheet"/>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .table-striped-custom tbody tr:nth-of-type(odd) {
            background-color: #fcf4d9;
        }
        .table-striped-custom tbody tr:nth-of-type(even) {
            background-color: #e6f7ff;
        }
    </style>
</head>
<body>
    <h1>Employee</h1>

    <section class="bg-light1 pt-5 pb-5">
        <div class="container" >
            <form action="/employee/search" class="mb-0">
                <div class="row pt-3 justify-content-center">
                    <div class="col-6">

                        <div class="mb-3">
                            <label for="firstName" class="form-label">First Name</label>
                            <input type="text" class="form-control" id="firstName" name="firstName">
                        </div>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-6">
                        <button type="submit" class="btn btn-primary">Search</button>
                    </div>
                </div>
            </form>
        </div>
    </section>

    <c:if test="${employees.size() > 0 }" >
        <section>
            <div class=" container bg-light-2 pt-2 pb-2 mx-0">
                <h2 class="text-center pt-5">Employees Found(${employees.size()})</h2>

                <table class="table table-striped mt-5">
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>id</th>

                    </tr>
                    <c:forEach var="employee" items="${employees}">
                        <tr>
                            <td>${employee.firstName}</td>
                            <td>${employee.lastName}</td>
                            <td>${employee.id}</td>
                        </tr>
                    </c:forEach>
                </table>

            </div>
        </section>
    </c:if>

</body>
</html>
