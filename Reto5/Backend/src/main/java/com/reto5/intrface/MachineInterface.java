package com.reto3.intrface;

import com.reto3.model.Machine;
import org.springframework.data.repository.CrudRepository;

public interface MachineInterface extends CrudRepository<Machine,Integer> {
}
