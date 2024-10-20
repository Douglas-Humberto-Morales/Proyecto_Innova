package org.douglasalvarado.repository;

import org.douglasalvarado.model.Reserva;

import java.util.List;

public interface ReservaRepository {
    Reserva createReserva(Reserva reserva);
    Reserva getReserva(Long id);
    List<Reserva> getAllReservas();
    Reserva updateReserva(Long id, Reserva reserva);
    void deleteReserva(Long id);
}
