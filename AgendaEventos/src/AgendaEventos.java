import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
  private Map<LocalDate, Evento> agenda;

  public AgendaEventos() {
    this.agenda = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    this.agenda.put(data, new Evento(nome, atracao));
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agenda);
    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      System.out.println("Evento na data: " + entry.getKey() + "=" +
          entry.getValue().toString());
    }
  }

  public void obterProximoEvento() {
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;

    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agenda);
    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      LocalDate dataEvento = entry.getKey();
      if (dataAtual.equals(dataEvento) || dataEvento.isAfter(dataAtual)) {
        proximaData = dataEvento;
        proximoEvento = entry.getValue();
        System.out.println("Proximo evento na data: " + proximaData + "=" +
            proximoEvento.toString());
        break;
      }
    }

  }
}
