package jwd.wafepa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jwd.wafepa.model.KupovinaPiva;

@Repository
public interface KupovinaPivaRepository extends JpaRepository<KupovinaPiva, Long>{

}
