package cz.mka.impl.dao;

import cz.mka.impl.jpa.DrinkerDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Martin Kaspar on 26/02/2017.
 */
public interface DrinkerDao extends JpaRepository<DrinkerDTO, Long> {

}
