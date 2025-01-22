package com.assignment.conceptile.controller;

import com.assignment.conceptile.dto.FlowchartDTO;
import com.assignment.conceptile.dto.Response;
import com.assignment.conceptile.service.FlowchartService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/flowchart")
public class FlowchartController {

  private final FlowchartService flowchartService;

  @GetMapping("/{id}")
  public ResponseEntity<Response> findById(@PathVariable("id") String id) {
    return ResponseEntity.ok(flowchartService.getFlowchartById(id));
  }

  @PostMapping
  public ResponseEntity<Response> flowchart(@RequestBody FlowchartDTO flowchartDTO) {
    return ResponseEntity.ok(flowchartService.addFlowchart(flowchartDTO));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Response> updateFlowchart(
      @PathVariable String id, @RequestBody FlowchartDTO flowchartDTO) {
    return ResponseEntity.ok(flowchartService.updateFlowchart(id, flowchartDTO));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Response> deleteFlowchart(@PathVariable String id) {
    return ResponseEntity.ok(flowchartService.deleteFlowchart(id));
  }
}
