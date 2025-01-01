<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
form {
	background: white;
	width:50%;
	margin:0px auto;
}

h1 {
	color: #FFF;
}
body
{
	background-color: #1e88e5;
}
#footer {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  color: white;
}
</style>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <title>Audit Response</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand text-primary" href="#"><b>AMS</b></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    
    <span class="navbar-text float-right">
      <a href="/logout">Logout</a>
    </span>
    
    &nbsp;&nbsp;&nbsp;&nbsp;
    <span class="navbar-text float-right">
      <a href="/home"><i class="fa fa-home" aria-hidden="true"></i></a>
    </span>
  </div>
  <div>
	<input class="form-control sm-2" type="search" placeholder="Search"
				aria-label="Search">
	</div>
</nav>
	<br><br>
	<center><button type="button" id="modalbtn" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
  		Check Project Status
	</button></center>
	
  <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Project Status</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <div class="container justify-content-center">
			<div align="center">
        	<table border="1" cellpadding="5">
            	<tr class="table-active">
                	<th>Execution status</th>
                	<th>Remedial Action</th>
            	</tr>	
            
                <tr id="mainTR">
                    <td id="projectStatus">${auditResponse.getProjectExecutionStatus()}</td>
                    <td id="projectAction">${auditResponse.getRemedialActionDuration()}</td>
                </tr>
            
        	</table>
        	<br>
    		</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
    
    
	<!-- <h3 class="display-4 text-center">Audit Result is ${auditResponse.getProjectExecutionStatus()}. Remedial action duration: ${auditResponse.getRemedialActionDuration() }</h1>-->
		
	</div>
	<!-- FOOTER-STARTS -->
	 <div style="padding:0.5%;background-color: #212529" id="footer">
      <div class="container">
          <div class="row">
              <div class="col-md-8 topmargin">
                  <h5 class="card-title text-white"><i class="fa fa-tasks" aria-hidden="true"></i>&nbsp; &nbsp;AMS</h5>
                  <div class="text-muted" style="color:whitesmoke;text-decoration:none;">
                  <b style="color:white">Audit Management System</b> <br>
                  AMS lets you check your project execution status by performing accurate and precise audits.
                  You just need to add up your Project Details and select preffered audit type.
                  Answer some few questions and then you are done.
                  <br>
                  Get your Project status now...!
                      
                  </div>
              </div>         

              <div class=" col-md-4 topmargin">
                  <h5 class="card-title text-white"><i class="fa fa-newspaper fa-fw" aria-hidden="true"></i>&nbsp;Feedback</h5>
                  <div class="text-muted" style="color:whitesmoke;text-decoration:none;">
                      If you have any suggestions regarding our AMS, please let us know.<br> 
                      Kindly mail us at <b>ams-pod1@gmail.com</b>
                  </div>
              </div>
          </div>
          <hr style="background-color:#777;">
          <p class="text-muted">© Copyright 2021. All Rights Reserved.</p>
      </div>
  </div>
	<!-- FOOTER-ENDS   -->

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
<script>
	$("#modalbtn").click(function(){
		var status=$("#projectStatus").html();
		var action=$("#projectAction").html();
		
		if(status=="RED")
		{
			$("#projectStatus").css({"color":"red","font-weight":"bold"});	
			$("#projectAction").css({"font-weight":"bold"});
		}
		if(status=="GREEN")
		{
			$("#projectStatus").css({"color":"green","font-weight":"bold"});
			$("#projectAction").css({"font-weight":"bold"});
		}
	});
	
	$('#myModal').on('shown.bs.modal', function () {
		var status=document.getElementById("projectStatus").value;
		var action=$("#projectAction").val();
  		console.log(status);
  		$('#myInput').trigger('focus');	
  		
	})
</script>
	
</body>

</html>

