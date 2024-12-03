/**
 *
 */
package main.java.br.com.ltoledo.dao;

import java.util.List;

import main.java.br.com.ltoledo.domain.Curso;

/**
 * @author ludmyla.toledo
 *
 */
public interface ICursoDao {

    public Curso cadastrar(Curso curso);

    public void excluir(Curso cur);

    public List<Curso> buscarTodos();
}