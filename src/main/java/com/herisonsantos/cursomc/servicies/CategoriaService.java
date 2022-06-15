package com.herisonsantos.cursomc.servicies;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herisonsantos.cursomc.domain.Categoria;
import com.herisonsantos.cursomc.repositories.CategoriaRepository;
import com.herisonsantos.cursomc.servicies.exceptions.ObjectNotFoundException;



@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	
		public Categoria Buscar(Integer id)   {
		Optional<Categoria> obj =repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objetnão encontrado! Id:"+ id +", Tipo: "+Categoria.class.getName()));

		}
}
