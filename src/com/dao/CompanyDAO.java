package com.dao;

import com.model.Company;

public interface CompanyDAO 
{
	boolean insertCompany(Company a);
	boolean updateCompany(Company a);
	boolean deleteCompany(String id);
}
