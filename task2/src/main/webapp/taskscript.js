$(document).ready(function () {
    CallServlet();
});


function CallServlet(){
	
	
$.ajax({
		
        type: "get",
        url:  'TaskServlet',
        datatype: "JSON",
        catche: false,
        contentType: "application/json; charset=utf-8",
        success: function (response) {
	
        	var jsonvalue=JSON.parse(response);
       	$("#product_id").text(jsonvalue.productid)
        $("#product_title").text(jsonvalue.product_tt)
        //$("#product_img").attr(jsonvalue.product_image)
        $("#product_img").append("<img src='"+jsonvalue.product_image+"' />")
        $("#product_availability").text(jsonvalue.product_avail)
      
        $("#product_desc").text(jsonvalue.product_description)
        
        if(jsonvalue.product_avail == "In stock"){
			    $("#product_price").text(jsonvalue.product_cost)
		        $("#product_delcharge").text(jsonvalue.product_del+ " Rs. Delievery charge")
        }
    
        },
	
	});

}