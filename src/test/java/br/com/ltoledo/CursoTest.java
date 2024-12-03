/**
 *
 */
package test.java.br.com.ltoledo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.java.br.com.ltoledo.dao.CursoDao;
import main.java.br.com.ltoledo.dao.ICursoDao;
import main.java.br.com.ltoledo.domain.Curso;

/**
 * @author ludmyla.toledo
 *
 */
public class CursoTest {

    private ICursoDao cursoDao;

    public CursoTest() {
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrar() {
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("CURSO TESTE");
        curso.setNome("Curso de Java Backend");
        curso = cursoDao.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}