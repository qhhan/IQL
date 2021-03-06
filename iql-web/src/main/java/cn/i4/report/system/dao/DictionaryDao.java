package cn.i4.report.system.dao;

import java.util.List;

import cn.i4.report.system.domain.Dictionary;
import cn.i4.report.system.vo.DictionaryVo;

public interface DictionaryDao {

	public void save(Dictionary dictionary);
	
	public void update(Dictionary dictionary);
	
	public void remove(Integer id);
	
	public Integer findCount();
	
	public List<Dictionary> findDictionaryList(DictionaryVo vo);

	public Dictionary findfindDictionaryByName(DictionaryVo vo);
	
}
