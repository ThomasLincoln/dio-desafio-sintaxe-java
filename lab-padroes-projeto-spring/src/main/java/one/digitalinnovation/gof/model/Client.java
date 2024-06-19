package one.digitalinnovation.gof.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @ManyToOne
  private Endereco endereco;
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Endereco getEndereco() {
    return endereco;
  }
  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
  public Client(Long id, Endereco endereco) {
    this.id = id;
    this.endereco = endereco;
  }
  
}
