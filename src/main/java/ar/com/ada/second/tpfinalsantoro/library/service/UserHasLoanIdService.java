package ar.com.ada.second.tpfinalsantoro.library.service;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.UserHasLoanIdDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.UserHasLoanId;

import java.util.List;

public class UserHasLoanIdService implements Services <UserHasLoanIdDTO, UserHasLoanId>{
    @Override
    public UserHasLoanIdDTO createNew(UserHasLoanIdDTO dto) {
        return null;
    }

    @Override
    public List<UserHasLoanIdDTO> getAll() {
        return null;
    }

    @Override
    public UserHasLoanIdDTO getById(Long id) {
        return null;
    }

    @Override
    public UserHasLoanIdDTO update(UserHasLoanIdDTO dto, Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void mergeData(UserHasLoanId entity, UserHasLoanIdDTO dto) {

    }
}
