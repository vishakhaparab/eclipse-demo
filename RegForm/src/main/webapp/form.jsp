<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@include file="form_header.jsp" %>

<div class="container pt-1">
        <div class="col-lg-5 mx-auto shadow p-0 mt-4"  style="background-color: rgba(164, 209, 164, 0.788);">
            <div class="alert alert-primary rounded-0 m-auto text-center h4" >Registration form</div>
            <p class="h6 pt-3 pb-4 mb-0 text-center" style="background-color: rgba(164, 209, 164, 0.788);">Complete the form below and press the submit button!</p>
                <form class="form-control border-0 ps-4 pe-4 mb-4" method="post" onsubmit="return Validateform()" style="background-color: rgba(164, 209, 164, 0.788);">
                    <input type="text" class="form-control mb-3" name="name" id="name" placeholder="Full Name*" onkeypress="return (event.charCode > 64 && event.charCode < 91) || (event.charCode> 96 && event.charCode < 123) || (event.charCode==32)">
                    <input type="text" class="form-control mb-3" name="fname" id="fathername" placeholder="Father's Name*" onkeypress="return (event.charCode > 64 && event.charCode < 91) || (event.charCode> 96 && event.charCode < 123) || (event.charCode==32)">
                    <input type="text" class="form-control mb-3" name="email" id="email" placeholder="Email Address*">
                    <input type="text" class="form-control mb-3" onfocus="this.type='date'" name="date" id="date" placeholder="Date of Birth*">
                            
                   
                    <p class="h6 mt-3">Select Your Country <span class="text-danger">*</span></p>
                    <select class="form-select mb-3" name="country" onchange="Countrycode()" id="country">
                        <option value="select">Select country</option>
                        <option value="AU">Australia</option>
                        <option value="AS">Austria</option>
                        <option value="BR">Brazil</option>
                        <option value="CA">Canada</option>
                        <option value="CH">China</option>
                        <option value="DN">Denmark</option>
                        <option value="FR">France</option>
                        <option value="IN" selected>India</option>
                        <option value="UK">UK</option>
                        <option value="US">USA</option>
                    </select>

                    <p class="h6 mt-3">Enter Your phone number <span class="text-danger">*</span></p>
                    <div class="d-flex flex-row">
                        <input type="text" class="form-control mb-3 me-2" id="phone" name="phone" style="width: 20%;" readonly />
                        <input type="text" class="form-control mb-3" id="phoneno" name="phoneno" maxlength="10" placeholder="Phone Number">
                    </div>

                    <p class="h6 mt-3">Select Your Gender  <span class="text-danger">*</span></p>
                    <div class="d-flex flex-row align-items-center">
                        <input type="radio" name="gender" id="male" value="Male" class="form-check mb-3 ms-3">
                        <label for="male" class="form-label mb-3 ms-2">Male</label>
                        <input type="radio" name="gender" id="female" value="Female" class="form-check mb-3 ms-5">
                        <label for="female" class="form-label mb-3 ms-2">Female</label>
                        <input type="radio" name="gender" id="others" value="Other" class="form-check mb-3 ms-5">
                        <label for="others" class="form-label mb-3 ms-2">Other</label>
                    </div>

                    <p class="h6 mt-3">Enter ID card number in given format <span class="text-danger">*</span></p>
                    <div class="d-flex">
                        <input type="text" class="form-control me-2" name="num1" id="num1" maxlength="5" placeholder="#####" style="width: 40%;">
                        <input type="text" class="form-control me-2" name="num2" id="num2" maxlength="7" placeholder="#######" style="width: 60%;">
                        <input type="text" class="form-control" name="num3" id="num3" maxlength="1" placeholder="#" style="width: 10%;">
                    </div>

                    <div class="d-flex flex-row justify-content-evenly mt-4 mb-3">
                        <button class="btn btn-danger" name="save">Submit Form</button>
                        <button class="btn btn-info" type="reset" >Clear Fields</button>
                    </div>
                </form>

                
        </div>
    </div>	

<%@include file="form_footer.jsp" %>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"></script>

 
 

