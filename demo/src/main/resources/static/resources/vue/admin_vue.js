"use strict"
const adminVue = {
		join:()=>{
			return `<table id="register_t">
				<tr>
				<td rowspan="4"><img alt="" src="https://www.vwa.com/rails/active_storage/blobs/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBbThzIiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--5d0a741ce5304b3bae6201e2bf0839025ea82bdc/user-profile-default.png"></td>
				<td id="text_index"><a>name</a></td>
				<td id="text_input"><input id="name" type="text" style="width:250px;height:40px"></td>
			</tr>
			<tr>
				<td><a>position</a></td>
				<td><input id= "position" type="text" style="width:250px;height:40px"></td>
			</tr>
			<tr>
				<td><a>email</a></td>
				<td><input id="email" type="text" style="width:250px;height:40px"></td>
			</tr>
			<tr>
				<td><a>phoneNumber</a></td>
				<td><input id="phoneNumber" type="text" style="width:250px;height:40px"></td>
			</tr>
			<tr>
			<td colspan="3" id="button_box">
			</td>
			</tr>
		
		</table>`
		},
		login:()=>{
			return `
			<form id="login_box">
			<label>EmployNumber</label><br> 
			<input id="employNumber" type="text" /><br> <br> 
			<label>Password</label><br> 
			<input id="password" type="text" /><br> <br> 
			</form>`
		},
		adminList : ()=>{
			return `
				<table id="adminData">
                        <tr>
                            <td>
                                <a id="number">No.</a>
                            </td>
                            <td>
                                <a id="employNumber">아이디</a>
                            </td>
                             <td>
                                <a id="name">이름</a>
                            </td>
                           <td>
                                <a id="position">직급</a>
                            </td>
                            <td>
                                <a id="email">이메일</a>
                            </td>
                            <td>
                                <a id="phoneNumber">전화번호</a>
                            </td>
                            <td>
                                <a id="registerDate">등록일자</a>
                            </td>
                        </tr>
                        
                    </table>`
		},
		adminDetail: ()=>{
			return `
			<table id="register_t">
			<tr>
			<td rowspan="6"><img alt="" src="https://www.vwa.com/rails/active_storage/blobs/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBbThzIiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--5d0a741ce5304b3bae6201e2bf0839025ea82bdc/user-profile-default.png"></td>
			<td id="text_index"><a>name</a></td>
			<td id="text_input"><span id="name" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>employNumber</a></td>
			<td><span id= "employNumber" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>position</a></td>
			<td><span id="position" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>email</a></td>
			<td><span id="email" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>phoneNumber</a></td>
			<td><span id="phoneNumber" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>registerDate</a></td>
			<td><span id="registerDate" style="width:250px;height:40px"></td>
		</tr>
	
	</table>`
		},
		lostList : ()=>{
			return `
			<table id="lostList">
            <tr>
                <td>
                    <a id="number">No.</a>
                </td>
                <td>
                    <a id="lostID">분실물 ID</a>
                </td>
                 <td>
                    <a id="itemName">습득물품명</a>
                </td>
               <td>
                    <a id="date">습득일자</a>
                </td>
                <td>
                    <a id="array">습득물분류</a>
                </td>
                <td>
                    <a id="location">습득위치(지하철)</a>
                </td>
            </tr>
            
        </table>`
		},
		lostDetail : ()=>{
			return `
			<table id="register_t">
			<tr>
			<td rowspan="5"><img alt="" src="https://cdn.icon-icons.com/icons2/1678/PNG/512/wondicon-ui-free-parcel_111208.png"></td>
			<td id="text_index"><a>lostID</a></td>
			<td id="text_input"><span id="lostID" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>itemName</a></td>
			<td><span id= "itemName" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>date</a></td>
			<td><span id="date" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>array</a></td>
			<td><span id="array" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>location</a></td>
			<td><span id="location" style="width:250px;height:40px"></td>
		</tr>
	
	</table>`
		}
}