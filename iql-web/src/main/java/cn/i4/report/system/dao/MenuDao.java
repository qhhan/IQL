package cn.i4.report.system.dao;

import java.util.List;

import cn.i4.report.system.domain.Menu;
import cn.i4.report.system.domain.User;

public interface MenuDao {

	public List<Menu> findAllMenuList();

	public Integer findCount();

	public Integer addMenu(Menu menu);

	public Integer updateMenu(Menu menu);

	public Integer delMenu(Menu menu);

	public List<Menu> findMenuListByUid(User user);

	public Menu findMenuById(Menu menu);

	public List<Menu> findMenuByPid(Menu menu);

}
