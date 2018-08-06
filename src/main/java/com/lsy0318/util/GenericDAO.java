package com.lsy0318.util;

import java.util.List;

public interface GenericDAO<E, K> {

	public int create(String mapperId, E vo) throws Exception;

	public E read(String mapperId, K key) throws Exception;

	public int update(String mapperId, E vo) throws Exception;

	public int delete(String mapperId, K key) throws Exception;

	public List<E> readList(String mapperId) throws Exception;

}
