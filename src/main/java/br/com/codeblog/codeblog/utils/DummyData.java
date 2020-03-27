package br.com.codeblog.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.codeblog.codeblog.model.Post;
import br.com.codeblog.codeblog.repository.CodeBlogRepository;

@Component
public class DummyData {

	@Autowired
	CodeBlogRepository codeBlogRepository;
	
	//@PostConstruct
	public void sevePost() {
		
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("João Victor");
		post1.setData(LocalDate.now());
		post1.setTitulo("Java");
		post1.setTexto("Java é uma linguagem de programação orientada a objetos desenvolvida na década de 90 por uma equipe de programadores chefiada por James Gosling, na empresa Sun Microsystems. Em 2008 o Java foi adquirido pela empresa Oracle Corporation. Diferente das linguagens de programação modernas, que são compiladas para código nativo, a linguagem Java é compilada para um bytecode que é interpretado por uma máquina virtual (Java Virtual Machine, mais conhecida pela sua abreviação JVM). A linguagem de programação Java é a linguagem convencional da Plataforma Java, mas não é a sua única linguagem. J2ME Para programas e jogos de computador, celular, calculadoras, ou até mesmo o rádio do carro.");
		
		Post post2 = new Post();
		post2.setAutor("João Victor");
		post2.setData(LocalDate.now());
		post2.setTitulo("MySQL");
		post2.setTexto("O MySQL é um sistema de gerenciamento de banco de dados (SGBD), que utiliza a linguagem SQL (Linguagem de Consulta Estruturada, do inglês Structured Query Language) como interface. É atualmente um dos sistemas de gerenciamento de bancos de dados mais populares[1] da Oracle Corporation, com mais de 10 milhões de instalações pelo mundo Entre os usuários do banco de dados MySQL estão: NASA, Friendster, Banco Bradesco, Dataprev, HP, Nokia, Sony, Lufthansa, U.S. Army, U.S. Federal Reserve Bank, Associated Press, Alcatel, Slashdot, Cisco Systems, Google, entre outros.");
		
		postList.add(post1);
		postList.add(post2);
		
		for (Post post : postList) {
			Post postSave = codeBlogRepository.save(post);
			System.out.println(postSave.getId());
		}
	}
}
