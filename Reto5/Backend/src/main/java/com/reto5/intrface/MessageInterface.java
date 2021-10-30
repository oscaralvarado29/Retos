package com.reto3.intrface;

import com.reto3.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageInterface extends CrudRepository<Message,Integer>  {
}
