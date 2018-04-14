package com.project.cloud.as.repository;

import com.project.cloud.as.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account,String> {
    public Account findAccountById(String firstName);
}
