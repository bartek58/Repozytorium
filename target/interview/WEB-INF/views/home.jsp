<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){

$('#buttonHello').click(function(){

 
$.ajax({
	type : 'POST',
	url : '/interview/spring/helloajax',
	success : function(data){
	$('.result').html(data);
			}
		});
	});
	
	$('.listjson').click(function(){

 var kolumna= $('#kolumna').val(); 

 
$.ajax({
	type : 'GET',
	header : {
	Accept:"application/json; charset=utf-8",
	"Content-Type":"application/json; charset=UTF-8"
	},
	data: {kolumna: kolumna},
	url : '/interview/spring/listjson',
	success : function(data){
	var result= "";
	for(var i=0;i<data.length;i++)
	result+="<br>"+data[i].kolumna1+' - '+data[i].kolumna2;
	$('.result').html(result);
			}
		});
	});
	
	
});



</script>

<html>
<head>
	<title>Home</title>
</head>
<body>

<form>
<input type="button" value="Hello" id="buttonHello">
<select id="kolumna" name="kolumna">
 <option value="kolumna1">kolumna1</option>
 <option value="kolumna2">kolumna2</option>
 <option value="kolumna3">kolumna3</option>
 <option value="kolumna4">kolumna4</option>
</select>
<br>
<input type="button" class="listjson" value="JSON list">
<div class="result"></div>
</form>


<h1> 
	
</h1>
</body>
</html>
