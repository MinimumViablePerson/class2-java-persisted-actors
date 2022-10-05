package com.peristed.actors.persistedactors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {
  @Autowired
  private ActorRepository actorRepository;

  @GetMapping("/actors")
  public List<Actor> getActors() {
    return actorRepository.findAll();
  }

  @PostMapping("/actors")
  public Actor createActor(@RequestBody Actor actor) {
    Actor newActor = actorRepository.save(actor);
    return newActor;
  }

}

interface ActorRepository extends JpaRepository<Actor, Integer> {
}