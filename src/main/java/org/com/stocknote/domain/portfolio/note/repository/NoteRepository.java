package org.com.stocknote.domain.portfolio.note.repository;

import org.com.stocknote.domain.portfolio.note.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
  List<Note> findByPortfolioNo(Long portfolioNo);
}
