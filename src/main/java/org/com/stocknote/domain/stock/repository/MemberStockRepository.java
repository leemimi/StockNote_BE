package org.com.stocknote.domain.stock.repository;

import org.com.stocknote.domain.member.entity.Member;
import org.com.stocknote.domain.stock.entity.MemberStock;
import org.com.stocknote.domain.stock.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberStockRepository extends JpaRepository<MemberStock, Long> {
    List<MemberStock> findByMemberId(Long memberId);
    List<MemberStock> findByStockCode(String stockCode);

    boolean existsByMemberAndStock (Member member, Stock stock);

    List<MemberStock> findByMemberEmailOrderByAddedAtDesc (String email);
}
