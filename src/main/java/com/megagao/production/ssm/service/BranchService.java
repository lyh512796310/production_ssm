package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.Branch;
import com.megagao.production.ssm.domain.Department;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface BranchService {
	List<Branch> find();
	
	EUDataGridResult getList(int page, int rows ) throws Exception;
	
	Branch getBranchById(String id);
	
	CustomResult add(Branch branch);
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;
	
	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(Branch branch) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(Branch branch) throws Exception;
}
