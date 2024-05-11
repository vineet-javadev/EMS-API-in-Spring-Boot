<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Management System</title>
</head>
<body>
    <h1>Employee Management System</h1>

    <form action="EyController" method="post">
        <label for="employeeId">Employee ID:</label>
        <input type="text" id="employeeId" name="employeeId"><br><br>

        <label for="employeeName">Employee Name:</label>
        <input type="text" id="employeeName" name="employeeName"><br><br>

        <label for="employeePosition">Employee Position:</label>
        <input type="text" id="employeePosition" name="employeePosition"><br><br>

        <label for="employeeSalary">Employee Salary:</label>
        <input type="text" id="employeeSalary" name="employeeSalary"><br><br>

        <input type="submit" value="empManagement">
    </form>
</body>
</html>
