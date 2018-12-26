package com.xmg.p2p.base.mapper;

import com.xmg.p2p.base.domain.Logininfo;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LogininfoMapper {

    int insert(Logininfo record);

    Logininfo selectByPrimaryKey(Long id);

    List<Logininfo> selectAll();

    int updateByPrimaryKey(Logininfo record);

	int getCountByUsername(String username);

	Logininfo login(@Param("username")String username, @Param("password")String encode, @Param("userType") int userType);

	/**
	 * 按照类型查询用户数量
	 * @param userManager
	 * @return
	 */
	int countByUserType(int userManager);
}