package com.mydomain.clients.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydomain.clients.backend.apirest.models.dao.IClientDao;
import com.mydomain.clients.backend.apirest.models.entity.Client;

@Service
public class ClientServiceImpl implements IClientService {
	@Autowired
	private IClientDao clientDao;

	@Override
	@Transactional(readOnly = true)
	public List<Client> findAll() {
		return (List<Client>) clientDao.findAll();
	}

}
