package com.example.learn.containerizespringbootapp.repo;

import com.example.learn.containerizespringbootapp.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepo extends JpaRepository<DemoEntity,Integer> {
}
