/**
 * 
 */
package com.hotel.deal.dao;

import java.util.List;

import com.hotel.deal.dto.criteria.DealResultDTO;
import com.hotel.deal.dto.criteria.DealSearchCriteriaDTO;
import com.hotel.deal.exceptions.DealException;

/**
 * @author amjad_darwish
 *
 */
public interface DealDAO {
	/**
	 * 
	 * @param searchCriteriaDTO
	 * @return
	 * @throws DealException
	 */
	List<DealResultDTO> listDeals(DealSearchCriteriaDTO searchCriteriaDTO) throws DealException;
}
