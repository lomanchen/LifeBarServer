package com.banshan.lifebarServer.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.banshan.lifebarServer.model.SgUserPower;

public interface SgUserPowerService{
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public abstract List<SgUserPower> findUserId(long pagerId);
	/*public abstract void save(SgPagerInfo sgPagerInfo);

	public abstract void delete(long pagerId);

	public abstract void update(SgPagerInfo sgPagerInfo);

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public abstract SgPagerInfo findByPagerId(long pagerId);

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public abstract List<SgPagerInfo> findAll(int offset, int pagesize);*/

}