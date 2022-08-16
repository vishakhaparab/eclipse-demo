	$(document).ready(function () {
	    Countrycode();
	});

    function Countrycode() {
    var y = document.getElementById("country").value;
    
    if (y == "Select country") {
        document.getElementById("phone").value = "";
    } else if (y === "AU") {
        document.getElementById("phone").value = "+61";
    } else if (y === "AS") {
        document.getElementById("phone").value = "+43";
    } else if (y === "BR") {
        document.getElementById("phone").value = "+51";
    } else if (y === "CA") {
        document.getElementById("phone").value = "+1";
    } else if (y === "CH") {
        document.getElementById("phone").value = "+86";
    } else if (y === "DN") {
        document.getElementById("phone").value = "+45";
    } else if (y === "FR") {
        document.getElementById("phone").value = "+33";
    } else if (y === "IN") {
        document.getElementById("phone").value = "+91";
    } else if (y === "UK") {
        document.getElementById("phone").value = "+44";
    } else if (y === "US") {
        document.getElementById("phone").value = "+1";
    }
}

function Validateform(){

        var Fields = "";
        var a = document.getElementById("name").value;
        var b = document.getElementById("fathername").value; 
        var c = document.getElementById("email").value;  

     	var d = document.getElementById("date").value;

        var j = document.querySelector("#country");
        var k = j.options[j.selectedIndex].text;

        var l = document.getElementById("phoneno").value;
        var r = document.getElementById("phone").value;

       // var m = document.querySelector("[name=gender]:checked");
        var n = $('input[name="gender"]:checked').val();
        var o = document.getElementById("num1").value;
        var p = document.getElementById("num2").value;
        var q = document.getElementById("num3").value;
        var pattern = /^([a-zA-Z0-9_\.\-\+])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

        if (a.trim() == "") {
          Fields = "Please Enter Your First Name!!\n";
        } else if(a[0].toUpperCase() != a[0]){
          Fields = "Enter first letter capital for name\n"
        } 

        if (b.trim() == "") {
          Fields += "Please Enter Your Father Name!!\n";
        } else if(b[0].toUpperCase() != b[0]){
          Fields = "Enter first letter capital for father's name!\n"
        }

        if (c.trim() == "") {
          Fields += "Please Enter Your Email Id!\n";
        } else if(!pattern.test($('#email').val())){
          Fields += "Enter valid Email ID\n";
        }

        if (d.trim() == ""){
          Fields += "Please Enter Your Date of birth!\n";
        }

        if (l.trim() == "") {
          Fields += "Please Enter Your Phone No!\n";
        }

        if (o.trim() == "" || p.trim() == "" || q.trim() == "") {
          Fields += "Please Enter Your Id Card No!\n";
        }

            if (Fields != "") {
                alert(Fields);
                return false;
            } else {
                var IdCardNo = o + "  " + p + "  " + q;
                

                var mailbody = "%20Your Name:%20" + a + "%0D%0A Father Name:%20" + b + "%0D%0A Email:%20" + c + "%0D%0A Date Of Birth:%20" + d + "%0D%0A Country:%20" + k + "%0D%0A Phone Number:%20" + r + l + "%0D%0A Gender:%20" + n + "%0D%0A Id Card No:%20" + IdCardNo;

                location.href = "mailto:" + c + "?cc=vishakha@siliconinterfaces.com&subject=Registration Form Details&body=" + mailbody + "%0D%0A%20Thanks," + "%0D%0A%20Team.";
                return true;
            }
    }
    
   