package com.ebix.desafio.desafio.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ebix.desafio.desafio.modelo.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Cliente> getClientes() {
		StringBuilder sql = new StringBuilder();
		
		
		List<Cliente> clientes = jdbcTemplate.query(sql.toString(), new ClienteRowMapper());
		return clientes;
	}
	
	public class ClienteRowMapper implements RowMapper<Cliente> {

		@Override
		public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
			Cliente cliente = new Cliente();
			cliente.setNome(rs.getString("nome"));
			
			return cliente;
		}
		
	}
}