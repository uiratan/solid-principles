package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
    	this.validacoes = validacoes;
    }
    
    public void reajutarSalarioDoFuncionario(Funcionario funcionario, BigDecimal valorDoaumento) {
    	this.validacoes.forEach(v -> v.validar(funcionario, valorDoaumento));
    	
        BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(valorDoaumento);
        funcionario.atualizarSalario(salarioReajustado);
    }

}