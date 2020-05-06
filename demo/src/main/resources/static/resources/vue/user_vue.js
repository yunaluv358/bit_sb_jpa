"use strict"
const userView = {
		detail:()=>{
			return `<table id="user_detail">
				<tr>
				<td rowspan="7"><img alt="" src="https://www.vwa.com/rails/active_storage/blobs/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBbThzIiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--5d0a741ce5304b3bae6201e2bf0839025ea82bdc/user-profile-default.png"></td>
				<td id="text_index"><a>name</a></td>
				<td id="text_input"><span id="name" style="width:250px;height:40px"></td>
			</tr>
			<tr>
				<td><a>userid</a></td>
				<td><span id= "userid" style="width:250px;height:40px"></td>
			</tr>
			<tr>
				<td><a>ssn</a></td>
				<td><span id="ssn" style="width:250px;height:40px"></td>
			</tr>
			<tr>
				<td><a>address</a></td>
				<td><span id="address" style="width:250px;height:40px"></td>
			</tr>
			<tr>
				<td><a>email</a></td>
				<td><span id="email" style="width:250px;height:40px"></td>
			</tr>
			<tr>
				<td><a>phoneNubmer</a></td>
				<td><span id="phoneNumber" style="width:250px;height:40px"></td>
			</tr>
			<tr>
				<td><a>registerDate</a></td>
				<td><span id="registerDate" style="width:250px;height:40px"></td>
			</tr>
		
		</table>`
		}
}