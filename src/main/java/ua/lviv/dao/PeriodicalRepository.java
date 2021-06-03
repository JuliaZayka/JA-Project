package ua.lviv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.domain.Periodical;


public interface PeriodicalRepository extends JpaRepository<Periodical, Integer>{
}
