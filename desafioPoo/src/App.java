import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Criação dos cursos
        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso Python");
        cursoPython.setDescricao("Descrição curso Python");
        cursoPython.setCargaHoraria(10);

        Curso cursoHtml = new Curso();
        cursoHtml.setTitulo("Curso HTML");
        cursoHtml.setDescricao("Descrição curso HTML");
        cursoHtml.setCargaHoraria(5);

        // Criação da mentoria
        Mentoria mentoriaPython = new Mentoria();
        mentoriaPython.setTitulo("Mentoria de Python");
        mentoriaPython.setDescricao("Descrição mentoria Python");
        mentoriaPython.setData(LocalDate.now());

        // Criação do Bootcamp
        Bootcamp bootcampFullStack = new Bootcamp();
        bootcampFullStack.setNome("Bootcamp Full Stack");
        bootcampFullStack.setDescricao("Descrição Bootcamp Full Stack");
        bootcampFullStack.getConteudos().add(cursoPython);
        bootcampFullStack.getConteudos().add(cursoHtml);
        bootcampFullStack.getConteudos().add(mentoriaPython);

        // Criação e inscrição de Devs
        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcampFullStack);
        System.out.println("Conteúdos Inscritos " + devAna.getNome() + ": " + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devAna.getNome() + ": " + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devAna.getNome() + ": " + devAna.getConteudosConcluidos());
        System.out.println("XP: " + devAna.calcularTotalXp());
        System.out.println("-------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcampFullStack);
        System.out.println("Conteúdos Inscritos " + devPedro.getNome() + ": " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devPedro.getNome() + ": " + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devPedro.getNome() + ": " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());
        System.out.println("-------");

    }

}