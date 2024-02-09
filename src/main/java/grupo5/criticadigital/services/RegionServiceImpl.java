package grupo5.criticadigital.services;

import grupo5.criticadigital.models.Region;
import grupo5.criticadigital.repositories.RegionRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class RegionServiceImpl implements RegionService{

    @Override
    public List<Region> obtenerRegion() {
        return RegionRepository.findAll();
    }
}