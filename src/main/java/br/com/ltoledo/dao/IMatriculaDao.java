/**
 *
 */
package main.java.br.com.ltoledo.dao;

import java.util.List;

import main.java.br.com.ltoledo.domain.Curso;
import main.java.br.com.ltoledo.domain.Matricula;

/**
 * @author ludmyla.toledo
 *
 */
public interface IMatriculaDao {

    Matricula cadastrar(Matricula mat);

    Matricula buscarPorCodigoCurso(String codigoCurso);

    Matricula buscarPorCurso(Curso curso);

    Matricula buscarPorCodigoCursoCriteria(String codigoCurso);

    Matricula buscarPorCursoCriteria(Curso curso);

    List<Matricula> buscarTodos();

    void excluir(Matricula matricula);
}