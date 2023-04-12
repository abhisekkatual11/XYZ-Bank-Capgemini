<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration | Draft Details</title>
</head>
<body>
	<hr>
	<form action="registration_draft_details" method="post">
	<h2 align="center">Registration | Draft Details</h2>
		<table align="center">
			<tr>
				<td><hr></td>
				<td><hr></td>
			</tr>
			<tr>
				<td>
					<label for="transaction_id"> Enter Transaction ID	:~</label>
				</td>
				<td>
					<input id="transaction_id" type="number" placeholder="enter transaction id" name="transaction_id">
				</td>
			</tr>
			<tr>
				<td>
					<label for="customer_name"> Enter Customer Number	:~</label>
					
				</td>
				<td>
					<input id="customer_name" type="text" placeholder="Enter Customer Number" name="customer_name">
				</td>
			</tr>
			<tr>
				<td>
					<label for="in_favor_of"> In Favor of	:~</label>
				</td>
				<td>
					<input id="in_favor_of" type="text" placeholder=" in favor of" name="in_favor_of">
				</td>
			</tr>
			<tr>
				<td>
					<label for="phone_number"> Enter Phone Number	:~</label>
				</td>
				<td>
					<input id="phone_number" type="tel" placeholder=" enter phone number" name="phone_number">
				</td>
			</tr>
			<tr>
				<td>
					<label for="date_of_transaction"> Enter Date of Transaction	:~</label>
				</td>
				<td>
					<input id="date_of_transaction" type="date" placeholder=" enter date of transaction" name="date_of_transaction">
				</td>
			</tr>
			<tr>
				<td>
					<label for="dd_amount"> Enter DD Amount	:~</label>
				</td>
				<td>
					<input id="dd_amount" type="number" placeholder=" Enter dd amount" name="dd_amount">
				</td>
			</tr>
			<tr>
				<td>
					<label for="dd_commission"> Enter DD Commission	:~</label>
				</td>
				<td>
					<input id="dd_commission" type="number" placeholder="enter dd commission" name="dd_commission">
				</td>
			</tr>
			<tr>
				<td>
					<label for="dd_description"> Enter DD Description	:~</label>
				</td>
				<td>
					<input id="dd_description" type="text" placeholder=" enter dd description" name="dd_description">
				</td>
			</tr>
			<tr>
				<td>
					<label for="remarks"> Enter Remarks	:~</label>
				</td>
				<td>
					<input id="remarks" type="text" placeholder=" enter remarks" name="remarks">
				</td>
			</tr>
			<tr>
				<td><hr></td>
				<td><hr></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register!!!"></td>
			</tr>
		</table>
	</form>
	<hr>
</body>
</html>