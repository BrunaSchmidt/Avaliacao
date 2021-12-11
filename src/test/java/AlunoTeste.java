import jdk.jfr.ValueDescriptor;
import org.junit.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Field;

public class AlunoTeste {

    Aluno aluno = new Aluno();

    @Test
    public void testaSetter(){

        aluno.setNome("joao");
        aluno.setIdade(27);

        Assert.assertNotNull(aluno.getNome());
        Assert.assertNotNull(aluno.getIdade());
        Assert.assertEquals("joao", aluno.getNome());
        Assert.assertEquals(27, aluno.getIdade());
    }

    @Test
    public void testaGetter(){

        aluno.setNome("maria");
        aluno.setIdade(50);

        String dadoNome = aluno.getNome();
        int dadoIdade = aluno.getIdade();

        Assert.assertNotNull(dadoNome);
        Assert.assertNotNull(dadoIdade);
        Assert.assertEquals("maria", dadoNome);
        Assert.assertEquals(50, dadoIdade);

    }

}
