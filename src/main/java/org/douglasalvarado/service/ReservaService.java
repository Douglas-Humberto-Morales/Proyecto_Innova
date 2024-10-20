package org.douglasalvarado.service;

import org.douglasalvarado.model.Reserva;
import org.douglasalvarado.repository.ReservaRepository;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@Service
public class ReservaService implements ReservaRepository {
    private HashMap<Long, Reserva> reservas = new HashMap<>();
    private Long idCounter = 1L;

    @Override
    public Reserva createReserva(Reserva reserva) {
        reserva.setId(idCounter++);
        reservas.put(reserva.getId(), reserva);
        return reserva;
    }

    @Override
    public Reserva getReserva(Long id) {
        return reservas.get(id);
    }

    @Override
    public List<Reserva> getAllReservas() {
        return new ArrayList<>(reservas.values());
    }

    @Override
    public Reserva updateReserva(Long id, Reserva reserva) {
        reservas.put(id, reserva);
        return reserva;
    }

    @Override
    public void deleteReserva(Long id) {
        reservas.remove(id);
    }
}
