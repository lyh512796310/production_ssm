package com.megagao.production.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.megagao.production.ssm.domain.Branch;
import com.megagao.production.ssm.domain.Department;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;
import com.megagao.production.ssm.mapper.BranchMapper;
import com.megagao.production.ssm.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	BranchMapper branchMapper;

	@Override
	public List<Branch> find() {
		return branchMapper.find();
	}

	@Override
	public EUDataGridResult getList(int page, int rows) throws Exception {
		
		//分页处理
		PageHelper.startPage(page, rows);
		List<Branch> list = branchMapper.find();
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<Branch> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public Branch getBranchById(String id) {
		return branchMapper.getBranchById(id);
	}

	@Override
	//添加 如果添加成功 则显示添加成功
	public CustomResult add(Branch branch) {
		int i = branchMapper.add(branch);
		if(i>0){
			return CustomResult.ok();
		}else{
		return CustomResult.build(101, "新增机构失败");
	}
	}

	@Override
	public CustomResult delete(String id) throws Exception {
			return null;
	}

	@Override
	public CustomResult deleteBatch(String[] ids) throws Exception {
		int i = branchMapper.deleteBatch(ids);
		if(i>0){
			return CustomResult.ok();
		}
		return null;
	}

	@Override
	public CustomResult update(Branch branch) throws Exception {
		int i = branchMapper.updateByPrimaryKeySelective(branch);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改部门信息失败");
		}
	}

	@Override
	public CustomResult updateAll(Branch branch) throws Exception {
		int i = branchMapper.updateByPrimaryKey(branch);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改部门信息失败");
		}
	}

	
}
