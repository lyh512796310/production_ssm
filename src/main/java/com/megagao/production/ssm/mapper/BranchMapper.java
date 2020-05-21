package com.megagao.production.ssm.mapper;

import java.util.List;

import com.megagao.production.ssm.domain.Branch;

public interface BranchMapper {
	List<Branch> find();
	
	Branch getBranchById(String id);
	
	int add(Branch branch);
	
	int deleteBatch(String[] ids);
	
	Branch selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(Branch branch);

	int updateByPrimaryKey(Branch branch);
}
