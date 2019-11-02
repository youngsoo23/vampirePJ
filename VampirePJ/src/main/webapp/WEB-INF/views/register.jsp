<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Register</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">
<script type="text/javascript">
	$(document).ready(function() {
		$('#repwd').blur(function() {
			var user_pass = $('#pwd').val();
			var reUser_Pass = $('#repwd').val();
			if (user_pass != reUser_Pass) {
				$.ajax({
					url : 'register.do?user_pass=' + user_pass,
					type : 'GET',
					dataType : "text",
					success : function(object) {
						$("#pw_check").text("   비밀번호가 일치하지 않습니다 ");
						$("#pw_check").css("color", "red");
						$("#register").attr("disabled", true);
					}
				})
			} else {
				$.ajax({
					url : 'register.do?user_pass=' + user_pass,
					type : 'GET',
					dataType : "text",
					success : function(object) {
						$("#pw_check").text("사용가능한 비밀번호입니다.");
						$("#pw_check").css("color", "blue");
						$("#register").attr("disabled", false);
					}
				})
			}
		})
	})
</script>

</head>

<body class="bg-gradient-primary">

	<div class="container">

		<div class="card o-hidden border-0 shadow-lg my-5">
			<div class="card-body p-0">
				<!-- Nested Row within Card Body -->
				<div class="row">
					<div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
					<div class="col-lg-7">
						<div class="p-5">
							<div class="text-center">
								<h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
							</div>
							<form class="user" method="POST" action="userInsert.do">
								<div class="form-group">
									<input type="text" class="form-control form-control-user"
										id="user_id" name="user_id" placeholder="User ID" required>
								</div>
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input type="password" id="pwd" name="pwd" class="form-control form-control-user"
											id="exampleInputPassword" placeholder="Password" required>
									</div>
									<div class="col-sm-6">
										<input type="password" id="repwd" name="repwd" class="form-control form-control-user"
											id="exampleRepeatPassword" placeholder="Repeat Password" required>
									</div>
									<div id="pw_check"></div>
								</div>
								<div class="form-group">
									<input type="text" class="form-control form-control-user"
										id="name" name="name" placeholder="Your name" required>
								</div>
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input type="text" class="form-control form-control-user"
											id="age" name="age" placeholder="AGE" required>
									</div>
									<div class="col-sm-6">
									  <input type="radio" name="gender" id="Male" value="M" required /> 남자 
									  <br> 
									  <input type="radio" name="gender" id="Female" value="F" required /> 여자 
									</div>
								</div>
								<div class="form-group">
									<input type="email" class="form-control form-control-user"
										id="exampleInputEmail" placeholder="Email@example.com">
								</div>
								<input type="submit" id="register" class="btn btn-primary btn-user btn-block" value="Register Account"/>
							</form>
							<hr>
							<div class="text-center">
								<a class="small" href="forgot-password.html">Forgot
									Password?</a>
							</div>
							<div class="text-center">
								<a class="small" href="login.do">Already have an account?
									Login!</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin-2.min.js"></script>

</body>

</html>
