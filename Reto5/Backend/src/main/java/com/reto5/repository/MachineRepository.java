package com.reto3.repository;

import java.util.List;
import java.util.Optional;

import com.reto3.intrface.MachineInterface;
import com.reto3.model.Machine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Oscar Alvarado
 */
@Repository
public class MachineRepository {
    @Autowired
    private MachineInterface machineInterface;

    /**
     * Select
     * @return
     */
    public List<Machine> getAll(){
        return (List<Machine>) machineInterface.findAll();
    }

    /**
     * select by id
     * @param id
     * @return
     */
    public Optional<Machine> getMachine(int id){
        return machineInterface.findById(id);
    }

    /**
     * Insert
     * @param machine
     * @return
     */
    public Machine save(Machine machine){
        return machineInterface.save(machine);
    }

    /**
     * Delete
     * @param machine
     */
    public void delete(Machine machine){
        machineInterface.delete(machine);
    }
}
