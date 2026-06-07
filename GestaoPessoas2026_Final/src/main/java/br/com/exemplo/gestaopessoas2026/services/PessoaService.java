
package br.com.exemplo.gestaopessoas2026.services;
import br.com.exemplo.gestaopessoas2026.model.Pessoa;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class PessoaService {
 private final List<Pessoa> pessoas=new ArrayList<>();
 public PessoaService(){ pessoas.add(new Pessoa(1L,"Joao","Silva","Rua A","Masculino")); }
 public Pessoa buscarPorId(String id){ return pessoas.stream().filter(p->p.getId().equals(Long.parseLong(id))).findFirst().orElse(null);}
 public List<Pessoa> buscarTodas(){ return pessoas; }
 public Pessoa criar(Pessoa pessoa){ if(pessoa.getId()==null) pessoa.setId((long)(pessoas.size()+1)); pessoas.add(pessoa); return pessoa; }
 public Pessoa atualizar(Pessoa pessoa){ deletar(String.valueOf(pessoa.getId())); pessoas.add(pessoa); return pessoa; }
 public void deletar(String id){ pessoas.removeIf(p->p.getId().equals(Long.parseLong(id))); }
}
