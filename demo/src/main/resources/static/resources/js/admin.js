"use strict"

var admin = admin || {}

admin = (() => {
	const WHEN_ERROR = `호출하는 js 파일을 찾지 못했습니다.`
	let admin_vue
	let user_vue
		
	let init = () => {
		admin_vue = `/resources/vue/admin_vue.js`
		user_vue = `/resources/vue/user_vue.js`
		onCreate()
	}
	
	let onCreate = () => {
		$.when(
				$.getScript(admin_vue),
				$.getScript(user_vue)
		).done(()=>{
			setContentView()
			$('#user_list_a').click(e=>{
				e.preventDefault()
				location.href="/admin"
			})
			
			$.getJSON('/users', d => {
				$.each(d, (i, j) => {
					$('#total_count').text('총 회원 수 : ' + d.length)
					$(`<tr>
	                        	<td>
	                                <span>${i+1}</span>
	                            </td>
	                            <td>
	                                <span>${j.userid}</span>
	                            </td>
	                            <td>
	                                <span id=${j.name}></span>
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
	                            
	                        </tr>`).appendTo('#userData')
	                        
	                        $(`<a>${j.name}</a>`)
	                        .appendTo(`#${j.name}`)
	                        .css({cursor:'pointer',color:'blue'})
	                        .click(e=>{
	                        	e.preventDefault()
	                        	$('#userData').empty()
	                        	$(userView.detail()).appendTo('#userData')
	                        	$.getJSON(`/users/${j.userid}`, d=>{
	                        		$('#name').text(d.name)
	                        		$('#userid').text(d.userid)
	                        		$('#ssn').text(d.ssn)
	                        		$('#address').text(d.address)
	                        		$('#email').text(d.email)
	                        		$('#phoneNumber').text(d.phoneNumber)
	                        		$('#registerDate').text(d.registerDate)
	                        	})
	                        })
				})
			})
			
			$('#admin_list_a').click(e=>{
				e.preventDefault()
				$('#userData').empty()
				$(adminVue.adminList())
				.appendTo('#userData')
				
				$.getJSON('/admins',d=>{
					$.each(d, (i,j)=>{
						$(`<tr>
	                        	<td>
	                                <span>${i+1}</span>
	                            </td>
	                            <td>
	                                <span>employNumber</span>
	                            </td>
	                            <td>
	                                <span id=${j.name}></span>
	                            </td>
	                             <td>
	                                <span>${j.position}</span>
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
	                            
	                        </tr>`)
	                        .appendTo(`#adminData`)
	                        
	                        $(`<a>${j.name}</a>`)
	                        .appendTo(`#${j.name}`)
	                        .css({cursor:'pointer',color:'blue'})
	                        .click(e=>{
	                        	e.preventDefault()
	                        	$('#userData').empty()
	                        	$(adminVue.adminDetail()).appendTo('#userData')
	                        	$.getJSON(`/admins/${j.employNumber}`, d=>{
	                        		$('#name').text(d.name)
	                        		$('#employNumber').text(d.employNumber)
	                        		$('#position').text(d.position)
	                        		$('#email').text(d.email)
	                        		$('#phoneNumber').text(d.phoneNumber)
	                        		$('#registerDate').text(d.registerDate)
	                        	})
	                        })
					})
				})
				
			})
			
			$('#lost_list_a').click(e=>{
				e.preventDefault()
				$('#userData').empty()
				$(adminVue.lostList())
				.appendTo('#userData')
				$.getJSON('/losts',d=>{
					$.each(d,(i,j)=>{
						$(`<tr>
	                        	<td>
	                                <span>${i+1}</span>
	                            </td>
	                            <td>
	                                <span id=${j.lostID}></span>
	                            </td>
	                            <td>
	                                <span>${j.itemName}</span>
	                            </td>
	                             <td>
	                                <span>${j.date}</span>
	                            </td>
	                           <td>
	                                <span>${j.array}</span>
	                            </td>
	                            <td>
	                                <span>${j.location}</span>
	                            </td>	                            
	                        </tr>`).appendTo(`#lostList`)
	                        
	                        $(`<a>${j.lostID}</a>`)
	                        .css({cursor:'pointer',color:'blue'})
	                        .appendTo(`#${j.lostID}`)
	                        .click(e=>{
	                        	$('#userData').empty()
	                        	$(adminVue.lostDetail()).appendTo('#userData')
	                        	$.getJSON(`/losts/${j.lostID}`,d=>{
	                        		$('#lostID').text(`${j.lostID}`)
	                        		$('#itemName').text(`${j.itemName}`)
	                        		$('#date').text(`${j.date}`)
	                        		$('#array').text(`${j.array}`)
	                        		$('#location').text(`${j.location}`)
	                        	})
	                        })
					})
				})
			})
			
		}).fail(()=>{
			alert(WHEN_ERROR)
		})
		
	}
	let setContentView = () => {
		$('#userData tr').first().css({'background-color':'yellow'})
	}
	return {init}
	
})()