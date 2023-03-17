package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, boolean metaAtingida) {
		Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
		if (cargoAtual == Cargo.GERENTE) {
			throw new ValidacaoException("Gerentes n�o podem ser promovidos!");
		}

		if (!metaAtingida) {
			throw new ValidacaoException("Funcion�rio n�o bateu a meta!");
		}

		Cargo novoCargo = cargoAtual.getProximoCargo();
		funcionario.promover(novoCargo);

	}
}
