"use strict"

var admin = admin || {}

admin = (() => {
	let init = () => {
		onCreate()
	}
	let onCreate = () => {
		setContentView()
		$.getJSON('/users', d => {
			$.each(d, (i, j) => {
				$(`<tr> 
                        	<td>
                                <span>${i+1}</span>
                            </td>
                            <td>
                                <span>${j.userid}</span>
                            </td>
                            <td>
                                <span><a href="#">${j.name}</a></span>
                            </td>
                             <td>
                                <span>${j.ssn}</span>
                            </td>
                           <td>
                                <span>${j.email}</span>
                            </td>
                            <td>
                                <span>${j.phoneNumber}</span>
                            </td>
                            <td>
                                <span>${j.registerDate}</span>
                            </td>
                            
                        </tr0.appendTo('#userData')
                        $(<a>${j.name}</a>)
                        .appendTo('#user_name')
                        .click( e =>{
                        	e.preventDefault()
                        })alert('') 
			})
		})
	}
	let setContentView = () => {
		$('#userData tr').first().css({'background-color':'yellow'})
	}
	return {init}
	
})()