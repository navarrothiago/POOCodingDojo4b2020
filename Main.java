import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import junit.framework.JUnit4TestAdapter;
// This section declares all of the test classes in your program.
@RunWith(Suite.class)
@Suite.SuiteClasses({
   semana1.Exemplo.class,
   semana1.Questao1.class
   // Add test classes here.
})


public class Main {
  public static void main(String[] args) {
    System.out.println("Iniciando testes...");
    // org.junit.runner.JUnitCore.main("S1Q1");
    // org.junit.runner.JUnitCore.main("semana1.Exemplo");
    // org.junit.runner.JUnitCore.main("semana1.Exercicio1");
    // org.junit.runner.JUnitCore.main("semana1.Exercicio1");
    junit.textui.TestRunner.run(new JUnit4TestAdapter(Main.class));

  }
}