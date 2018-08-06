package com.lsy0318.util;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public abstract class AbstractDAO<E, K> implements GenericDAO<E, K> {

	@Inject
	protected SqlSession session;

	protected String NAME;

	@Override
	public int create(String mapperId, E vo) throws Exception {
		return session.insert(NAME + "." + mapperId, vo);

	}

	@Override
	public E read(String mapperId, K key) throws Exception {
		return session.selectOne(NAME + "." + mapperId, key);
	}

	@Override
	public int update(String mapperId, E vo) throws Exception {
		return session.update(NAME + "." + mapperId, vo);

	}

	@Override
	public int delete(String mapperId, K key) throws Exception {
		return session.delete(NAME + "." + mapperId, key);
	}

	@Override
	public List<E> readList(String mapperId) throws Exception {
		return session.selectList(NAME + "." + mapperId);
	}

}
