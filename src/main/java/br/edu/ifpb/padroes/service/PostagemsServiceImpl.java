package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.service.PostagemDAO;
import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;

public class PostagemsServiceImpl implements PostagemService {
	
    private PostagemDAO postagemDAO;
    
    public void PostagemServiceImpl(PostagemDAO postagemDAO) {
        this.postagemDAO = postagemDAO;
    }
	@Override
	public void adicionarPostagem(Postagem postagem) {
		postagemDAO.addPostagem(postagem);
		
	}

	@Override
	public void removerPostagem(Postagem postagem) {
		postagemDAO.deletePostagem(postagem);
		
	}

	@Override
	public void atualizarPostagem(Postagem postagem) {
		postagemDAO.updatePostagem(postagem);
		
	}

	@Override
	public void adicionarResposta(Postagem postagem, Postagem resposta) {
		postagemDAO.addPostagemResposta(postagem);
		
	}

}
