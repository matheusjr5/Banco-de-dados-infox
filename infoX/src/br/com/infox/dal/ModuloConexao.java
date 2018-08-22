package br.com.infox.dal;

//importação de bibliotecas e recursos para trabalhar sql no java
import java.sql.*;

public class ModuloConexao {
	public static Connection conector() {
		//metodo estatico com retorno
		//Connection -> Recurso para conexão com o banco 
		Connection conexao = null;
		String driver = "com.mysql.jdbc.Driver";
		//local: localhost ou 127.0.0.1
		//ip: do servidor de banco de dados
		//link: link do servidor (nuvens)
		String url = "jdbc:mysql://10.26.44.216:3306/dbinfox?useSSL=false";
		String user = "matheusjr";
		String password =  "123@Senac";
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(url,user,password);
			return conexao;
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
				
	}
	
}
