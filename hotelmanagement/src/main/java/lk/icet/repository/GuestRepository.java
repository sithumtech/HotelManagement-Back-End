package lk.icet.repository;

import lk.icet.entity.GuestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<GuestEntity,Integer> {
}
