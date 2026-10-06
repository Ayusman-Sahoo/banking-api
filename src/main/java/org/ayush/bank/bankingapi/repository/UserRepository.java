package org.ayush.bank.bankingapi.repository;

import org.ayush.bank.bankingapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
