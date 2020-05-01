"use strict"
var user = user || {}
user = (()=>{
	let init = () => {
		onCreate()
	}
	let onCreate = () =>{
		setContentView()
		$('#register_a').click(e=>{
	     	e.preventDefault()
	     	location.href = "/admin"
	     })
	     $('#access_a').click(e=>{
	    	 
	     })
		
	}
	let setContentView = () =>{
		$('#kcdc').css({ width: '80%', height: '900px' }).addClass('border_black center')
	     $('#tr_1').css({ width: '80%', height: '50px' }).addClass('border_black center')
	     $('#menu').css({ width: '80%', height: '50px' }).addClass('border_black center')
	     $('#kcdc td').addClass('border_black', 'width_full')
	     $('#container').css({ width: '80%', height: '900px' }).addClass('border_black center')
	     $('#container tr').addClass('border_black')
	     $('#container tr td').addClass('border_black')
	     $('#register-button').click(e => {
	       e.preventDefault()
	       location.href = "admin/register.html"
	     })
	     $('#access-button').click(e=>{
	       e.preventDefault()
	       $.ajax({
	         url : '',
	         type : '',
	         data : JSON.stringify({

	         }),
	         dataType : 'json',
	         contentType : 'application/json',
	         success : d=>{

	         },
	         error : (r, x, e) => {
	           (r.status)
	         }
	       })
	     })

	}
	return {init}
	
})()