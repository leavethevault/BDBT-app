package bdbt_proj;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

class PocztyDAOTest {

	private PocztyDAO dao;

	@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL1");
		datasource.setUsername("SYSTEM");
		datasource.setPassword("mA4YBUw!!!");
		datasource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		dao = new PocztyDAO(new JdbcTemplate(datasource));
	}

	@Test
	void testList() {
		List<Poczty> listPoczty = dao.list();
		assertFalse(listPoczty.isEmpty());
	}

	@Test
	void testSave() {
		fail("Not yet implemented");
	}

	@Test
	void testGet() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
