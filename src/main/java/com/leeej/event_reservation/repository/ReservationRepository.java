package com.leeej.event_reservation.repository;

import com.leeej.event_reservation.model.Reservation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Page<Reservation> findByEventId(Long eventId, Pageable pageable);
}
