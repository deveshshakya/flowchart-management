package com.assignment.conceptile.service;

import com.assignment.conceptile.dto.FlowchartDTO;
import com.assignment.conceptile.dto.Response;
import com.assignment.conceptile.model.Flowchart;
import com.assignment.conceptile.repo.FlowchartRepo;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowchartService {

  private final ObjectMapper mapper =
      new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

  @Autowired private FlowchartRepo flowchartRepo;

  public Response getFlowchartById(String flowchartId) {
    Optional<Flowchart> flowchart = flowchartRepo.findById(flowchartId);
    return flowchart
        .map(value -> new Response("Flowchart found.", value))
        .orElse(new Response("Flowchart not found.", null));
  }

  public Response addFlowchart(FlowchartDTO flowchartDTO) {
    Flowchart flowchart = mapper.convertValue(flowchartDTO, Flowchart.class);
    flowchartRepo.save(flowchart);
    return new Response("Flowchart created successfully.", null);
  }

  public Response updateFlowchart(String id, FlowchartDTO flowchartDTO) {
    flowchartDTO.setId(id); // setting id explicitly
    Flowchart flowchart = mapper.convertValue(flowchartDTO, Flowchart.class);
    flowchartRepo.updateFlowchart(flowchart);
    return new Response("Flowchart updated successfully.", null);
  }

  public Response deleteFlowchart(String id) {
    flowchartRepo.deleteById(id);
    return new Response("Flowchart deleted successfully.", null);
  }
}
