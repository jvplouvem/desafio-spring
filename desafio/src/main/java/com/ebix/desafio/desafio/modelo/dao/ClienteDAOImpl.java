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
	
	public class ClienteRowMapper implements RowMapper<Cliente> {	
		@Override
		public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
			Cliente cliente = new Cliente();
			cliente.setId(rs.getLong("id"));
			cliente.setNome(rs.getString("nome"));
			
			return cliente;
		}		
	}
	
	@Override
	public void criar(Cliente cliente) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO cliente ");
		sql.append("VALUES(?)");
		
		jdbcTemplate.update(sql.toString(), cliente.getNome());
	}
	
	@Override
	public void alterar(Cliente cliente) {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE cliente ");
		sql.append("SET nome = ? ");
		sql.append("WHERE id = ? ");
		
		jdbcTemplate.update(sql.toString(), cliente.getNome(), cliente.getId());
	}
	
	@Override
	public void excluir(Long id) {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM  cliente ");
		sql.append("WHERE id = ? ");
		
		jdbcTemplate.update(sql.toString(), id);
	}
	
	@Override
	public Cliente obterPorId(Long id) {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM cliente");
		sql.append("WHERE id = ? ");
		
		Cliente cliente = jdbcTemplate.queryForObject(sql.toString(), new ClienteRowMapper());
		return cliente;
	}
	
	@Override
	public List<Cliente> getClientes() {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM cliente");
		
		List<Cliente> clientes = jdbcTemplate.query(sql.toString(), new ClienteRowMapper());
		return clientes;
	}
	
}