package com.wwj.ticketsMgrSysCarProv_8888.service;

import java.util.List;

import com.yueqian.ticketsMgr_domain_9000.domain.sysMgr.CarVO;

public interface CarService {
	/**
	 * 获取所有车辆
	 */
	public List<CarVO> getCars();
	/**
	 * 获取指定车辆信息
	 */
	public CarVO getCarById(int vehicleId);
	/**
	 * 注册车辆
	 */
	public boolean addCar(CarVO car);
	/**
	 * 修改车辆信息
	 */
	public boolean modifyCar(CarVO car);
	/**
	 * 删除指定车辆
	 */
	public boolean deleteCarById(int vehicleId);
}
