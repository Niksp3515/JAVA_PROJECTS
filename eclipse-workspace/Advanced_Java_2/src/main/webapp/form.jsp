<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
       td{
        padding: 6px;
       }
    </style>
    <script>
        function CheckFname(){
            var f = document.insert.fname.value;
            var reg = /^[A-Za-z]+$/;
            if (f == "") {
                document.getElementById("fname").innerHTML="*Please Enter First Name";
                document.getElementById("fname").style.color="red";
            }
            else if(!reg.test(f)){
                document.getElementById("fname").innerHTML="*Please Enter Only AlphaBets";
                document.getElementById("fname").style.color="red";
            }
            else{
                document.getElementById("fname").innerHTML="";
            }
        }
        function CheckLname(){
            var f = document.insert.lname.value;
            var reg = /^[A-Za-z]+$/;
            if (f == "") {
                document.getElementById("lname").innerHTML="*Please Enter First Name";
                document.getElementById("lname").style.color="red";
            }
            else if(!reg.test(f)){
                document.getElementById("lname").innerHTML="*Please Enter Only AlphaBets";
                document.getElementById("lname").style.color="red";
            }
            else{
                document.getElementById("lname").innerHTML="";
            }
        }

        // function CheckEmail(){
        //     var email = document.insert.email.value;
        //     var reg = /^([A-za-z0-9]+)@([a-z])()()$/
        // }
        
    </script>
</head>
<body>
    <form name="insert">
    <table>
        <tr>
            <td>Fname : </td>
            <td><input type="text" name="fname" onblur="CheckFname()"></td>
            <td><span id="fname" ></span></td>
        </tr>
        <tr>
            <td>Lname : </td>
            <td><input type="text" name="lname" onblur="CheckLname()" ></td>
            <td><span id="lname"></span></td>
        </tr>
        <tr>
            <td>Email : </td>
            <td><input type="text" name="email"></td>
            <td><span id="email"></span></td>
        </tr>
        <tr>
            <td>Mobile : </td>
            <td><input type="text" name="mobile"></td>
            <span id="mobile"></span>
        </tr>
        <tr>
            <td>Address : </td>
            <td><textarea name="address" cols="23" rows="5"></textarea></td>
        </tr>
        <tr>
            <td>Gender : </td>
            <td><input type="radio" name="gender" value="male">Male
            <input type="radio" name="gender" value="female">Female</td>
        </tr>
        <tr>
            <td>Education : </td>
            <td><select name="education">
                <option value="select">---Select---</option>
                <option value="10th">10th</option>
                <option value="12th">12th</option>
                <option value="be">BE</option>
                <option value="btech">BTech</option>
            </select></td>

        </tr>
        <tr>
            <td>Hobby : </td>
            <td>
                <input type="checkbox" name="hobby" value="music">Music <br>
                <input type="checkbox" name="hobby" value="reading">Reading
                <input type="checkbox" name="hobby" value="travelling">Travelling
                <input type="checkbox" name="hobby" value="cricket">Cricket
            </td>
        </tr>
        <tr>
            <td>Birth Date : </td>
            <td><input type="date" name="bdate"></td>
        </tr>
        <tr>
            <td>Birth Time : </td>
            <td><input type="time"></td>
        </tr>
        <tr>
            <td>Resume</td>
            <td><input type="file" name="resume"></td>
        </tr>
        <tr>
            <td>Password : </td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>Confirm Password : </td>
            <td><input type="password" name="cpassword"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="SUBMIT" name="action"></td>
        </tr>
    </table>
</form>
</body>
</html>