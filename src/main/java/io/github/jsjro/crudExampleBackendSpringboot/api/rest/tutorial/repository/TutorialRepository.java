package io.github.jsjro.crudExampleBackendSpringboot.api.rest.tutorial.repository;

import io.github.jsjro.crudExampleBackendSpringboot.api.rest.tutorial.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);
}