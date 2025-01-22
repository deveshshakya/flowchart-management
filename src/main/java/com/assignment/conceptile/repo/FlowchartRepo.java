package com.assignment.conceptile.repo;

import com.assignment.conceptile.model.Flowchart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowchartRepo extends CrudRepository<Flowchart, String> {
  Flowchart updateFlowchart(Flowchart flowchart);
}
