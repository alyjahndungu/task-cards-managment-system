package com.logicea.cards.domain.repositories;

import com.logicea.cards.domain.entities.Cards;
import com.logicea.cards.domain.entities.Users;
import org.apache.catalina.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {
    Page<Cards> findCardsByUsers(Users users, Pageable pageable);

    List<Cards> findCardsByNameContainsIgnoreCase(String searchName);
    Cards findCardsByUsersAndId(Users users, Long id);
}
