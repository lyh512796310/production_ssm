<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="branchEditForm" class="branchForm" method="post">
		<input type="hidden" name="id"/>
	    <table cellpadding="5">
	        <tr>
	            <td>机构名称:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="name" 
	            		data-options="required:true"/>
    			</td>  
	        </tr>
	        <tr>
	            <td>部门简称:</td>
	            <td>
	               <input class="easyui-textbox" type="text" name="short_name" 
	            		data-options="required:true"/>
	            </td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitDepartmentEditForm()">提交</a>
	</div>
</div>
<script type="text/javascript">
	var branchEditEditor ;
	
	$(function(){
		//实例化富文本编辑器
		branchEditEditor = TAOTAO.createEditor("#branchEditForm [name=note]");
	});
	//同步kindeditor中的内容
//	branchEditEditor.sync();
	
	function submitDepartmentEditForm(){
		$.get("branch/edit_judge",'',function(data){
    		if(data.msg != null){
    			$.messager.alert('提示', data.msg);
    		}else{
    			if(!$('#branchEditForm').form('validate')){
    				$.messager.alert('提示','表单还未填写完成!');
    				return ;
    			}
    			//branchEditEditor.sync();
    			
    			$.post("branch/update_all",$("#branchEditForm").serialize(), function(data){
    				if(data.status == 200){
    					$.messager.alert('提示','修改部门成功!','info',function(){
    						$("#branchEditWindow").window('close');
    						$("#branchList").datagrid("reload");
    					});
    				}else{
    					$.messager.alert('提示', data.msg);
    				}
    			});
    		}
    	});
	}
</script>
